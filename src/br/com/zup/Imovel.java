package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private String endereço;
    private double valorAluguel;
    private String funcionarioResponsavel;
    private List<Morador>morador = new ArrayList<>();

    public Imovel(String endereço, double valorAluguel, String funcionarioResponsavel) {
        this.endereço = endereço;
        this.valorAluguel = valorAluguel;
        this.funcionarioResponsavel = funcionarioResponsavel;

    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(String funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public List<Morador> getMoradores() {
        return morador;
    }

    public void setMoradores(List<Morador> morador) {
        this.morador = morador;
    }

    public void adicionarMorador(Morador morador){
        this.morador.add(morador);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Endereço: " + endereço);
        retorno.append("\n Valor Aluguel: " + valorAluguel);
        retorno.append("\n Funcionário Responsável: " + funcionarioResponsavel);
        retorno.append("\n Morador: " + morador);
        return retorno.toString();
    }
}
