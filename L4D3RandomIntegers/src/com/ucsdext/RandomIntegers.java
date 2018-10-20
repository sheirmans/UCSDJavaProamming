package com.ucsdext;

import java.security.SecureRandom;
import java.util.Random;

public class RandomIntegers {
	public static void main(String[] args) {
		// Create random number generator
//		SecureRandom sr = new SecureRandom();   //this is more secure and more overhead
        Random sr = new Random();               // this is much faster without the secure
		for (int i = 1; i <= 20; i ++) {
			// A random number from 1 to 6
			int face = 1 + sr.nextInt(6);
			System.out.printf("%d ",  face);
			// If count divisible by 5, start new line
			if (i % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("Part 2 of demo");
		int freq1 = 0; // count of 1s rolled
		int freq2 = 0; // count of 2s rolled
		int freq3 = 0; // count of 3rd rolled

		System.out.println("Roll dice 60m times!");
		for (int roll = 1; roll <=60_000_000; roll++) {
			int face = 1 + sr.nextInt(6);
			switch(face) {
			case 1: freq1++; break;
			case 2: freq2++; break;
			case 3: freq3++; break;
			//TODO finish this
			}
		}
		System.out.println("Face\tFrequency");
		System.out.printf("1\t%d%n",freq1);
		System.out.printf("2\t%d%n",freq2);
		System.out.printf("3\t%d%n",freq3);
	}
}
