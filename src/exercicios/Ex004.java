package exercicios;

import java.util.Scanner;

/*
 * Em uma pizzaria, cada tulipa de chope custa R$1,80 e uma pizza mista grande custa 
 * R$25,00 mais R$ 3,50 por tipo de cobertura pedida (queijo, presunto, banana, etc.). 
 * Uma turma vai à pizzaria e pede uma determinada quantidade de "chopes" e uma pizza grande com uma determinada quantidade 
 * de coberturas. Faca um programa que calcula a conta e, sabendo que será informada a quantidade de pessoas, quanto que 
 * cada um deve pagar. Lembre-se dos 10% do garçom.
 */

public class Ex004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        int qntdChope = 0;
        int qntdPizza = 0;
        String cobertura = "";
        int qntdPessoas = 0;
        boolean escolheuCobertura = false;

        for(int i = 0; i < 3; i++){
            if(i == 0){
                System.out.print("Chopes R$1,80 | Quantos deseja : ");
                qntdChope = scan.nextInt();
            }
            else if(i == 1){
                String decisao = "";

                System.out.print("Pizza mista grande R$25,00 mais R$ 3,50 por tipo de cobertura pedida" 
                + "(queijo, presunto, banana) | Quantas pizzas deseja: ");
                qntdPizza = scan.nextInt();
                scan.nextLine();

                System.out.println("Deseja cobertura SIM/NÃO: ");
                decisao = scan.nextLine().toUpperCase();

                if(decisao.equals("SIM")){
                    escolheuCobertura = true;

                    System.out.print("Qual cobertura deseja: ");
                    cobertura = scan.nextLine().toUpperCase();

                }else{
                    escolheuCobertura = false;
                }    
            }   
            else if(i == 2){
                System.out.print("Informe a quantidade de pessoas que irá dividir a conta: ");
                qntdPessoas = scan.nextInt();

            }           
        }

        float precoChope = 1.80f * qntdChope;
        float precoPizza = (25f * qntdPizza);
        if(escolheuCobertura) {
            precoPizza += 3.5f * qntdPizza;
        };
        float precoTotal = precoChope + precoPizza;
        float divConta = precoTotal/qntdPessoas;
        float gorjeta = precoTotal * 0.1f;

        System.out.printf("Chopes: %d\nPizzas: %d\nCobertura: %s\nPreço total: %.2f\nDivisão da conta: %.2f\nGorjeta para garçom: %f"
                         , qntdChope, qntdPizza, cobertura, precoTotal, divConta, gorjeta);

        
    }
}
