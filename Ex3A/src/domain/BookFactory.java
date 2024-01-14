package domain;

public class BookFactory implements Factory{
    public Livre createItem(String name, int anneeDeParution) {
        return new Livre(name, anneeDeParution);
    }
}
