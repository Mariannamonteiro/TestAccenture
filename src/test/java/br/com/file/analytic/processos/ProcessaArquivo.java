package br.com.file.analytic.processos;

import br.com.file.analytic.diretorio.CriaArquivo;
import br.com.file.analytic.entidades.Cliente;
import br.com.file.analytic.entidades.Item;
import br.com.file.analytic.entidades.Venda;
import br.com.file.analytic.entidades.Vendedor;
import java.util.ArrayList;
import java.util.List;

public class ProcessaArquivo {

    public static void processaLinha(List<String> dados, String nomeArquivo) {

        try {

            int quantidadeVendedores = 0;
            int quantidadeClientes = 0;
            int idVendaMaisCara = 0;
            String nomePiorVendedor = "";

            List<Venda> listaVenda = new ArrayList<Venda>();

            for (String linha : dados) {

                String[] colunas = linha.split("ç");

                if (colunas[0].equals("001")) {

                    int codigo = Integer.parseInt(colunas[0]);
                    String cpf = colunas[1];
                    String name = colunas[2];
                    double salary = Double.parseDouble(colunas[3]);
                    Vendedor vendedor = new Vendedor(codigo, cpf, name, salary);

                    quantidadeVendedores = quantidadeVendedores + 1;

                } else if (colunas[0].equals("002")) {

                    int codigo = Integer.parseInt(colunas[0]);
                    String cnpj = colunas[1];
                    String nome = colunas[2];
                    String business = colunas[3];

                    Cliente cliente = new Cliente(codigo, cnpj, nome, business);

                    quantidadeClientes = quantidadeClientes + 1;

                } else {

                    int codigo = Integer.parseInt(colunas[0]);
                    int idVenda = Integer.parseInt(colunas[1]);
                    String dadosItem = colunas[2];
                    String nomeVendedor = colunas[3];

                    //destrinchar os dados do item dentro dos colchetes
                    String[] infoItem = dadosItem.split(",");
                    String[] camposItem = null;
                    double totalVenda = 0.0;

                    for (String campo : infoItem) {

                        camposItem = campo.split("-");

                        int idItem = Integer.parseInt(camposItem[0].replace("[", ""));

                        int itemQuantity = Integer.parseInt(camposItem[1]);
                        double itemPrice = Double.parseDouble(camposItem[2].replace("]", ""));
                        double valorPorItem = itemQuantity * itemPrice;

                        Item item = new Item(idItem, itemQuantity, itemPrice, valorPorItem);

                        totalVenda = totalVenda + valorPorItem;

                    }

                    Venda venda = new Venda(codigo, idVenda, nomeVendedor, totalVenda);
                    listaVenda.add(venda);

                }

                idVendaMaisCara = Service.idVendaMaisCara(listaVenda);
                nomePiorVendedor = Service.nomePiorVendedor(listaVenda);

            }

            CriaArquivo.newFile(nomeArquivo, quantidadeVendedores, quantidadeClientes, idVendaMaisCara, nomePiorVendedor);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
