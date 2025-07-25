package empresa;

public class Gerente extends Funcionario {
    private String setor;

    public Gerente(String nome, int idade, double salario, String setor) {
        super(nome, idade, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    // Método sobrescrito
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Setor: " + setor);
    }

    // Métodos sobrecarregados
    public void planejar() {
        System.out.println("Planejando estratégias do setor " + setor + "...");
    }

    public void planejar(String projeto) {
        System.out.println("Planejando o projeto: " + projeto + " no setor " + setor);
    }

    public void planejar(String projeto, int prazoDias) {
        System.out.println("Projeto: " + projeto + " | Prazo: " + prazoDias + " dias | Setor: " + setor);
    }
}