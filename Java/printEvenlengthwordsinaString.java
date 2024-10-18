 public class printEvenlengthwordsinaString {
   // class GFG{
        public static void printWords(String s){
            for(String word : s.split(" ")){
                if(word.length()%2 == 0){
                    System.out.println(word);
                }
            }
        }
   // }
    public static void main(String[] args){
        String s = "i am Geeks for Geeks and a Geek";
        printWords(s);

    }

}


/* 

//Using Dynamic Programming
public class printEvenlengthwordsinaString {
    public static void printWords(String s) {
    //Split string into words
    String[] words = s.split("");
    //Create an array to store the length of each word
    int[] wordLengths = new int[words.length];
    //Calculate the length of each word and store in the array
    for(int i=0; i< words.length; i++){
        wordLengths[i] = words[i].length();
    }
    //Check if the length of each word is even and print if true
    for(int i=0; i<words.length; i++){
        if(wordLengths[i]%2 == 0);{
            System.out.println(words[i]);
        }
    }
}

    public static void main(String[] args){
        String s = "i am Geeks for Geeks and a Geek";
        printWords(s);
    }
}
*/