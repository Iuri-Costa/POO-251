package reinandoDefault.Cavalo;
import reinandoDefault.Vaca.Vaca;
public class Main {
    public static void main(String[] args) {
        Vaca minhaVaca = new Vaca();
        minhaVaca.idade = 5;
        minhaVaca.daLeite = true;
        minhaVaca.peso = 450.5;
        /* deu erro porque a classe Vaca está no pacote reinandoDefault.Vaca
        e a classe Main está no pacote reinandoDefault.Cavalo.
        ou seja, a classe Vaca não é visível para a classe Main.*/
        Cavalo meuCavalo = new Cavalo();
        meuCavalo.dentes = 32;
        meuCavalo.cor = "Preto";
        meuCavalo.raca = "Puro Sangue";
    }
}