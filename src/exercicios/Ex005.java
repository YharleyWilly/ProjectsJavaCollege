package exercicios;

import java.util.Scanner;

/*A conversão de graus Fahrenheit para Celsius é obtida pela fórmula abaixo. 
Faça um algoritmo que leia um valor em graus Centígrados e imprima seu correspondente em graus Fahrenheit. 
*/

public class Ex005 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        float celsius;
        
        System.out.print("Informe um valor em graus Celsius: ");
        celsius = scan.nextInt();   

        float fahrenheit = 32 + ((celsius*9)/5);
        System.out.printf("Valor fornecido: %.0f°C\nValor em Fahrenheit: %.1f°F", celsius, fahrenheit);
    }    
}
