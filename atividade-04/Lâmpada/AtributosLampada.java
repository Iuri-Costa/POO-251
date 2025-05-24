package Lâmpada;

public class AtributosLampada {
    boolean ligada;
    int potencia;
    String cor;

    void ligar() {
        ligada = true;
        System.out.println("A lâmpada está ligada");
    }

    void desligar() {
        ligada = false;
        System.out.println("A lâmpada está desligada");
    }

    void mostrarStatus() { // Corrigido de 'mostarStatus' para 'mostrarStatus'
        String status = ligada ? "ligada" : "desligada";
        System.out.println("A lâmpada está " + status + ", da cor " + cor + " e de potência " + potencia); // Adicionado espaço antes de "potência"
    }
}