package reinandoPublic.Cavalo;
import reinandoPublic.Vaca.Vaca;
public class Main {
    public static void main(String[] args) {
        Vaca minhaVaca = new Vaca();
        minhaVaca.idade = 5;
        minhaVaca.daLeite = true;
        minhaVaca.peso = 450.5;

        Cavalo meuCavalo = new Cavalo();
        meuCavalo.dentes = 32;
        meuCavalo.cor = "Preto";
        meuCavalo.raca = "Puro Sangue";
    }
}