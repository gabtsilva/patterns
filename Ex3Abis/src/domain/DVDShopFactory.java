package domain;

public class DVDShopFactory implements Factory{
    public DVD createItem(String name, int anneeDeParution) {
        return new DVD(name, anneeDeParution);
    }
    public MagasinDeDVD createShop() {
        return new MagasinDeDVD();
    }
}
