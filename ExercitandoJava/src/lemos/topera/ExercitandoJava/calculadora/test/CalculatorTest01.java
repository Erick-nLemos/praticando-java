package lemos.topera.ExercitandoJava.calculadora.test;
import lemos.topera.ExercitandoJava.calculadora.domain.Calculator;
import java.util.Scanner;

// Calculos basicos
public class CalculatorTest01 {
    public static void main(String[] args){

        int opcao;
        float v1, v2;
        String stop;
        Scanner read = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Digite o primeiro valor: ");
        v1 = read.nextFloat();
        System.out.print("Digite o segundo valor: ");
        v2 = read.nextFloat();

        do{
            System.out.println("\nEscolha o calculo que deseja fazer com os valores");
            System.out.println("1 - Somar \n2 - Subtrair \n3 - Multiplicar \n4 - Dividr \n5 - Outras opções");
            System.out.print("Digite: ");
            opcao = read.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O resultado da soma é: " + calc.somar(v1, v2));
                    break;

                case 2:
                    System.out.println("O resultado da subtração é: " + calc.sub(v1, v2));
                    break;

                case 3:
                    System.out.println("O resultado da multiplicação é: " + calc.mult(v1, v2));
                    break;

                case 4:
                    if (calc.div(v1, v2) == 0) {
                        System.out.println("Divisão Inválida!");
                    } else {
                        System.out.println("O resultado da divisão é: " + calc.div(v1, v2));
                    }
                    break;

                case 5:

                    break;
            }

            System.out.println("Deseja fazer outro calculo? [sim/nao]");
            System.out.print("Resposta: ");
            stop = read.next();
        }while(stop.equalsIgnoreCase("sim"));

    }
}