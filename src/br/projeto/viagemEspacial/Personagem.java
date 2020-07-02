package br.projeto.viagemEspacial;

//Nome da classe
public class Personagem {

    //Atributos da classe
    protected String nome;
    protected int vida = 100;
    protected int ataque = 3;
    protected int defesa = 1;
    protected int ouro = 5;
    protected int nivel = 1;
    protected int experiencia = 0;
    

    //Construtor da classe
    public Personagem(String nome) {
        this.nome = nome;
    }


    //Metodo para imprimir os dados do objeto
    @Override
    public String toString() {
        return "Personagem{" + "nome= " + nome + ", vida= " + vida + ", ataque= " + ataque + ", defesa= " + defesa + ", ouro= " + ouro + ", nivel =" + nivel + ", experiencia =" + experiencia + '}';
    }

   
}
