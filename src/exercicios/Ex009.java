package exercicios;

import java.util.Scanner;

//ATIVIDADE 1 - LISTA CONDIÇÃO

/*
*Construa um algoritmo que leia dois números inteiros e verifique se a divisão seja indeterminada
*(denominador igual a zero). Em caso afirmativo, imprima a seguinte mensagem: “Divisão indeterminada”, do
*contrário, imprima o resultado da divisão. Considere a divisão do primeiro pelo segundo
*/
public class Ex009 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int a, b ;

        System.out.println("Digite o numerador: ");
        a = input.nextInt();

        System.out.println("Digite o denominador: ");
        b = input.nextInt();

        float divisao = (float) a/b;

        if(b == 0){
            System.out.print("Divisão indeterminada");

        }
        else {
            System.out.printf("%d/%d = %.1f", a,b, divisao);
        }

    }

}
