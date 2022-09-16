package com.array;

import java.util.Scanner;

//Accept value from user and find into 2D array
public class FindValueFromArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		int i, j;
		int count = 0;
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				System.out.println("\t Enter any value to Store in Array");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.print("\t Enter value for Search===>");
		int num = sc.nextInt();
		for (i = 0; i < a.length; i++) {

			for (j = 0; j < a.length; j++) {

				if (a[i][j] == num) {
					System.out.println(
							"Given number (" + num + ") is Present in Array at index of [(" + i + ") (" + j + ")]");
					count++;
				}

			}
		}
		if (count == 0) {
			System.out.println("Sorry...!!! Given number (" + num + ")is Not Present in Array");
		}
		System.out.println("<<<<<< Your Given Array is >>>>>>");
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				System.out.print("\t" + a[i][j]);
			}
			System.out.print("\n");
		}
	}

}
