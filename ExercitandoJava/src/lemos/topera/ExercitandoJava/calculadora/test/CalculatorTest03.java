package lemos.topera.ExercitandoJava.calculadora.test;

import lemos.topera.ExercitandoJava.calculadora.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int[] numbers = {1,2,3,4,5};
        calc.somaArray(numbers);
        calc.somaVarArgs(numbers);
    }
}
