package lemos.topera.ExercitandoJava.student.test;
import lemos.topera.ExercitandoJava.student.domain.Student;

// aprendendo Referência this, o this pega os atributos da classe e não os atributos locais do metodo.
public class StudentTest01 {
    public static void main(String[] args) {
        Student estudante01 = new Student();
        Student estudante02 = new Student();

        estudante01.name = "Maria";
        estudante01.age = 17;
        estudante01.sex = 'F';

        estudante02.name = "Jubileu";
        estudante02.age = 16;
        estudante02.sex = 'M';

        estudante01.imprime();
        System.out.println("================================");
        estudante02.imprime();
    }
}
