package br.com.file.analytic.processos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LeituraArquivo {

    public static List<String> leArquivo(String caminho) throws IOException {

        return Files.readAllLines(Path.of(caminho));

    }

}
