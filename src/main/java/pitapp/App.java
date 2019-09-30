package pitapp;
import java.util.HashMap;

public final class App {
    private App() {
    }
    public static boolean isAnagram(String first, String second){
        if (first.length() != second.length()){
            return false;
        } 
        HashMap<Character, Integer> firstWord = new HashMap<Character, Integer>();
        HashMap<Character, Integer> secondWord = new HashMap<Character, Integer>();

        for(int i = 0; i < first.length(); i++){
            char key = first.charAt(i);
            firstWord.put(key, firstWord.getOrDefault(key, 0)+1);
        }
        for(int i = 0; i < second.length(); i++){
            char key = second.charAt(i);
            secondWord.put(key, secondWord.getOrDefault(key, 0)+1);
        }
        return firstWord.equals(secondWord);

    }
}
