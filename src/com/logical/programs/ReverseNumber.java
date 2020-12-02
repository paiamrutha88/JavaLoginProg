package com.logical.programs;


public class ReverseNumber {

	public static void main(String[] args) {
		int n=1234;
		int rev=0;
		System.out.println(n);
		while(n>0)
		{
			rev=rev*10+n%10;
			n=n/10;
			//System.out.println(rev);
		}
System.out.println(rev);
	}

}
