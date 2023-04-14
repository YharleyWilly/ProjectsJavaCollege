package exercicios;

import java.util.Scanner;

/*
 * Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.
 */

public class Ex008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;

        System.out.print("Digite um número inteiro: ");
        num = scan.nextInt();        

        System.out.print("Número: "+ num +" Antecessor: "+ (num-1) +" Sucessor: "+ (num+1));
    }    
}
