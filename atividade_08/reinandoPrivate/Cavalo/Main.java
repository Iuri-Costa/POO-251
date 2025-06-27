package reinandoPrivate.Cavalo;
import reinandoPrivate.Vaca.Vaca;
public class Main {
    public static void main(String[] args) {
        Vaca minhaVaca = new Vaca();
        minhaVaca.setIdade(5);
        minhaVaca.setDaLeite(true);
        minhaVaca.setPeso(450.5);

        Cavalo meuCavalo = new Cavalo();
        meuCavalo.setDentes(32);
        meuCavalo.setCor("Preto");
        meuCavalo.setRaca("Puro Sangue");
    }
}