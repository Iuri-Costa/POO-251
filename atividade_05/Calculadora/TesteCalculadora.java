package atividade_05.Calculadora;

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
        double soma = atributos.numero1 + atributos.numero2;
        atributos.resultado = soma;
        return soma;
    }

    public double subtrair() {
        double subtracao = atributos.numero1 - atributos.numero2;
        atributos.resultado = subtracao;
        return subtracao;
    }

    public double multiplicar() {
        double multiplicacao = atributos.numero1 * atributos.numero2;
        atributos.resultado = multiplicacao;
        return multiplicacao;
    }
}
