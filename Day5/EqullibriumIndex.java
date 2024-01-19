
class Solution{
	static int equalSum(int [] A, int N) {
		long rem = 0, sum = 0;
		for(int i =0 ; i < N; i++){
		    rem+=A[i];
		}
		for(int i = 0; i < N; i++){
		    if(sum == (rem-A[i]))
		        return i + 1;
		    sum+=A[i];
		    rem-=A[i];
		}
		return -1;
	}
}

public class EqullibriumIndex {
    
    public static void main(String[] args) {
        
        int[] arr = {10,20,30,40,10,20,30};
        int equllibriumIndex = Solution.equalSum(arr, arr.length);
        System.out.println(equllibriumIndex);
    }
}
