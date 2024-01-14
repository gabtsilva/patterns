package domain;

public class PalindromeStrategy implements Strategy{
    public boolean treatWord(String word) {
        return isPalindrome(word);
    }
    private boolean isPalindrome(String word) {
        if (word == null)
            return false;
        StringBuffer stringbuffer = new StringBuffer(word);
        return word.equals(stringbuffer.reverse().toString());
    }
}
