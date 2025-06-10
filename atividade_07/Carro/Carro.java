package atividade_07.Carro;

public class Carro {
    public String modelo;
    public String cor;
    public int ano = 2020;

    public Carro() {
        this.modelo = "Padrão";
        this.cor = "Preto";
    }

    public Carro(String modelo) {
        this.modelo = modelo;
        this.cor = "Branco";
    }

    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public void exibir() {
        System.out.println("-------------------------");
        System.out.println("Modelo: " + modelo + ", Cor: " + cor + ", Ano: " + ano);
    }
}

