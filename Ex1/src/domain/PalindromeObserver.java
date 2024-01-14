package domain;

public class PalindromeObserver implements Observer{
    private int palindromeCount;
    @Override
    public void update(String line) {
        for (String word : line.trim().split(" ")) {
            StringBuilder temp = new StringBuilder(word);
            if (word.contentEquals(temp.reverse())) {
                palindromeCount++;
            }
        }
    }

    @Override
    public void end() {
        System.out.println("Ce fichier contient " + palindromeCount + " palindrome(s).");
    }
}
