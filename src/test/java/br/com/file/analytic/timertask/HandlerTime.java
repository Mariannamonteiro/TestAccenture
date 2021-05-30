package br.com.file.analytic.timertask;

import br.com.file.analytic.diretorio.CriaDiretorio;
import br.com.file.analytic.processos.Processamento;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

public class HandlerTime {

    public static void ExecutarSistema() {

        int delay = 5000;   // delay de 5 seg.
        int interval = 1000;  // intervalo de 1 seg.
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                try {
                    CriaDiretorio.createDirectory("data");

                    File homepath = new File(System.getProperty("user.home"));

                    String pathFolderData = homepath + "\\data";

                    //criando  subs
                    CriaDiretorio.createSubDirectory("in", pathFolderData);
                    CriaDiretorio.createSubDirectory("out", pathFolderData);

                    // passando diretorio e caminho p varrer
                    String pasta = "\\data\\in";
                    String caminho = homepath + pasta;
                    File diretorio = new File(caminho);
                    Processamento.listFiles(diretorio, caminho);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }, delay, interval);

    }
}
