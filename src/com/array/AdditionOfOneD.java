package com.array;

import java.util.Scanner;

public class AdditionOfOneD {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int b[] = new int[5];
		int i;
		for (i = 0; i < a.length; i++) {
			System.out.println("\t Enter any values for Array");
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		System.out.println("\t <<<<<< Addition of Both Array >>>>>>");
		for (i = 0; i < a.length; i++) {
			System.out.print("\t" + (a[i] + b[i]));
		}
	}

}
