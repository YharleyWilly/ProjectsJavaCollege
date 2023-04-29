package exercicios;

//ATIVIDADE 2 - LISTA REPETIÇÃO

/*2) Faça um programa que escreve na tela a mesma frase 10 vezes. E depois faça com
que o programa mostre o número de cada linha no início e no final da linha, conforme
ex:
a. 1 Sou um programa Java! 1
b. 2 Sou um programa Java! 2
c. 3 Sou um programa Java! 3
1. ...
d. 10 Sou um programa Java! 10  */

public class Ex016 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println(i+" Eu sou um programa Java! "+i);
        }   
    }
    
}
