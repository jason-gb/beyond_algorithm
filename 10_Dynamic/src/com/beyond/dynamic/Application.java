package com.beyond.dynamic;

import com.beyond.dynamic.practice.DynamicExample;

public class Application {

	public static void main(String[] args) {
		Long n = 90L ;
		
		System.out.printf(
				"피보나치 수열의 %d번째 값은 %d입니다.\n", n, DynamicExample.fibonacci(n));
		System.out.printf(
				"피보나치 수열의 %d번째 값은 %d입니다.\n", n, DynamicExample.fibonacci(n));

	}
}
