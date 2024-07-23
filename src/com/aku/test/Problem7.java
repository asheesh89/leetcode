package com.aku.test;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = -123;
		int reverse = reverse(x);
		System.out.println(reverse);
		

	}
	
	public static int reverse(int x) {
		int unsignedX = Math.abs(x);
		boolean isNegative = false;	
		//int preReverse =0;
		if(x < 0) {
			isNegative =  true;
		}
	
		int reverse=0;
		while (unsignedX != 0) {
			int remainder =  unsignedX%10;
			int newReverse = reverse*10+remainder;
			
			if((newReverse)/10 != reverse) {
				return 0;
			}
			reverse = newReverse;
			unsignedX = unsignedX/10;			
		}
		if(isNegative) {
			reverse = reverse*(-1);
		}
		return reverse;
	}
	
	
	public static int reverseNew1(int x) {
	    int reversed = 0;
	    //123
	    while (x != 0) {
	        int digit = x % 10;//3
	        int newReversed = reversed * 10 + digit;
	        
	        // Check if overflow will occur before updating reversed
	        if ((newReversed - digit) / 10 != reversed) {
	            return 0; // Overflow will occur if updating reversed
	        }
	        reversed = newReversed;
	        x /= 10;
	    }
	    
	    return reversed;
	}
	

	public static int reverseNew(int x) {
	    int reversed = 0;
	    while (x != 0) {
	        int digit = x % 10;
	        x /= 10;
	        
	        // Check for overflow before adding the new digit
	        //MaxValue = 2147483647
	        //MinValue = -2147483648
	        if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
	            return 0; // Overflow will occur if we add this digit
	        }
	        if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
	            return 0; // Overflow will occur if we add this digit
	        }
	        
	        reversed = reversed * 10 + digit;
	    }
	    return reversed;
	}

}
