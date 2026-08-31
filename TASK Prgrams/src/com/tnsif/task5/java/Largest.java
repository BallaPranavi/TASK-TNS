package com.tnsif.task5.java;

public class Largest {
	public static void main(String[] args) {
		int a = 10;
        int b = 25;
        int c = 15;
        if (a >= b && a >= c) {
        	System.out.println("Largest: " + a);
        }
        else if (b >= a && b >= c) {
            System.out.println("Largest: " + b);
        }
        else {
            System.out.println("Largest: " + c);
        }
    }
}