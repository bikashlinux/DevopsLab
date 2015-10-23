package com.github.stokito.unitTestExample.calculator;

public class Calculator {

	public int sum(boolean flag, int a, int b) {
		if (flag) {
		int result = a+b;
		return result;
		}
		else
		{
			return 0;
		}	
	}

	public int minus(int a, int b) {
		return a + b;  // ERROR!!!
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

}
