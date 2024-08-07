package lemos.topera.ExercitandoJava.exerciciosBasicos.test;
import java.util.Scanner;

// calculando os dias de vidas
public class Exercicio02 {

    public static int CalcDays(int ages, int months,int days){
        int days_life;

        days_life = (ages*365) + (months*30) + days;

        return days_life;
    }

    public static void main(String[] args){

        int anos, meses, dias;
        Scanner reader = new Scanner(System.in);

        System.out.print("Quantos anos você tem? ");
        anos = reader.nextInt();

        System.out.print("Quantos meses você tem após seu último aniversário? ");
        meses = reader.nextInt();

        System.out.print("Quantos dias você tem após dias você tem após virar esse último mês? ");
        dias = reader.nextInt();

        System.out.printf("\nVocê tem %d dias de idade.", CalcDays(anos, meses, dias));
    }
}
