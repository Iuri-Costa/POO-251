
package Lâmpada;

public class TesteLampada {
    public static void main(String[] args) {
        AtributosLampada LED = new AtributosLampada();
        LED.cor = "branca";
        LED.potencia = 10;
        LED.ligar();
        LED.mostrarStatus();
        LED.desligar();
        LED.mostrarStatus();
    }
}
