package br.projeto.nave;

//Nome da classe
public class NaveEspacial {

    //Atributos da classe
    protected String nome = "Delta L";
    protected String cor = "Branca";
    protected int combustivel = 50;
    

    //Metodos da classe
    public void viajarPlanetaCombustivel() {
        this.combustivel -= 10;
        System.out.println("Você gastou 10 de combustivel para realizar essa viagem");
    }

    
    public void abastecerNave() {
        this.combustivel = 50;
        System.out.println("Você encheu o tanque, muito obrigado!");
    }
    
    //Sobrecarga do metodo "abastecerNave" com parametros
    public int abastecerNave(int abastecer) {
        this.combustivel += abastecer;
        System.out.println("Você abasteceu sua nave");
        return abastecer;
    }
    

    //Metodos Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    //Metodo para imprimir os dados do objeto
    @Override
    public String toString() {
        return "NaveEspacial{" + "nome=" + nome + ", cor=" + cor + ", combustivel=" + combustivel + '}';
    }

    
}
