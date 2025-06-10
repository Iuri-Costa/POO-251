package atividade_04;
public class AtributosAluno {
    String Matricula;
    String Curso;
    double Nota;
    int Idade;

    boolean EstaAprovado() {
        return Nota >= 6.0;
    }

    void MostrarStatus() {
        System.out.println("Matricula: " + Matricula + ", Curso: " + Curso + ", Nota: " + Nota + ", Idade: " + Idade);
    }
    
    String CategoriaAluno() {
        if (Nota >= 9.0) {
            return "Excelente";
        } else if (Nota >= 7.0) {
            return "Bom";
        } else if (Nota >= 6.0) {
            return "Satisfatório";
        } else {
            return "Insuficiente";
        }
    }
}

