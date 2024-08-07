package lemos.topera.Javadson.javacore.introducaometodos.domain;
import java.util.Scanner;
public class Calculator {
    public int somaDoisNum(int n1, int n2){
        return n1+n2;
    }

    public int subDoisNum(int n1, int n2){
        return n1-n2;
    }

    public int multDoisNum(int n1, int n2){int num1, num2;
        return n1*n2;
    }

    public double divDoisNum(double n1, double n2){
        double r = n1/n2;
        if(n2 == 0){
            return 0;
        }
        else{
            return r;
        }
    }

    public  void alterarNum(int num1, int num2){
        num1 = 10;
        num2 = 30;
        System.out.println(num1);
        System.out.println(num2);

    }
}
