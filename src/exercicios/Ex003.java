package exercicios;

import java.util.Scanner;

/*
 * Faça um programa que leia o nome de um piloto, uma distância percorrida em km e o tempo que o piloto levou para percorrê-la 
 * (em horas). O programa deve calcular a velocidade média em km/h, e exibir a seguinte frase: 
 * A velocidade média de XX foi YY km/h, onde XX é o nome do piloto, e YY é a velocidade média.
 */

public class Ex003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = "";
        float dist = 0;
        float horas = 0;

        for (int i = 0; i < 3; i++ ){
            if(i == 0){
                System.out.printf("Digite seu nome: ");
                nome = scan.nextLine();

            }else if(i == 1){
                System.out.printf("Distância percorrida em km: ");
                dist = scan.nextFloat();
                
            }else if(i == 2){
                System.out.printf("Tempo que levou para percorrer em horas: ");
                horas = scan.nextFloat();
            } 
        }
        float vm = dist/horas;
        System.out.printf("A velocidade média de %s foi %.0fkm/h", nome, vm);
    }   

}
