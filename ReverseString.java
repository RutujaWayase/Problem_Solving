package Problem_Solving;
public class ReverseString{
    public static void main(String[] args){
       // public static void main(String[] args){
            String str = "My name is rutuja";
            char ch;
            String output = "";
            for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            output = ch + output;
            
            
            }
            System.out.println("Reverse string is"+ output);
            }
}
