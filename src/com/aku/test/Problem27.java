package com.aku.test;

public class Problem27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,2,2,3,0,4,2};
		int val =2;
		int k =  removeElement(nums, val);
		System.out.println(k);
	}
	//[3,2,2,3],3
	//[0,1,2,2,3,0,4,2], 2
	//[3,1,2,2,3,0,4,2], 3
	public static int removeElement(int[] nums, int val) {
        int count = 0;
        int indexToReplace = 0;
        
        for(int i =0; i < nums.length; i++) {
        	if(nums[i] == val) {
        		//indexToReplace = i;
        		count++;
        	}else {
        		nums[indexToReplace] = nums[i];
        		indexToReplace++;
        	}
        }
        
        return nums.length-count;
    }

}
