package exercicios;

import java.util.Scanner;
import java.lang.Math;

/*
 * Fazer um programa que leia um número inteiro e mostre o seu triplo, sua metade, a sua raiz cúbica, e por 
 * fim, o número elevado a potência fracionária 2/3.
 */

public class Ex006 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = 0;

        System.out.print("Digite um número inteiro: ");
        num = scan.nextInt();

        int triplo = num * 3;
        float metade = (float) num / 2;
        float raizCub = (float) Math.cbrt(num);
        float potencia = (float) Math.pow(num, 2/3);
        System.out.printf("Número: %d\nTriplo: %d\nMetade: %.2f\nRaiz Cúbica: %.2f\nElevado a Potência frcionária 2/3: %.2f", num, triplo, metade, raizCub, potencia);
    }
}
