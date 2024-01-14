package domain;

public class DVDFactory implements Factory{
    public DVD createItem(String name, int anneeDeParution) {
        return new DVD(name, anneeDeParution);
    }
}
