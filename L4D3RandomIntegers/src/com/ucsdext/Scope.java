package com.ucsdext;

public class Scope {
    private static int x=1; //Class variable
    
	public static void main(String[] args) {
		System.out.println("x " + x);
		int x = 5; // Local Variable
		System.out.println("x " + x);
        useLocalVariable();
        userField();
        System.out.printf("x %d%n", x);
	}
	
    private static void userField() {
    	System.out.printf("x %d%n", x);
	}

	private static void useLocalVariable() {
		int x = 25;
	    System.out.printf("x %d%n", x);

	}

	//Method Overloading
	private static int sum(int num1, int num2) {
		return num1 + num2;
	}
	private static double sum(double num1, double num2) {
		return num1 + num2;   //method of signature is used here
	}
}
