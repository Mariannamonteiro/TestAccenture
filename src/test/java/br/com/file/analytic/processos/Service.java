package br.com.file.analytic.processos;

import br.com.file.analytic.entidades.Venda;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Service {

    public static int idVendaMaisCara(List<Venda> listaVenda) {

        double maiorValor = 0.0;
        int idMaiorVenda = 0;

        for (Venda venda : listaVenda) {

            if (venda.getTotal() > maiorValor) {
                maiorValor = venda.getTotal();
                idMaiorVenda = venda.getIdVenda();
            }
        }
        return idMaiorVenda;
    }

    public static String nomePiorVendedor(List<Venda> listaVenda) {

        double menorValor = Double.MAX_VALUE;
        String nomePiorVendedor = "";

        String nomeVendedor = "";
        double valorVenda = 0.0;
        double valorTotalVendedor = 0.0;

        Map<String, Double> totalVendasVendedor = new HashMap<String, Double>();

        for (Venda venda : listaVenda) {

            nomeVendedor = venda.getNomeVendedor();
            valorVenda = venda.getTotal();

            if (totalVendasVendedor.containsKey(nomeVendedor)) {
                valorTotalVendedor = valorVenda + totalVendasVendedor.get(nomeVendedor);
                totalVendasVendedor.put(nomeVendedor, valorTotalVendedor);
            } else {

                totalVendasVendedor.put(nomeVendedor, valorVenda);
            }

        }

        Set<String> chavesNomes = totalVendasVendedor.keySet();
        for (String nome : chavesNomes) {

            if (totalVendasVendedor.get(nome) < menorValor) {
                menorValor = totalVendasVendedor.get(nome);
                nomePiorVendedor = nome;
            }
        }

        return nomePiorVendedor;

    }

}
