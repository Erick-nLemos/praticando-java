package lemos.topera.ExercitandoJava.funcionario.domain;

public class Funcionario {
    private String name;
    private int age;
    private double sal;
    private double[] totalSal;
    private double media;

    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.sal);
    }

    public  void mediaSal(double... totalSal){
        double somaSal = 0;

        for (double i : totalSal){
            somaSal += i;
        }

        media = somaSal/totalSal.length;
        System.out.println(media);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSal() {
        return sal;
    }

    public double[] getTotalSal() {
        return totalSal;
    }

    public double getMedia() {
        return media;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public void setTotalSal(double[] totalSal) {
        this.totalSal = totalSal;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
