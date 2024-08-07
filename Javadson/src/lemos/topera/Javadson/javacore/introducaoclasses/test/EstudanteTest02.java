package lemos.topera.Javadson.javacore.introducaoclasses.test;
// importou o pacote domain

import lemos.topera.Javadson.javacore.introducaoclasses.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.age = 18;
        estudante.sex = 'M';
        estudante.name = "Erick";
        System.out.println(estudante.name + "\n" + estudante.sex + "\n" + estudante.age);System.out.println(estudante);
    }
}
