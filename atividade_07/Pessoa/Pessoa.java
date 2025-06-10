package atividade_07.Pessoa;

public class Pessoa {
    public String nome;
    public String genero;
    public String nacionalidade = "Brasileira";

    public Pessoa() {
        this.nome = "Indefinido";
        this.genero = "Não informado";
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.genero = "Outro";
    }

    public Pessoa(String nome, String genero, String nacionalidade) {
        this.nome = nome;
        this.genero = genero;
        this.nacionalidade = nacionalidade;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome + ", Gênero: " + genero + ", Nacionalidade: " + nacionalidade);
    }
}
