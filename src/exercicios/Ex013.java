package exercicios;

import java.util.Scanner;

//ATIVIDADE 5 - LISTA CONDIÇÃO

/*Um banco concederá um crédito especial aos seus clientes, que varia com o saldo médio no último ano.
Faça um algoritmo que leia o saldo médio de um cliente e calcule o valor do crédito (percentual sobre o saldo
médio) de acordo com a tabela a seguir. Mostre uma mensagem informando o saldo médio e o valor do
crédito.
*/
 

public class Ex013 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float saldo;

        System.out.println("Digite o valor do saldo médio: ");
        saldo = input.nextFloat();

        if (0 < saldo && saldo <= 200){
            System.out.printf("Saldo médio: %.1f\nCrédito: 0", saldo);
        }
        else if (200 < saldo && saldo <= 400){
            float credito = saldo * 1.1f;
            System.out.printf("Saldo médio: %.1f\nCrédito: %.1f", saldo, credito);
        }
        else{
            float credito = saldo * 1.2f;
            System.out.printf("Saldo médio: %.1f\nCrédito: %.1f", saldo, credito);
        }
    }   
}
