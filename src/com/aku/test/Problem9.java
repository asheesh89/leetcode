package com.aku.test;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean result =  isPalindrome(10);//12345
		
	

	}
	
	public static boolean isPalindrome(int x) {
        boolean result =  false;
        
        //12345
        
        if(x <0)
        	return false;
        
        
        int quotient=0;
        int remainder = 0;
        quotient =  x/10; //1234
        remainder = x%10; //5
        int num =remainder;
        while(quotient > 0 ) {
        	num  = num*10;
        	remainder = quotient%10;
        	
        	quotient =  quotient/10;
        	num = num +remainder; 
        	
        }
        if (num == x)
        	return true;
        else
        	return false;
		
    }

}
