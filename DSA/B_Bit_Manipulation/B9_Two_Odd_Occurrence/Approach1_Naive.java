package B_Bit_Manipulation.B9_Two_Odd_Occurrence;

import java.util.HashSet;

public class Approach1_Naive {
    public static HashSet<Integer> SingleOdd(int[] arr) {
        HashSet<Integer> hm = new HashSet<>();
        for (int i = 0; i < arr.length ; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]) count++;
            }
            if((count&1)==1) hm.add(arr[i]);
        }
        return hm;
    }

    public static void main(String[] args) {
        int[] num = {1,2,2,2,1,5,5,5};
        for (int n : SingleOdd(num)) {
            System.out.println(n);
        }

    }
}
