import empresa.Desenvolvedor;
import empresa.Gerente;

public class TesteEmpresa {
    public static void main(String[] args) {
        // Instanciando Gerente
        Gerente gerente = new Gerente("Ana Souza", 40, 9500.00, "Financeiro");
        gerente.exibirInformacoes(); // sobrescrito
        gerente.planejar(); // sobrecarregado
        gerente.planejar("Redução de Custos");
        gerente.planejar("Revisão Orçamentária", 15);

        System.out.println("------");

        // Instanciando Desenvolvedor
        Desenvolvedor dev = new Desenvolvedor("Carlos Lima", 30, 8000.00, "Java");
        dev.exibirInformacoes(); // sobrescrito
        dev.programar(); // sobrecarregado
        dev.programar("Sistema de Login");
        dev.programar("Sistema de Vendas", true);
    }
}
