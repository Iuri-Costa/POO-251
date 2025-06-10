package atividade_04;

public class TesteCarro{
    public static void main(String[] args) {
        AtributosCarro fusca = new AtributosCarro();
        fusca.placa = "0000-OOO";
        fusca.ano = 1992;
        fusca.marca = "VW";
        fusca.modelo = "Fusca";
        fusca.exibirInfo();
    }
}