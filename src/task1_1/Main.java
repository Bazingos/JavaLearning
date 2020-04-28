package task1_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String vowels = "[aeiou]"; //y is not a vowel

        String word = "Sesquipedalianism";
        System.out.println(word);

        char[] symbols = word.toCharArray();
        List<String> allMatches = new ArrayList<>();

        Matcher m = Pattern.compile(vowels, Pattern.CASE_INSENSITIVE).matcher(word);

        while(m.find()){
            allMatches.add(m.group());
        }

        Collections.reverse(allMatches);

        int count = 0;

        for(int i = 0; i < symbols.length; i++){
            if(String.valueOf(symbols[i]).matches(vowels)){
                symbols[i] = allMatches.get(count).charAt(0);
                count++;
            }
        }
        System.out.println(word);
    }
}
