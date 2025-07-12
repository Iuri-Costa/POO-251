package atividade_09.Main;
public class Professor extends Pessoa {
    private String materia;
    private int ID;
        public Professor(String nome, int idade, String genero, String materia, int ID) {
        super(nome, idade, genero);
        this.materia = materia;
        this.ID = ID;
    }
    public void setMateria(String materia){
        this.materia = materia;
    }
    public void setID(int ID) {
        this.ID= ID;
    }
    public String getMateria(){
        return this.materia;
    }
    public int getID(){
        return this.ID;
    }
    public void exibeInfo(){
        System.out.println(
            "\n nome: "+getNome()+
            "\n idade: "+getIdade()+
            "\n genero: "+getGenero()+
            "\n matéria: "+getMateria()+
            "\n ID: "+getID());
    }
}
