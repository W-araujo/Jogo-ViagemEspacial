package br.projeto.planetas;

//Nome da classe
public class Planeta {

    //Atributos da classe
    protected String nome;
    protected String tamanho;
    protected String rotacao;
    protected String translacao;

    //Construtor
    public Planeta(String nome, String tamanho, String rotacao, String translacao) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.rotacao = rotacao;
        this.translacao = translacao;
    }

    //Metodos Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getRotacao() {
        return rotacao;
    }

    public void setRotacao(String rotacao) {
        this.rotacao = rotacao;
    }

    public String getTranslacao() {
        return translacao;
    }

    public void setTranslacao(String translacao) {
        this.translacao = translacao;
    }

    //Metodo para imprimir os dados do objeto
    @Override
    public String toString() {
        return "Planeta{" + "nome=" + nome + ", tamanho=" + tamanho + ", rotacao=" + rotacao + ", translacao=" + translacao + '}';
    }
    
    

}
