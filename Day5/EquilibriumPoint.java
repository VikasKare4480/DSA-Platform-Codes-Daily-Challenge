class Solution {

    public static int equilibriumPoint(long arr[], int n) {

        int rSum = 0;
        
        int i = 0; 
        while(i < arr.length) {
            
            rSum += arr[i];
            i++;
        }
        
        int lSum = 0;
        int j = 0;
        while(j < arr.length) {
                
            if(lSum == (rSum - arr[j]))
                return j + 1;
            
            rSum -= arr[j];
            lSum += arr[j];
            j++;
        }
        
        return -1;
    }
}

public class EquilibriumPoint {
    
    public static void main(String[] args) {
        
        long[] arr = {10,20,30,40,50};
        int equilibriumPoint = Solution.equilibriumPoint(arr, arr.length);
        System.out.println("Equlibruim Point : " + equilibriumPoint);

    }
}
