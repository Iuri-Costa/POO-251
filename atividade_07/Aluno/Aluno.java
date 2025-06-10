package atividade_07.Aluno;

public class Aluno {
    public String nome;
    public int idade;
    public double nota = 7.0;

    public Aluno() {
        this.nome = "Anônimo";
        this.idade = 0;
    }

    public Aluno(String nome) {
        this.nome = nome;
        this.idade = 18;
    }

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public void mostrar() {
        System.out.println("-------------------------");
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Nota: " + nota);
    }
}
