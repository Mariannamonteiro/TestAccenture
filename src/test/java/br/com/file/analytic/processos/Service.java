package br.com.file.analytic.processos;

import br.com.file.analytic.entidades.Venda;
import java.util.List;

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
        String vendedor = "";
        for (Venda venda : listaVenda) {

            if (venda.getTotal() < menorValor) {
                menorValor = venda.getTotal();
                nomePiorVendedor = venda.getNomeVendedor();
            }
        }
        return nomePiorVendedor;

    }

}
