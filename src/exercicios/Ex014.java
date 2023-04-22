package exercicios;

import java.util.Scanner;

//ATIVIDADE 13 - LISTA CONDIÇÃO 
 
/*A loja Constrói em Partes produz dois tipos de hastes: cobre e alumínio. Cada haste de cobre é vendida por
R$ 2,00, e cada haste de alumínio é vendida por R$ 4,00. O desconto dado dependerá da quantidade de
hastes compradas, conforme tabela abaixo. Fazer um algoritmo para ler a quantidade comprada de cada tipo
de haste e imprima o total pago.

Quantidade comprada
(duas hastes juntas)
Percentual
de Desconto
Abaixo de 5 0
Entre 5 e 15 10
Entre 16 e 20 15
Acima de 20 20 
 */

public class Ex014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float cobre = 2f;
        float aluminio = 4f;
          
        System.out.print("Deseja comprar quantas hastes de cobre: ");
        int quantCobre = input.nextInt();

        System.out.print("Deseja comprar quantas hastes de alumínio: ");
        int quantAluminio = input.nextInt();
        
        int quantTotal = quantCobre+quantAluminio;

        if(quantTotal < 5){
            float valorTotal = (cobre * quantCobre) + (aluminio * quantAluminio);
            System.out.printf("Quantidade de hastes: %d\n"
                            +  "Valor total: %.2f", quantTotal, valorTotal);
        }
        else if(quantTotal >=  5 && quantTotal <= 15){
            float valorTotal = ((cobre * quantCobre) + (aluminio * quantAluminio)) * 0.9f;
            System.out.printf("Quantidade de hastes: %d\n"
                            +  "Valor total: %.2f", quantTotal, valorTotal);
        }
        if(quantTotal >= 16 && quantTotal <= 20){
            float valorTotal = ((cobre * quantCobre) + (aluminio * quantAluminio)) * 0.85f;

            System.out.printf("Quantidade de hastes: %d\n"
                            +  "Valor total: %.2f", quantTotal, valorTotal);
        }
        if(quantTotal > 20){
            float valorTotal = ((cobre * quantCobre) + (aluminio * quantAluminio)) * 0.8f;

            System.out.printf("Quantidade de hastes: %d\n"
                            +  "Valor total: %.2f", quantTotal, valorTotal);
        }


        
    }
}
