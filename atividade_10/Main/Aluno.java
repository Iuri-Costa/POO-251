package atividade_10.Main;
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    public Aluno(String nome, int idade, String genero, int matricula, String curso){
        super(nome, idade, genero);
        this.matricula = matricula;
        this.curso = curso;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public int getMatricula(){
        return this.matricula;
    }
    public String getCurso(){
        return this.curso;
    }
    public void exibeInfo(){
        System.out.println(
            "\n nome: "+getNome()+
            "\n idade: "+getIdade()+
            "\n genero: "+getGenero()+
            "\n matricula: "+getMatricula()+
            "\n curso: "+getCurso());
    }
}
