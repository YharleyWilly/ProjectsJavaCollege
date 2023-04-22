package exercicios;

import java.util.Scanner;

//ATIVIDADE 2 - LISTA CONDIÇÃO

/*Faça um algoritmo que leia um número inteiro e verifique se ele é par ou ímpar. Imprima uma mensagem
correspondente ao resultado. Se o número for zero, imprima: “o valor é zero”. */

public class Ex010 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a;

        System.out.println("Digite um valor: ");
        a = input.nextInt();

        if(a % 2 == 0){
            System.out.println("O valor é par");
        }
        else if(a % 2 != 0){
            System.out.println("O valor é ímpar");
        }
        if (a == 0) {
            System.out.println("O valor é zero");
        }
    }
}
