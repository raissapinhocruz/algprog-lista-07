/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista074;

/**
 *
 * @author 326142585
 */
public class Lista074 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] temperaturas = {
            {28.5, 30.2, 31.0, 29.8},
            {29.1, 35.4, 32.5, 30.0},
            {31.2, 33.0, 37.8, 32.1},
            {30.5, 31.8, 34.0, 34.2}
        };

        double maiorTemperatura = temperaturas[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;

        double somaDiagonal = 0;

        // Percorre a matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                // Encontra a maior temperatura
                if (temperaturas[i][j] > maiorTemperatura) {
                    maiorTemperatura = temperaturas[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }

            // Soma os elementos da diagonal principal
            somaDiagonal += temperaturas[i][i];
        }

        double mediaDiagonal = somaDiagonal / 4;

        System.out.println(
            "Maior temperatura: " + maiorTemperatura + " graus"
        );

        System.out.println(
            "Posicao: linha " + linhaMaior
            + ", coluna " + colunaMaior
        );

        System.out.println(
            "Media da diagonal principal: " + mediaDiagonal
        );
    } // TODO code application logic here
    }
    

