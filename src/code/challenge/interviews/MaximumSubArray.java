package code.challenge.interviews;

public class MaximumSubArray {

    public static void main(String[] args){

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {

        int maxSoFar = nums[0];
        int currentSum = nums[0];

        for (int num : nums) {
            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum = currentSum + num;

            if (currentSum > maxSoFar) {
                maxSoFar = currentSum;
            }
        }
        return maxSoFar;
    }
}
