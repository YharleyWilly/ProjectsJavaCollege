package exercicios;

import java.util.Scanner;

//ATIVIDADE 4 - LISTA CONDIÇÃO

/*
 * Uma empresa concederá um aumento de salário aos seus funcionários, que varia de acordo com o cargo,
conforme a tabela. Faça um algoritmo que leia o salário e o código do cargo de um funcionário e calcule o
novo salário. Se o cargo do funcionário não estiver na tabela, ele deverá receber 5% de aumento. Imprima o
salário antigo, o novo salário e a diferença. (utilize a estrutura ESCOLHA)
Código do Cargo Percentual
101 (Gerente) 10%
102 (Engenheiro) 20%
103 (Técnico) 30%
 */

public class Ex012 {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        float salario, aumento;
        int cargo;


        System.out.print("Informe o salário: "); 
        salario = input.nextFloat();

        System.out.print("Informe o código do cargo: ");
        cargo = input.nextInt();

        if(cargo == 101){
            aumento = salario * 1.1f;
        }
        else if(cargo == 102){
            aumento = salario * 1.2f;
        }
        else if(cargo == 103){
            aumento = salario * 1.3f;
        }
        else{
            aumento = salario  * 1.05f;
        }

        System.out.printf("Salário antigo: %.2f\nNovo salário: %.2f\nDiferença: %.2f", salario, aumento, (aumento-salario));


    }
}
