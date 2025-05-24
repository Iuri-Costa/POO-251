
package Lâmpada;

public class TesteLampada {
    public static void main(String[] args) {
        AtributosLampada LED = new AtributosLampada(); // Removido duplicado
        LED.cor = "branca"; // Exemplo de atribuição de cor
        LED.potencia = 10; // Exemplo de atribuição de potência
        LED.ligar(); // Liga a lâmpada
        LED.mostrarStatus(); // Mostra o status da lâmpada
        LED.desligar(); // Desliga a lâmpada
        LED.mostrarStatus(); // Mostra o status da lâmpada novamente
    }
}
