package lemos.topera.Javadson.introducao;

public class ArraysJava {
    public static void main(String[] ags){
        int[] numeros = new int[]{2,4,6,8};

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Valor "+ numeros[i]);
        }

        //foreach
        System.out.println("\n=========================");
        for(int num:numeros){
            System.out.println("Vala: "+ num);
        }
    }
}
