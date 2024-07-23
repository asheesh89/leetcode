package com.aku.test;

public class Problem28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  haystack = "mississippi";
		String  needle = "issipi";
		int pos = strStr(haystack, needle);
		System.out.println(pos);

	}
	
	public static int strStr(String haystack, String needle) {
        int pos = -1;
        int i = 0;
       
        while ((haystack.length() >= needle.length()) && i < haystack.length()) {
        	int count = 0;
        	int k = i;
        	for(int j = 0; j < needle.length(); j++) {
        		if(k < haystack.length() && haystack.charAt(k) == (needle.charAt(j))){
        			k++;
        			count++;
        		}else {
        			break;
        		}
        	}
        	if(count == needle.length()) {
        		pos = i;
        		break;
        	}
        	i++;
        }
		
		return pos;
    }

}
