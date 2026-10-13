/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista072;

/**
 *
 * @author 326142585
 */
public class Lista072 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[][] conteudos = {
            {0, 1, 0, 2, 1},
            {1, 0, 2, 0, 0},
            {2, 1, 1, 0, 2},
            {0, 0, 1, 2, 1},
            {1, 2, 0, 1, 0}
        };

        int seguros = 0;
        int suspeitos = 0;
        int nocivos = 0;

        // Conta os tipos de conteudo
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (conteudos[i][j] == 0) {
                    seguros++;
                } else if (conteudos[i][j] == 1) {
                    suspeitos++;
                } else if (conteudos[i][j] == 2) {
                    nocivos++;
                }
            }
        }

        System.out.println("Conteudos seguros: " + seguros);
        System.out.println("Conteudos suspeitos: " + suspeitos);
        System.out.println("Conteudos nocivos: " + nocivos);

        // Substitui conteudos nocivos por -1
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (conteudos[i][j] == 2) {
                    conteudos[i][j] = -1;
                }
            }
        }

        // Exibe a matriz atualizada
        System.out.println("\nMatriz atualizada:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(conteudos[i][j] + " ");
            }
            System.out.println();
        }
    
    }
    
}
