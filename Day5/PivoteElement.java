import java.util.Arrays;

/*
 * Time - O(N) -- Linear
 * Space - O(1) -- Constant
 */
class Solution {
    public static int majorityElement(int[] nums) {    

        Arrays.sort(nums);

        int i = 0;
        int count = 0;

        if(nums.length == 1) {

            return nums[0];
        }

        while(i < nums.length) {

            if(nums[i] == nums[i + 1]) {

                count++;
            }
            if(count >= (nums.length / 2)) {

                return nums[i];
            }
            i++;
        }  

        return -1;    
    }
}

class Client {
    
    public static void main(String[] args) {
        
        int[] nums = {10,20,30,40,10,10,10};

        int pivote = Solution.majorityElement(nums);
        System.out.println("Pivote : " + pivote);
    }
}