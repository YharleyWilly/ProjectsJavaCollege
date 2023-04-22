package exercicios;

import java.util.Scanner;

//ATIVIDADE 3 - LISTA CONDIÇÃO

/*Faça um algoritmo que leia dois números inteiros e mostre um menu com quatro operações (+, -, *, /) para o
usuário escolher. Imprima o resultado da opção escolhida. Caso o usuário digite uma opção inválida, mostrar
mensagem de erro. (utilize a estrutura ESCOLHA) */

public class Ex011 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        int a, b;
        int opcao;

        System.out.print("Digite um valor: ");
        a = input.nextInt();

        System.out.print("Digite mais um valor: ");
        b = input.nextInt();

        System.out.print("ESCOLHA UMA OPÇÃO\n\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir");
        opcao = input.nextInt();


        switch(opcao){
            case 1:
                int soma=a+b;
                System.out.printf("Resultado da soma = %d",soma);
                break;
        
            case 2:
                int subtracao=a-b;
                System.out.printf("Resultado da subtração = %d",subtracao);
                break;
        
            case 3:
                int multiplicacao=a*b;
                System.out.printf("Resultado da multiplicação = %d",multiplicacao);
                break;
        
            case 4:
                float divisao=(float) a/b;
                System.out.printf("Resultado da divisão = %.1f",divisao);
                break;
            default:
                System.out.println("Opção inválida");
        }

    }
}
