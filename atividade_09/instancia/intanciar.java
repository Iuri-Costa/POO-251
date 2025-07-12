package instancia;
import Main.Aluno;
import Main.Professor;
public class Intanciar {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Iuri", 17, "masculino", 272727, "TI");
        Professor professor1 = new Professor("Rebeca", 40, "feminino", "POO", 12345);

        professor1.exibeInfo();
        aluno1.exibeInfo();
    }
}
