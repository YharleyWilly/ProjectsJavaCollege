package exercicios;

import java.util.Scanner;

//ATIVIDADE 12 - LISTA REPETIÇÃO

/*12)Faça um algoritmo que leia a altura e o sexo de n pessoas e imprima:
a) - Quantos homens e mulheres foram medidas;
b) - Quantos homens acima de 1,70;
c) - A média das alturas das mulheres.
OBS: O número n de pessoas será fornecida pelo usuário do programa no início da sua
execução.  */

public class Ex019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantPessoas, quantHomens = 0, quantMulheres = 0, quantHomens1_70 = 0;

        System.out.println("Quantas pessoas deseja cadastrar: ");
        quantPessoas = input.nextInt();
        input.nextLine();

        for(int i = 0; i < quantPessoas; i++){

            char sexo;
            float altura;

            System.out.println("\nInforme o sexo: ");
            sexo = input.nextLine().toUpperCase().charAt(0);

            System.out.println("\nInforme a altura: ");
            altura = input.nextFloat();
            input.nextLine();

            if(sexo == 'M'){
                quantHomens++;
                if(altura > 1.70f){
                    quantHomens1_70++;
                }
            }else{
                quantMulheres++;
            }
        }

        quantPessoas = quantHomens+quantMulheres;

        System.out.printf("\nHomens medidos: %d\n"
                        + "Mulheres medidas: %d\n"
                        + "Quantidade pessoas medidas: %d\n"
                        + "Homens acima de 1,70 de altura: %d", quantHomens, quantMulheres, quantPessoas, quantHomens1_70);
                        
    }
    
}
