package br.com.zup;

public class Morador {
    private String nome;

    public void Morador(){

    }
    public Morador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Nome: " + nome);
        return retorno.toString();
    }
}
