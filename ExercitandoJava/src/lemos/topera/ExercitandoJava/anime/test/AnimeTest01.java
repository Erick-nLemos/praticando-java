package lemos.topera.ExercitandoJava.anime.test;

import lemos.topera.ExercitandoJava.anime.domain.Anime;

// sobre carga de methodos
public class AnimeTest01 {
    public static void main(String[] ags){
        Anime anime01 = new Anime();
        anime01.setNome("Naruto");
        anime01.setTipo("TV");
        anime01.setEps(21);
        anime01.imprime();

    }
}
