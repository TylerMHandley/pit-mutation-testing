package pitapp;
import java.util.HashMap;

public final class App {
    /**
     * Takes in two strings and sees if the first is an anagram of the second
     * @param first First word to be compared
     * @param second Second word to be compared
     * @return true if first is anagram of second, false otherwise
     */
    public static boolean isAnagram(String first, String second) {
        first = first.toLowerCase();
        second = second.toLowerCase();
        // Two strings can't be anagrams if they're not the same length
        if (first.length() != second.length()){
            return false;
        }
        HashMap<Character, Integer> firstWord = new HashMap<Character, Integer>();
        HashMap<Character, Integer> secondWord = new HashMap<Character, Integer>();

        // Count character occurences in 1st word
        for(int i = 0; i < first.length(); i++){
            char key = first.charAt(i);
            firstWord.put(key, firstWord.getOrDefault(key, 0)+1);
        }
        // Count character occurrences in 2nd word
        for(int i = 0; i < second.length(); i++){
            char key = second.charAt(i);
            secondWord.put(key, secondWord.getOrDefault(key, 0)+1);
        }
        return firstWord.equals(secondWord);
    }
}
