package exercicios;

import java.util.Scanner; 

public class Calculadora {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
    

        //Variável opcao será a chave do switch - onde o usuário escolherá algum número de 1 a 5, ou 0 para sair.      
        int opcao ;
        //Variáveis num1 e num2 serão responsáveis por guardar os números digitados pelo usuário
        float num1, num2;
        
    // Menu do programa - Usuário escolhe qual operação matemática irá usar    
        System.out.print("---------- CALCULADORA ----------\n"
                  +  "\n1 - Somar\n"
                  +  "2 - Subtrair\n"
                  +  "3 - Multiplicar\n"
                  +  "4 - Dividir\n"
                  +  "5 - Potência\n"
                  +  "0 - SAIR\n");
        
        opcao = input.nextInt();
        
        switch (opcao) {            
            case 1:
                System.out.print("Digite o primeiro valor: ");
                num1 = input.nextFloat();
                System.out.print("Digite o segundo valor: ");
                num2 = input.nextFloat();

                float soma = num1 + num2;
                //Variável somaInt vai ser usada para caso o resultado seja um inteiro será cortado a casa decimal. 
                int somaInt = (int) soma;

                if (soma == somaInt){
                    System.out.printf("Soma: %d", somaInt);
                }else{
                    System.out.printf("Soma: %.2f", soma);
                } 
                break;           
            case 2:
                System.out.print("Digite o primeiro valor: ");
                num1 = input.nextFloat();
                System.out.print("Digite o segundo valor: ");
                num2 = input.nextFloat();

                float subtracao = num1 - num2;
                //Variável subtracaoInt vai ser usada para caso o resultado seja um inteiro será cortado a casa decimal. 
                int subtracaoInt = (int) subtracao;

                if (subtracao == subtracaoInt){
                    System.out.printf("Subtração: %d", subtracaoInt);
                }else{
                    System.out.printf("Subtração: %.2f", subtracao);
                }      
                break;
            case 3:
                System.out.print("Digite o primeiro valor: ");
                num1 = input.nextFloat();
                System.out.print("Digite o segundo valor: ");
                num2 = input.nextFloat();

                float multiplicacao = num1 * num2;
                //Variável multiplicacaoInt vai ser usada para caso o resultado seja um inteiro será cortado a casa decimal. 
                int multiplicacaoInt = (int) multiplicacao;

                if (multiplicacao == multiplicacaoInt){
                    System.out.printf("Multiplicação: %d", multiplicacaoInt);
                }else{
                    System.out.printf("Multiplicação: %.2f", multiplicacao);
                }      
                break;
            case 4:
                System.out.print("Digite o primeiro valor: ");
                num1 = input.nextFloat();
                System.out.print("Digite o segundo valor: ");
                num2 = input.nextFloat();
                
                //Não se divise um número por 0, então num2 não pode ser 0.
                if (num2 == 0){
                    System.out.println("Não é possível dividir um número por 0");
                }else{
                
                    float divisao = num1 / num2;
                    //Variável divisaoInt vai ser usada para caso o resultado seja um inteiro será cortado a casa decimal. 
                    int divisaoInt = (int) divisao;

                    if (divisao == divisaoInt){
                        System.out.printf("Subtração: %d", divisaoInt);
                    }else{
                        System.out.printf("Subtração: %.2f", divisao);
                    }          
                    break;
                }
            case 5:
                System.out.print("Digite a base: ");
                num1 = input.nextFloat();
                System.out.print("Digite o expoente: ");
                num2 = input.nextFloat();

                float potencia = (float) Math.pow(num1, num2);
                //Variável potenciaInt vai ser usada para caso o resultado seja um inteiro será cortado a casa decimal. 
                int potenciaInt = (int) potencia;

                if (potencia == potenciaInt){
                    System.out.printf("Resultado potência: %d", potenciaInt);
                }else{
                    System.out.printf("Resultado potência: %.2f", potencia);
                }      
                break;
            case 0:
                System.out.print("FIM");
                break;
            default:
            System.out.println("Opção inválida");
            break;           
                
        }

                  
    }              
}
    
