package lemos.topera.ExercitandoJava.calculadora.domain;
public class Calculator {

    float result;

    public float somar(float val1, float val2){
        result = val1 + val2;

        return result;
    }

    public float sub(float val1, float val2){
        result = val1 - val2;

        return result;
    }

    public float mult(float val1, float val2){
        result = val1 * val2;

        return result;
    }

    public float div(float val1, float val2){
        result = val1/val2;

        return result;
    }

    public float triArea(float val1, float val2){
        result = (val1*val2)/2;

        return result;
    }

    public float Bhaska(float a, float b, float c){
        double delta, denominador, numx1, numx2, x1, x2;

        delta = Math.pow(b, 2)-(4*a*c);
        denominador = 2*a;
        numx1 = -b+Math.sqrt(delta);
        numx2 = -b-Math.sqrt(delta);
        x1 = numx1/denominador;
        x2 = numx2/denominador;

        if(delta >= 0){
            if(x1 == x2){
                System.out.println("x1 = x2 = "+ x1);
            }else{
                System.out.println("x1 = "+ x1);
                System.out.println("x2 = "+ x2);
            }

        }else{
            System.out.println("Não existe raízes reais.");
        }

        return result;
    }

    public void somaArray(int[] num){
        int soma = 0;
        for(int n : num){
            soma += n;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... num){

    }
}