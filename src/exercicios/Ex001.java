package exercicios;

import java.util.Scanner;

/*Faça um programa que leia três valores inteiros, e calcule e exiba a sua média ponderada. 
 *A primeira nota tem peso 2, a segunda tem peso 3 e a terceira tem peso 5. 
 */

public class Ex001 {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, c = 0;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o %dº valor: ", (i+1));
            
            if(i == 0) {
            	a = sc.nextInt();           
            }
            else if(i == 1) {
            	b = sc.nextInt();
            }
            else {
            	c = sc.nextInt();      
            }                       
        }
        float mediaPonderada = (a*2 + b*3 + c*5)/(2 + 3 + 5);
        System.out.printf("Média ponderada: %.2f", mediaPonderada);
    }
}

