package exercicios;

import java.util.Scanner;

//ATIVIDADE 3 - LISTA REPETIÇÃO

/*3) Faça um programa que vai pedindo números ao usuário até que este introduza o
número -1. O computador deve dizer a média dos números introduzidos (excluindo o -
1).
*/

public class Ex017 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        int soma = 0;
        int c = 0;

        do{
            System.out.println("Digite um número ou -1 para sair: ");
            num = input.nextInt();

            if(num != -1){
                soma += num;
                c++;
            }
            
        } while(num != -1);
        
        if(c > 0){

            float media = (float) soma/c;
            System.out.println("Média dos números introduzidos: "+media);
            System.out.println("FIM");
        }
        else{
            System.out.println("FIM");
        }
        
        input.close();
    }
}