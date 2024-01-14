package domain;

public class BookShopFactory implements Factory{
    public Livre createItem(String name, int anneeDeParution) {
        return new Livre(name, anneeDeParution);
    }
    public MagasinDeLivre createShop() {
        return new MagasinDeLivre();
    }
}
