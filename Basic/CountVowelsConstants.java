public class CountVowelsConstants {
    public static void main(String[] args) {
        String str = "Automation";
        int vowels=0, constants=0;
        for(char c: str.toCharArray()){
            if("aeiouAEIOU".indexOf(c)!=-1){
                vowels++;
            }
            else if(Character.isLetter(c)){
                constants++;
            }
        }
        System.out.println("Vowels: "+ vowels + " & " + "Contants: "+ constants);
    }
    
}
