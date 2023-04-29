package exercicios;

import java.util.Scanner;

//ATIVIDADE 10 - LISTA CONDIÇÃO

/*10)Escrever um algoritmo que lê um valor n e outro valor m, e calcula a tabuada de n de
1 até m. Exemplo: Supor que o usuário informe os seguintes valores: n=8 e m=12.
Então tem-se:
1 x 8 = 8 
2 x 8 = 16
. . .
. . .
12 8 = 96 */

public class Ex018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tabuadaNum, ateNum, contador = 0;

        System.out.println("Tabuada de: ");
        tabuadaNum = input.nextInt();
        System.out.println("Até o número: ");
        ateNum = input.nextInt();

        while(contador != ateNum){
            int resultado = tabuadaNum*(contador+1);
            System.out.println(tabuadaNum+" X "+(contador+1)+" = "+ resultado);
            contador++;
        }

    }
}
