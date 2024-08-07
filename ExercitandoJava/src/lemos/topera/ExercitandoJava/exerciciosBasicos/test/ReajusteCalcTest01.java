package lemos.topera.ExercitandoJava.exerciciosBasicos.test;
import lemos.topera.ExercitandoJava.exerciciosBasicos.domain.ReajusteCalc;
import java.util.Scanner;

public class ReajusteCalcTest01 {
    public static void main(String[] args){
        double saldo;
        Scanner reader = new Scanner(System.in);
        ReajusteCalc reajuste = new ReajusteCalc();

        System.out.println("Digite o valor do saldo: ");
        saldo = reader.nextDouble();

        System.out.println("O reajuste de 1% em cima do Saldo será de: "+ reajuste.reajuste(saldo));
    }
}
