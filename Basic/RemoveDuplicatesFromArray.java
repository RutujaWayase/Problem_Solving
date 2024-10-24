
import java.util.HashSet;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int arr[] = {1,1, 4, 5, 7, 4, 8, 9, 0,2,2,4,6,8};
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        System.err.println(set);
    }
    
}
