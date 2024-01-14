package domain;

public class PalindromeObserver implements Observer{
    private int nbrPalindromes;
    @Override
    public void update(String s) {
        for (String mot : s.trim().split(" ")) {
            StringBuilder temp = new StringBuilder(mot);
            if (mot.contentEquals(temp.reverse())) {
                nbrPalindromes++;
            }
        }
    }

    @Override
    public void end() {
        System.out.println("Ce fichier contient " + nbrPalindromes + " palindrome(s).");
    }
}
