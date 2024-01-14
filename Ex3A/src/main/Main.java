package main;

import domain.*;

public class Main {
    public static void main(String[] args) {
        MagasinDeDVD magasinDVD = new MagasinDeDVD();
        DVDFactory dvdFactory = new DVDFactory();
        magasinDVD.ajouterDVD(dvdFactory.createItem("Harry Potter", 2001));
        magasinDVD.ajouterDVD(dvdFactory.createItem("Harry Potter 2", 2002));
        MagasinDeLivre magasinLivre = new MagasinDeLivre();
        BookFactory bookFactory = new BookFactory();
        magasinLivre.ajouterLivre(bookFactory.createItem("Harry Potter", 1997));
        magasinLivre.ajouterLivre(bookFactory.createItem("Harry Potter 2", 1998));
        System.out.println(magasinDVD.retourneDVD("Harry Potter"));
    }
}
