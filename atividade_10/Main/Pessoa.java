package atividade_10.Main;
public class Pessoa{
    private String nome;
    private int idade;
    private String genero;
    public Pessoa(String nome, int idade, String genero){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getGenero(){
        return this.genero;
    }
    
}