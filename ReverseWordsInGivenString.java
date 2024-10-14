package Problem_Solving;

import java.util.regex.Pattern;

/*
 Input : "Welcome to geeksforgeeks"
Output : "geeksforgeeks to Welcome"

Input : "I love Java Programming"
Output :"Programming Java love I"
 */
public class ReverseWordsInGivenString {
    //method to reverse words of a string
    static String reverseWords(String str){
        //specifying pattern to search
        Pattern pattern = Pattern.compile("\\s");
        //splitting String str with a pattern
        //splitting string with whitespace and store it in temp array
        String[] temp = pattern.split(str);
        String result = "";

        //Iterate over the temp array and store the string in reverse order
        for(int i=0; i<temp.length; i++){
            if(i==temp.length-1)
                result = temp[i] + result;
            else
                result = " "+ temp[i] + result;
        }
        return result;
        
    }
    public static void main(String[] args){
        String s1 = "Welcome to geeksforgeeks";
        System.out.println(reverseWords(s1));

        String s2 = "I love Java Programming";
        System.out.println(reverseWords(s2));
    }
    
}
