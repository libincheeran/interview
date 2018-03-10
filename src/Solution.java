import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();

        s.factorial(new int[] {20,21,22,23,24,23,26,27,28,29,30});
    }

    public void factorial(int[] arr){

        for(int val : arr){
            for(int i = 1 ; i <= val; i++){
                //prod *= i;
            }
            //System.out.println(""+val+" - > "+prod);
        }
    }
}