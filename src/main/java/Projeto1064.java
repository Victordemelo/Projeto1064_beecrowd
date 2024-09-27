/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author victo
 */
import java.util.Scanner;

public class Projeto1064 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double media = 0;
        int positivos = 0;

        for (int i = 0; i < 6; i++) {
            double X = leitor.nextDouble();

            if (X > 0) {
                positivos++;
                media += X;
            }

        }
        media = media / positivos;
        System.out.println(positivos + " valores positivos");
        System.out.printf("%.1f\n", media);
    }
}
