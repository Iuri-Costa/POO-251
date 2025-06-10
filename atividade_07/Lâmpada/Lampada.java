package atividade_07.Lâmpada;

public class Lampada {
    public boolean ligada;
    public int potencia;
    public String tipo = "LED";

    public Lampada() {
        this.ligada = false;
        this.potencia = 10;
    }

    public Lampada(int potencia) {
        this.ligada = true;
        this.potencia = potencia;
    }

    public Lampada(boolean ligada, int potencia, String tipo) {
        this.ligada = ligada;
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public void status() {
        System.out.println("Ligada: " + ligada + ", Potência: " + potencia + "W, Tipo: " + tipo);
    }
}
