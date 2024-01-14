package domain;

public class PalindromeStrategy implements Strategy{
    public void treatWord(String word) {
        if (isPalindrome(word))
            System.out.println(word);
    }
    private boolean isPalindrome(String word) {
        if (word == null)
            return false;
        StringBuffer stringbuffer = new StringBuffer(word);
        return word.equals(stringbuffer.reverse().toString());
    }
}
