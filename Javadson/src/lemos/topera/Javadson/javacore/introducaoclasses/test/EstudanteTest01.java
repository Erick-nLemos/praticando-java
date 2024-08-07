package lemos.topera.Javadson.javacore.introducaoclasses.test;

import lemos.topera.Javadson.javacore.introducaoclasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args){
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        estudante2.name = "Hello World!";
        System.out.println(estudante1.name + "\n" + estudante1.sex + "\n" + estudante1.age);
        System.out.println(estudante2.name + "\n" + estudante2.sex + "\n" + estudante2.age);
    }
}
