package com.aku.test;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {1,8,6,2,5,4,8,3,7};
		int maxArea = maxAreaOptimized(height);
		System.out.println(maxArea);

	}
	
	public static int maxArea(int[] height) {
        int maxArea = 0;
        int tempArea=0;
		for(int i = 0; i < height.length; i++) {
			for(int j =i+1; j< height.length; j++) {
				if(height[i] >= height[j]) {
					tempArea = height[j]*(j-i);
				}else {
					tempArea = height[i]*(j-i);
				}
				
				if(tempArea > maxArea) {
					maxArea = tempArea;
				}
				
			}
		}
		return maxArea;
    }
	
	public static int maxAreaOptimized(int[] height) {
        int maxArea = 0;
        int tempArea=0;
        int leftPtr = 0;
        int rightPtr = height.length -1;
        
        while(leftPtr < rightPtr) {
        	if(height[leftPtr]<=height[rightPtr]) {
        		tempArea = height[leftPtr]*(rightPtr-leftPtr);
        		leftPtr++;
        	}else {
        		tempArea = height[rightPtr]*(rightPtr-leftPtr);
        		rightPtr--;
        	}
        	
        	if(maxArea < tempArea)
        		maxArea =  tempArea;
		}
		return maxArea;
    }

}
