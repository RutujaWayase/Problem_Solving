public class CheckForPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        String reversed = new StringBuffer(str).reverse().toString();
        System.out.println(str.equals(reversed));
    }
    
}
