package exercicios;


import java.util.Scanner;


/*
 * Em uma pizzaria, cada tulipa de chope custa R$1,80 e uma pizza mista grande custa
 * R$25,00 mais R$ 3,50 por tipo de cobertura pedida (queijo, presunto, banana, etc.).
 * Uma turma vai à pizzaria e pede uma determinada quantidade de "chopes" e uma pizza grande com uma determinada quantidade
 * de coberturas. Faca um programa que calcula a conta e, sabendo que será informada a quantidade de pessoas, quanto que
 * cada um deve pagar. Lembre-se dos 10% do garçom.
 */


public class ExPizza {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        int qntdChope = 0;
        int qntdPizza = 0;
        String cobertura = "";
        int qntdPessoas = 0;
        boolean escolheuCobertura = false;
        char tamanhoPizza = ' ';
        float precoPizza = 0f;

        for(int i = 0; i < 4; i++){
            if(i == 0){
                System.out.print("Chopes R$1,80 | Quantos deseja : ");
                qntdChope = scan.nextInt();
                scan.nextLine();
            }
            else if(i == 1){
                System.out.print("Tamanhos pizza: \n\nGrande R$55.0  | Média R$35.0 | Pequena R$15.0. Qual tamanho deseja? "
                         + "\nTodos os tamanhos serão acrescentados R$ 3,50 por tipo de cobertura pedida (queijo, presunto, banana)\n\n");                      
                tamanhoPizza = scan.nextLine().toUpperCase().charAt(0);


            }
            else if(i == 2){
                String decisao = "";


                System.out.print("Quantas pizzas deseja: ");
                qntdPizza = scan.nextInt();
                scan.nextLine();


                System.out.println("Deseja cobertura SIM/NÃO: ");
                decisao = scan.nextLine().toUpperCase();

                //Se desejar cobertura a variável escolheuCobertura será verdadeira adicionando R$ 3,50 no calcúlo da cobertura da pizza

                if(decisao.equals("SIM")){
                    escolheuCobertura = true;


                    System.out.print("Qual cobertura deseja: ");
                    cobertura = scan.nextLine().toUpperCase();


                }else{
                    escolheuCobertura = false;
                }    
            }  
            else if(i == 3){
                System.out.print("Informe a quantidade de pessoas que irá dividir a conta: ");
                qntdPessoas = scan.nextInt();


            }          
        }
       
        //Cálculo do preço de acordo com tamanho da pizza

        if (tamanhoPizza == 'P'){
            precoPizza = (15f * qntdPizza);
            if(escolheuCobertura) {
                precoPizza += 3.5f * qntdPizza;}    
        }
        else if(tamanhoPizza == 'M'){
            precoPizza = (35f * qntdPizza);
            if(escolheuCobertura) {
                precoPizza += 3.5f * qntdPizza;}


        }
        else if(tamanhoPizza == 'G'){
            precoPizza = (55f * qntdPizza);
            if(escolheuCobertura) {
                precoPizza += 3.5f * qntdPizza;}


        }
        else{
            System.out.print("Não foi digitado um tamanho válido para pizza");
        }
       
        //Cálculos do preço total e divisão da conta

        float precoChope = 1.80f * qntdChope;
        float precoTotal = precoChope + precoPizza;
        float divConta = precoTotal/qntdPessoas;
        float gorjeta = precoTotal * 0.1f;
        

        //Saída na tela

        System.out.printf("Chopes: %d\nPizzas: %d\nTamanho Pizza: %s\nCobertura: %s\nPreço total: %.2f\nDivisão da conta: %.2f\nGorjeta para garçom: %.2f"
                         , qntdChope, qntdPizza, tamanhoPizza, cobertura, precoTotal, divConta, gorjeta);


       
    }
}



