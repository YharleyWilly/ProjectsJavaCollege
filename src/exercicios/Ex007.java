package exercicios;

/*
 * Construa um algoritmo que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1,y1) e
 * P(x2,y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é:
 */

import java.util.Scanner;
import java.lang.Math;

public class Ex007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = 0; 
        int x2 = 0; 
        int y1 = 0; 
        int y2 = 0; 

        System.out.print("Digite o valor de x1: ");
        x1 = scan.nextInt();

        System.out.print("Digite o valor de x2: ");
        x2 = scan.nextInt();

        System.out.print("Digite o valor de y1: ");
        y1 = scan.nextInt();

        System.out.print("Digite o valor de y2: ");
        y2 = scan.nextInt();

    float distancia = (float) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));  
    System.out.printf("Distância: %.2f",distancia); 
    }   
}
