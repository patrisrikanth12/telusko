package com.patrisrikanth12.live1;

import java.util.HashMap;

public class Assignment {
	
	public static HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
	
	public static void main(String[] args) {
		// to print 7 lines of pascal triangle
		pascalTriangle(0);
	}
	
	// this function prints n + 1 lines of pascal triangle
	public static void pascalTriangle(int n) {
		
		if(n < 0) return;
		
		if(n >= 0) pascalTriangle(n-1);
		
		for(int i = 0; i <= n; i++) {
			System.out.print(ncr(n, i) + " ");
		}
		
		System.out.println();
	}
	
	public static int ncr(int n, int r) {
		return fact(n) / (fact(n - r) * fact(r));
	}
	
	public static int fact(int n) {
		if(n == 0 || n == 1) return 1;
		if(cache.containsKey(n)) return cache.get(n);
		
		int res = n * fact(n-1);
		cache.put(n, res);
		return res;
	}
}
