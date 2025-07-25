package empresa;

public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;

    public Desenvolvedor(String nome, int idade, double salario, String linguagemPrincipal) {
        super(nome, idade, salario);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Linguagem Principal: " + linguagemPrincipal);
    }

    public void programar() {
        System.out.println("Programando em " + linguagemPrincipal + "...");
    }

    public void programar(String modulo) {
        System.out.println("Desenvolvendo o módulo: " + modulo + " usando " + linguagemPrincipal);
    }

    public void programar(String modulo, boolean testes) {
        System.out.println("Módulo: " + modulo + " | Testes automatizados: " + (testes ? "Sim" : "Não"));
    }
}
