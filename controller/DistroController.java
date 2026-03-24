package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DistroController {

    // 1) Método privado para identificar o SO
    private String os() {
        return System.getProperty("os.name").toLowerCase();
    }

    // 2) Método para exibir a distribuição Linux
    public void exibeDistro() {
        String sistema = os();

        try {
            if (sistema.contains("linux")) {

                // comando para ler o arquivo da distro
                String comando = "cat /etc/os-release";

                Process p = Runtime.getRuntime().exec(comando);
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(p.getInputStream())
                );

                String linha;
                String nome = "";
                String versao = "";

                while ((linha = reader.readLine()) != null) {

                    if (linha.startsWith("NAME=")) {
                        nome = linha.split("=")[1].replace("\"", "");
                    }

                    if (linha.startsWith("VERSION=")) {
                        versao = linha.split("=")[1].replace("\"", "");
                    }
                }

                System.out.println("Distribuição Linux: " + nome);
                System.out.println("Versão: " + versao);

            } else {
                System.out.println("Este sistema não é Linux.");
            }

        } catch (Exception e) {
            System.out.println("Erro ao obter distribuição: " + e.getMessage());
        }
    }
}