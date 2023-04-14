package exercicios;

/*Realizarei uma viagem de vários dias em meu automóvel, e gostaria de saber a quilometragem média por litro de gasolina. 
Para isto, anotarei a quilometragem no velocímetro ao sair de viagem, e depois ao chegar. 
Também vou somar toda a gasolina que comprar para o carro. Você poderia fazer um programa que me desse, com estes dados, 
quantos km fiz, em média, por litro de gasolina? */

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float kmInicial = 0;
        float kmFinal = 0;
        float gasolina = 0;

        for (int i = 0; i < 3; i++){            
            if(i == 0){
                System.out.print("Digite a quilometragem inicial do veículo: ");
                kmInicial = scan.nextFloat();
            }
            else if(i == 1){
            System.out.print("Digite a quilometragem final: ");
                kmFinal = scan.nextFloat();
            }
            else if(i == 2){
            System.out.print("Informe quantos litros foram abastecidos: ");
                gasolina = scan.nextFloat();
            }
        }

    float kmRodados = kmFinal - kmInicial;
    float kmLitro = kmRodados/gasolina;

    System.out.printf("--------------------------------------\n\n"
    +  "KM INICIAL = %.2f\n" 
    +  "KM FINAL = %.2f\n" 
    +  "KM RODADOS = %.2fkm\n" 
    +  "LITROS DE GASOLINA ABASTECIDO = %.2fl\n" 
    +  "KM POR LITRO = %.2fkm/l", kmInicial, kmFinal, kmRodados, gasolina, kmLitro);
        
    scan.close();   

    }
}
