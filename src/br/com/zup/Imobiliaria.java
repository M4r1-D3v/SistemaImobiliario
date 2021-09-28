package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    private List <Imovel> imoveisList = new ArrayList<>();

    public Imobiliaria(){

    }

    public Imobiliaria(List<Imovel> imoveisList) {
        this.imoveisList = imoveisList;
    }

    public List<Imovel> getImoveisList() {
        return imoveisList;
    }

    public void setImoveisList(List<Imovel> imoveisList) {
        this.imoveisList = imoveisList;
    }

    public void adicionarImovel(Imovel imoveisList){
        this.imoveisList.add(imoveisList);
    }


    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Imóveis cadastrados: \n" + imoveisList);
        return retorno.toString();
    }
}
