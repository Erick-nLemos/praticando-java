package lemos.topera.ExercitandoJava.exerciciosBasicos.test;

public class Exercicio01 {

    public static void main(String[] args){
        float media01, media02, mediaFinal, somaMedia;

        media01 = (8+9+7)/3;
        media02 = (4+5+6)/3;
        somaMedia = media01 + media02;
        mediaFinal = somaMedia/2;

        System.out.println("A primeira média é: "+ media01);
        System.out.println("A segunda média é: "+ media02);
        System.out.println("A soma das médias é: "+ somaMedia);
        System.out.println("A média das médias é: "+ mediaFinal);

    }
}
