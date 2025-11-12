package code.challenge.interviews;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main (String[] args){

      int[] arr = new int[] {1,2,3,4,5,6 };
      int target = 6;

        System.out.println(Arrays.toString(twoSumBruteForce(target, arr)));

        System.out.println(Arrays.toString(twoSum(target, arr)));
    }


    public Map<String, Integer> category(){
        return new HashMap<>();
    }

    private static int[] twoSumBruteForce(int target, int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j <arr.length ; j++) {
                if( arr[i] + arr[j] == target  ){
                    return new int[] { i, j  };
                }
            }
        }
        return new int[] {};
    }

    private static int[] twoSum(int target, int[] arr) {

        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (numMap.containsKey(complement)){
                return new int[] { numMap.get(complement) , i   };
            }
            numMap.put(arr[i], i);
        }
        return new int[] {};







    }
}
