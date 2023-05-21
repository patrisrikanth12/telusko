package com.patrisrikanth12.live1;

import java.util.HashMap;

public class Fibonacci {
	
	static HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
	
	public static void main(String[] args) {
		int fib8 = fibonacci(8);
		System.out.println(fib8);
		
		int fibRecursive8 = fibonacciRecursive(8);
		System.out.println(fibRecursive8);
		
		int fibRecursiveMemorization8 = fibonacciRecursiveMemorization(8);
		System.out.println(fibRecursiveMemorization8);
	}
	
	// pos :    0  1  2  3  4  5  6  7  ....
	// fib series:0  1  1  2  3  5  8  13 ....
	public static int fibonacci(int pos) {
		
		if(pos == 0) return 0;
		if(pos == 1) return 1;
		 
		int a = 0;
		int b = 1;
		int c = 0;
		
		for(int i = 2; i <= pos; i++ ) {
			c = a + b;
			a = b;
			b = c;
		}
		
		return c;
	}
	
	public static int fibonacciRecursive(int pos) {
		if(pos == 0) return 0;
		if(pos == 1) return 1;
		
		int res = fibonacciRecursive(pos - 1) + fibonacciRecursive(pos - 2);
		
		return res;
	}
	
	public static int fibonacciRecursiveMemorization(int pos) {
		if(pos == 0) return 0;
		if(pos == 1) return 1;
		if(cache.containsKey(pos)) {
			return cache.get(pos);
		}
		
		int res = fibonacciRecursive(pos - 1) + fibonacciRecursive(pos - 2);
		cache.put(pos, res);
		
		return res;
	}
}
