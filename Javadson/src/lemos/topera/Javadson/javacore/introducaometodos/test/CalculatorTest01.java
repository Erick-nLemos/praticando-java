package lemos.topera.Javadson.javacore.introducaometodos.test;

import lemos.topera.Javadson.javacore.introducaometodos.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 10;
        int opcao = 4;

        Calculator calc = new Calculator();
        System.out.println("Vamos Calcular!");
        System.out.println("\n1 - Somar, 2 - Subtrair, 3 - Multiplicar, 4 - Dividir");

        //while (opcao > 0 && opcao <= 4) {
            switch (opcao) {
                case 1:
                    System.out.println("\nResultado: "+ calc.somaDoisNum(n1, n2));
                    break;

                case 2:
                    System.out.println("\nResultado: "+ calc.subDoisNum(n1, n2));
                    break;

                case 3:
                    System.out.println("\nResultado: "+ calc.multDoisNum(n1, n2));
                    break;

                case 4:
                    System.out.println("\nResultado: "+ calc.divDoisNum(n1, n2));
                    break;

                default:
                    System.out.println("Opção Invalida!");
                    break;

            }
        //}
    }
}