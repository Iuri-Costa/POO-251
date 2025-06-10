package atividade_07.Test;
import atividade_07.Aluno.Aluno;
import atividade_07.Carro.Carro;
import atividade_07.Lâmpada.Lampada;
import atividade_07.Pessoa.Pessoa;

public class SeiNao {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro("Civic");
        Carro c3 = new Carro("Corolla", "Prata", 2022);
        c1.exibir(); c2.exibir(); c3.exibir();

        Lampada l1 = new Lampada();
        Lampada l2 = new Lampada(15);
        Lampada l3 = new Lampada(true, 20, "Fluorescente");
        l1.status(); l2.status(); l3.status();

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("João", 21, 8.5);
        a1.mostrar(); a2.mostrar(); a3.mostrar();

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Carlos");
        Pessoa p3 = new Pessoa("Ana", "Feminino", "Portuguesa");
        p1.imprimir(); p2.imprimir(); p3.imprimir();
    }
}
