public class insertStringIntoAnotherString {
    public static String insertString(
        String originaString, 
        String stringToBeInserted,
        int index){
            //Create a new String
            String newString = new String();
            for(int i=0; i<originaString.length(); i++){
                //Insert the original string character
                //into the new string
                newString += originaString.charAt(i);
                if(i == index){
                    //Insert the string to be inserted
                    //into the new string
                    newString += stringToBeInserted;
                }
            }
            //return the modified string
            return newString;

    }
    public static void main(String[] args) {
        //Get the strings
        //String originalString = "GreeksGreeks";
        String originalString = "Good Fortune";
        String stringToBeInserted = "For";
        int index = 4;

        System.out.println("Original String: "+ originalString);
        System.out.println("String to be inserted: "+ stringToBeInserted);
        System.out.println("String to be inserted at index: "+ index);

        //Insert the string
        System.out.println("Modified string: "+insertString(originalString, stringToBeInserted, index));
    }
    
}
