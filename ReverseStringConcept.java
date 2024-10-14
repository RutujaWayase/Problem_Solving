package Problem_Solving;

import java.util.*;

/*
Using Split, Reverse and Join:
Split the input string by “.” while ignoring multiple consecutive dots into an array of words. 
Reverse the array of words. 
Join the reversed array back into a string. 
 */
public class ReverseStringConcept {
    static String reverseWords(String str){
        //Split the input string by '.'
        List<String> words = new ArrayList<>();
        String[] parts = str.split("\\.");
        for(String word: parts){
            if(!word.isEmpty()){
                //ignore empty words caused by multiple dots
                words.add(word);
            }
        }
        //Reverse the words
        //Collection..reverse(words);
         Collections.reverse(words);
        //Join the reversed words back into a string
        return String.join(".", words);
    }

    public static void main(String[] args) {
        String str = "..geeks..for.geeks.";
        System.out.println(reverseWords(str));
    }

    
}
