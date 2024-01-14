package main;

import domain.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteurAvecBuffer = null;
        AnalyseurDeTexte analyseur = new AnalyseurDeTexte();
        analyseur.addObserver(new LineCountObserver());
        analyseur.addObserver(new WordCountObserver());
        analyseur.addObserver(new PalindromeObserver());
        analyseur.addObserver(new SpecificWordObserver("Belgique"));
        String ligne;
        try {
            lecteurAvecBuffer = new BufferedReader(new FileReader(args[0]));
        } catch (FileNotFoundException e) {
            System.out.println("Erreur d'ouverture");
        }
        while ((ligne = lecteurAvecBuffer.readLine()) != null) {
            analyseur.notifyObservers(ligne);
        }
        analyseur.end();
        lecteurAvecBuffer.close();
    }
}
