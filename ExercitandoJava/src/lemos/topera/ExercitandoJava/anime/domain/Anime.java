package lemos.topera.ExercitandoJava.anime.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int eps;


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.eps);
    }

    public String getNome(){
        return this.nome;
    }

    public String getTipo() {
        return this.tipo;
    }

    public int getEps() {
        return this.eps;
    }

    public void setNome(String nome) {
        this.nome =  nome;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEps(int eps) {
        this.eps = eps;
    }


}
