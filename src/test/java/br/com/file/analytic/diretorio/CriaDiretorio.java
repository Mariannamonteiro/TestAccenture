package br.com.file.analytic.diretorio;

import java.io.File;

public class CriaDiretorio {

    public static void createDirectory(String directoryName) {
        File homeDirectory = new File(System.getProperty("user.home"));
        File newDirectory = new File(homeDirectory, directoryName);
        if (!newDirectory.exists()) {
            boolean result = newDirectory.mkdir();

            if (result) {
                System.out.println("directory is created !");
            }
        } else {
            System.out.println("directory already exist");
        }
    }

    public static void createSubDirectory(String subDirectoryName, String caminho) {
        File homeDirectory = new File(caminho);
        File newDirectory = new File(homeDirectory, subDirectoryName);
        if (!newDirectory.exists()) {
            boolean result = newDirectory.mkdir();

            if (result) {
                System.out.println("subdirectory is created !");
            }
        } else {
            System.out.println("subdirectory already exist");
        }
    }

}
