public class RotateRight {
//
//	Rotate an array. You will be given an input array and a number k, which denotes number of rotations to be done. Rotate the array k times and print the result
//	Input: nums = [1,2,3,4,5,6,7], k = 3
//	Output: [5,6,7,1,2,3,4]
	public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int j=0;
    while(j<k) {    //traverse k times
      int i = nums.length-1;
      int temp = nums[nums.length-1];
      
      while(i>0) {  
    	  nums[i]=nums[i-1];
    	  i--;
    	 
      }
      
      nums[0]= temp;   
      j++;  
      System.out.println(Arrays.toString(nums));
    } 
   
    }
}
