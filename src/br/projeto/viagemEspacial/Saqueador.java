package br.projeto.viagemEspacial;

//Nome da classe
public class Saqueador {

    //Atributos da classe
    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;
    protected int ouro;

    //Construto da classe
    public Saqueador(String nome, int vida, int ataque, int defesa, int ouro) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.ouro = ouro;
    }

    //Metodo para imprimir os dados do objeto
    @Override
    public String toString() {
        return "Saqueador{" + "nome= " + nome + ", vida= " + vida + ", ataque= " + ataque + ", defesa= " + defesa + ", ouro= " + ouro + '}';
    }

}
