package Calculadora;

public class TesteCalculadora {
    AtributosCalculadora atributos = new AtributosCalculadora();

    public static void main(String[] args) {
        TesteCalculadora teste = new TesteCalculadora();

        double soma = teste.adicionar();
        double sub = teste.subtrair();
        double mult = teste.multiplicar();

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
    }

    public double adicionar() {
        double soma = atributos.getNumero1() + atributos.getNumero2();
        atributos.setResultado(soma);
        return soma;
    }

    public double subtrair() {
        double subtracao = atributos.getNumero1() - atributos.getNumero2();
        atributos.setResultado(subtracao);
        return subtracao;
    }

    public double multiplicar() {
        double multiplicacao = atributos.getNumero1() * atributos.getNumero2();
        atributos.setResultado(multiplicacao);
        return multiplicacao;
    }
}
