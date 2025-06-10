package atividade_05.Aluno;

public class TesteAlunos {
    public static void main(String[] args) {
        AtributosAluno aluno1 = new AtributosAluno();
        aluno1.Matricula = "54321";
        aluno1.Curso = "Informática";
        aluno1.Nota = 7.5;
        aluno1.Idade = 18;

        AtributosAluno aluno2 = new AtributosAluno();
        aluno2.Matricula = "12345";
        aluno2.Curso = "Telecomunicações";
        aluno2.Nota = 5.0;
        aluno2.Idade = 17;

        aluno1.MostrarStatus();
        System.out.println("Aprovado: " + aluno1.EstaAprovado());
        System.out.println("Categoria: " + aluno1.CategoriaAluno());

        System.out.println();

        aluno2.MostrarStatus();
        System.out.println("Aprovado: " + aluno2.EstaAprovado());
        System.out.println("Categoria: " + aluno2.CategoriaAluno());
    }
}
