import java.util.Arrays;
class Solution {
    public int maximumProduct(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);

        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[0] * nums[1] * nums[n - 1]);
    }
}

public class MaxProdOfThreeElements { 
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3};
        Solution sol = new Solution();
        System.out.println("MaxProd of three : " + sol.maximumProduct(arr));
    }
}
