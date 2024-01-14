package main;

import domain.*;

public class Main {
    public static void main(String[] args) {
        Factory dvdFactory = new DVDShopFactory();
        Shop magasinDVD = dvdFactory.createShop();
        magasinDVD.addItem(dvdFactory.createItem("Star Wars", 1977));
        magasinDVD.addItem(dvdFactory.createItem("Star Wars 2", 1980));
        magasinDVD.getItem("Star Wars");
    }
}
