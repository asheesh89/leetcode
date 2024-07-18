package com.aku.test;

public class Problem26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int k =  removeDuplicates(nums);
		System.out.println(k);

	}
	//nums = [0,0,1,1,1,2,2,3,3,4]
	//0,1,1,1,1,2,2,3,3,4
	public static int removeDuplicates(int[] nums) {
        int k = 1;
        
        for(int i = 1; i < nums.length; i++) {
        	if(nums[k-1]  <nums[i]) {
        		nums[k]=nums[i];
        		k++;
        	}
  
        }
		
		return k;
    }

}
