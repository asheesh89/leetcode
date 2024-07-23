package com.aku.test;

public class Problem35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1};
		int target =0;
		int k =  searchInsert(nums, target);
		System.out.println(k);
	}
	
	public static int searchInsert(int[] nums, int target) {
		
		int pos=0;
		for(int i =0; i < nums.length; i++) {
			if(nums[i]== target) {
				pos=i;
				break;
			}else {
				if(i < (nums.length -1) && nums[i] < target && nums[i+1]> target) {
					pos=i+1;
					break;
				}
				else if(nums[i]> target) {
					break;
				}
				else if(i == (nums.length -1)) {
					pos = i+1;
					break;
				}
				
				
			}
		}
        
		return pos;
    }

}
