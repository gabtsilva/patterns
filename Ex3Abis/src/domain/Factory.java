package domain;

public interface Factory {
    public Item createItem(String name, int anneeDeParution);
    public Shop createShop();
}
