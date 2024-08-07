package lemos.topera.ExercitandoJava.funcionario.test;
import lemos.topera.ExercitandoJava.funcionario.domain.Funcionario;
import java.util.Scanner;

public class FuncTest01 {
    public static void main(String[] args){
        Funcionario func01 = new Funcionario();
        Funcionario func02 = new Funcionario();
        Funcionario func03 = new Funcionario();
        Funcionario mSal =  new Funcionario();
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro funcionario: ");
        func01.setName(reader.next());

        System.out.println("Digite a idade do primeiro funcionario: ");
        func01.setAge(reader.nextInt());

        System.out.println("Digite o salário do primeiro funcionario: ");
        func01.setSal(reader.nextDouble());

        System.out.println("\n");
        System.out.println("Digite o nome do segundo funcionario: ");
        func02.setName(reader.next());

        System.out.println("Digite a idade do segundo funcionario: ");
        func02.setAge(reader.nextInt());

        System.out.println("Digite o salário do segundo funcionario: ");
        func02.setSal(reader.nextDouble());

        System.out.println("\n");
        System.out.println("Digite o nome do terceiro funcionario: ");
        func03.setName(reader.next());

        System.out.println("Digite a idade do terceiro funcionario: ");
        func03.setAge(reader.nextInt());

        System.out.println("Digite o salário do terceiro funcionario: ");
        func03.setSal(reader.nextDouble());

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        func01.print();
        System.out.println("-----------------------------------");
        func02.print();
        System.out.println("-----------------------------------");
        func03.print();
        System.out.println("-----------------------------------");
        System.out.println("A média entre os salários é: ");
        mSal.mediaSal(func01.getSal(), func02.getSal(), func03.getSal());
    }
}
