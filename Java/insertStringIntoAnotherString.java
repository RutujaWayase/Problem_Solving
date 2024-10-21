/* 
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
*/
//Using String.substring() method
/* 
public class insertStringIntoAnotherString {
    //function to insert string
    public static String insertString(
        String originaString, 
        String stringToBeInserted,
        int index){
            //Create a new String
            String newString = originaString.substring(0, index+1)
            +stringToBeInserted
            +originaString.substring(index+1);
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
*/

//Using StringBuffer.insert()
public class insertStringIntoAnotherString {
    public static String insertString(String originalString, String stringToBeInserted, int index){
        //Create a new StringBuffer
        StringBuffer newString = new StringBuffer(originalString);
        //Insert the strings to be inserted
        //using insert() method
        newString.insert(index+1, stringToBeInserted);
        //return the modified string
        return newString.toString();

    }
    public static void main(String[] args){
        String originalString = "GreeksGreeks";
        String stringToBeInserted = "For";
        int index = 4;
        System.out.println("Original String: "+ originalString);
        System.out.println("String To Be Inserted: "+ stringToBeInserted);
        System.out.println("String to be inserted at index: "+index);

        //Insert the string
        System.out.println("Modified String: "+ insertString(originalString, stringToBeInserted, index));


    }

}
