package lemos.topera.ExercitandoJava.calculadora.test;
import lemos.topera.ExercitandoJava.calculadora.domain.Calculator;
import java.util.Scanner;

//Caclculos mais avançados
public class CalculatorTest02 {
    public static void main(String[] args){

        int opcao;
        float v1, v2, v3;
        String stop;
        Calculator calc2 = new Calculator();
        Scanner reader = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        v1 = reader.nextInt();

        System.out.print("Digite o segundo valor: ");
        v2 = reader.nextFloat();

        do {
            System.out.println("\nEscolha o calculo que deseja fazer com os valores");
            System.out.println("1 - Raiz Quadrada \n2 - Potência \n3 - Área de um Triângulo \n4 - Bhaskara \n5 - Outras opções");
            System.out.print("Digite: ");
            opcao = reader.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("A raiz quadrada do primeiro valor é: " + Math.sqrt(v1));
                    System.out.println("E a raiz quadrada do segundo valor é: " + Math.sqrt(v2));
                    break;

                case 2:
                    System.out.println("O primeiro valor elevado ao segundo resulta em: "+ Math.pow(v1, v2));
                    break;

                case 3:
                    System.out.print("Digite o valor da base do Triângulo: ");
                    v1 = reader.nextFloat();

                    System.out.print("\nDigite o valor da altura do Triângulo: ");
                    v2 = reader.nextFloat();

                    System.out.println("\nA área do Triângulo é: "+ calc2.triArea(v1, v2));
                    break;

                case 4:
                    System.out.print("\nDigite o valor de a: ");
                    v1 = reader.nextFloat();

                    System.out.print("\nDigite o valor de b: ");
                    v2 = reader.nextFloat();

                    System.out.print("\nDigite o valor de c: ");
                    v3 = reader.nextFloat();

                    System.out.println("O resultado é: ");
                    calc2.Bhaska(v1, v2, v3);
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }


            System.out.print("\nDeseja continuar? [sim/nao]");
            stop = reader.next();
        }while(stop.equalsIgnoreCase("sim"));

    }
}