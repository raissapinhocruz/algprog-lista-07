/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista.pkg07;

/**
 *
 * @author 326142585
 */
public class Lista07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double[][] emissoes = {
            {10.5, 12.0, 11.3, 14.2},
            {8.4, 9.1, 10.2, 11.0},
            {15.0, 13.5, 14.8, 16.1},
            {7.2, 8.0, 7.5, 9.3}
        };

        // Calcula o total de cada filial
        for (int i = 0; i < 4; i++) {
            double total = 0;

            for (int j = 0; j < 4; j++) {
                total += emissoes[i][j];
            }

            System.out.println(
                "Total de emissoes da filial " + (i + 1)
                + ": " + total + " toneladas"
            );
        }

        // Encontra o trimestre com maior emissao
        double maiorEmissao = 0;
        int trimestreMaior = 0;

        for (int j = 0; j < 4; j++) {
            double totalTrimestre = 0;

            for (int i = 0; i < 4; i++) {
                totalTrimestre += emissoes[i][j];
            }

            System.out.println(
                "Total do trimestre " + (j + 1)
                + ": " + totalTrimestre
            );

            if (j == 0 || totalTrimestre > maiorEmissao) {
                maiorEmissao = totalTrimestre;
                trimestreMaior = j + 1;
            }
        }

        System.out.println(
            "Trimestre com maior emissao: " + trimestreMaior
        );
        System.out.println("Emissao total: " + maiorEmissao);
    }
    
}
