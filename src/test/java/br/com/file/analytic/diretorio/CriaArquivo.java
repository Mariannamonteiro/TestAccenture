package br.com.file.analytic.diretorio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class CriaArquivo {

    public static void newFile(String nomeArquivo, int qtdVendedores, int qtdClientes, int idVendaMaisCara, String nomePiorVendedor) throws IOException {

        File homePath = new File(System.getProperty("user.home"));
        String pathFolderDataOut = "\\data\\out\\";
        String allPath = homePath + pathFolderDataOut;
        File file = new File(allPath + "out-" + nomeArquivo);

        if (!file.exists() || file.exists()) {
            file.createNewFile();
            FileWriter fw = new FileWriter(file);

            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Relatório de Saída do arquivo:  " + nomeArquivo + ".");
            bw.write(" \n");
            bw.write("\nQuantidade de Vendedores: " + qtdVendedores);
            bw.write("\nQuantidade de Clientes: " + qtdClientes);
            bw.write("\nID venda mais cara: " + idVendaMaisCara);
            bw.write("\nNome pior vendedor: " + nomePiorVendedor);
            bw.write("\n\nÚltima atualização: " + LocalDateTime.now());

            bw.close();
            fw.close();

        }
    }
}
