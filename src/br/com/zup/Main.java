package br.com.zup;

/*
Os alunos/alunas devem criar um sistema de gestão para uma imobiliária. O sistema deve permitir o cadastro de um imóvel e de todos os seus moradores. Ao final do programa, deve ser exibido o endereço do imóvel, o valor do aluguel, quais são seus moradores e o nome do funcionário responsável pelo imóvel.


Entrega Mínima: O sistema permite cadastrar um imóvel com valor do aluguel, endereço, os moradores e o funcionário responsável. No final, o sistema deve exibir os dados do imóvel.


Entrega Máxima: O sistema permite adicionar mais de um imóvel e exibir a lista de imóveis.
*/

public class Main {

    public static void main(String[] args) {
        Imovel imovel1 = new Imovel("São Paulo",4000,"João");
        Imovel imovel2 = new Imovel("Rio de Janeiro",3000,"Ana");
        Imovel imovel3 = new Imovel("Ceará",1000,"Pedro");

        Morador morador1 = new Morador("Paula");
        Morador morador2 = new Morador("Vitoria");
        Morador morador3 = new Morador("Carlos");

        Imobiliaria imobiliaria1 = new Imobiliaria();

        imobiliaria1.adicionarImovel(imovel1);
        imobiliaria1.adicionarImovel(imovel2);
        System.out.println(imobiliaria1);
        System.out.println("---------------------------");
        imovel1.adicionarMorador(morador1);
        imovel2.adicionarMorador(morador2);
        System.out.println(imovel1);
        System.out.println(imovel2);

    }
}
