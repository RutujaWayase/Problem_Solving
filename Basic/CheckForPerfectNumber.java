public class CheckForPerfectNumber {
    public static void main(String[] args) {
        int num =28, sum =0;
        for(int i=1; i<= num/2; i++){
            if(num%i==0){
                sum += i;
            }
        }
        System.err.println(num==sum);
    }
    
}