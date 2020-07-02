package br.projeto.planetas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Nome da classe
//Heranca com a classe Planeta
public class Lactus extends Planeta {

    //Atributos da classe
    protected String satelitesNaturais;

    //Construtor da classe se referenciando a classe mãe
    public Lactus(String nome, String tamanho, String rotacao, String translacao, String satelitesNaturais) {
        super(nome, tamanho, rotacao, translacao);
        this.satelitesNaturais = satelitesNaturais;

    }

    //Metodos da classe   
    //Metodo Estatico
    public static String exploracao() {
        String exploracao = null;
        List<String> descobertasAleatorias = new ArrayList<String>();

        descobertasAleatorias.add("Você explorou o planeta e descobriu diversas belezas naturais, você se sente mais calmo.");
        descobertasAleatorias.add("Explorando o planeta descobrisse que tem epocas do ano que chega a 300 graus celsius.");
        descobertasAleatorias.add("No meio da exploração você encontra um lugar lindo, com várias montanhas como se fossem um desenho de perfeição.");

        Collections.shuffle(descobertasAleatorias);
        for (int i = 0; i < descobertasAleatorias.size(); i++) {
            exploracao = descobertasAleatorias.get(i);
        }

        return exploracao;
    }

    public String getSatelitesNaturais() {
        return satelitesNaturais;
    }

    public void setSatelitesNaturais(String satelitesNaturais) {
        this.satelitesNaturais = satelitesNaturais;
    }

    //Metodo para imprimir os dados do objeto
    @Override
    public String toString() {
        return "Planeta{" + "Nome= " + this.nome + ", Tamanho= " + this.tamanho + ", Rotacao= " + this.rotacao + ""
                + ", Translacao= " + this.translacao + ", Satelites Naturais= " + this.satelitesNaturais + '}';
    }

}
