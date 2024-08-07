package lemos.topera.Javadson.javacore.introducaometodos.test;
import lemos.topera.Javadson.javacore.introducaometodos.domain.Calculator;
import java.util.Scanner;

public class CalculatorTest02 {
    public static void main(String[] args) {

        int n1, n2, opcao;
        Scanner entrada = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Digite o primeiro valor: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o segundo valor: ");
        n2 = entrada.nextInt();
        System.out.println("\n[1 - somar, 2 - subtrair, 3 - multiplicar, 4 - dividir]");
        System.out.print("Qual calculo deseja realizar? ");
        opcao = entrada.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Resultado: "+ calc.somaDoisNum(n1, n2));
                break;
            case 2:
                System.out.println("Resultado: "+ calc.subDoisNum(n1, n2));
                break;

            case 3:
                System.out.println("Resultado: "+ calc.multDoisNum(n1, n2));
                break;

            case 4:
                System.out.println("Resultado: "+ calc.divDoisNum(n1, n2));
                break;

            default:
                System.out.println("Opção Invalida!");
        }


    }
}
