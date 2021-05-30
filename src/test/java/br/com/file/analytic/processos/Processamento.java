package br.com.file.analytic.processos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Processamento {

    public static void listFiles(File diretorio, String caminho) throws IOException {

        List<String> dados = new ArrayList<String>();
        String path = caminho;
        String[] arquivos = diretorio.list();

        String caminhoDir = "";

        for (String campo : arquivos) {
            caminhoDir = path + "\\" + campo;
            dados = LeituraArquivo.leArquivo(caminhoDir);
            ProcessaArquivo.processaLinha(dados, campo);

        }

    }

}
