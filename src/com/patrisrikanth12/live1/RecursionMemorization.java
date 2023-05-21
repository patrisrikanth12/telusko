package com.patrisrikanth12.live1;

public class RecursionMemorization {
	public static void main(String[] args) {
		int factOf5Interative = factIterative(5);
		System.out.println(factOf5Interative); // 120
		
		int factOf5Recursive = factRecursion(5); 
		System.out.println(factOf5Recursive);
	}
	
	// factorial of n = n * n-1 * n-2 * ..... * 3 * 2 * 1
	public static int factIterative(int num) {
		int fact = 1;
		for(int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}
	
	public static int factRecursion(int num) {
		if(num == 0 || num == 1) return 1;
		return num * factRecursion(num - 1);
	}
	
	
}
