package com.array;

//create 2 array 3*3 store value and display
import java.util.Scanner;

public class ArraySimple {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int i, j;

		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				System.out.println("\n\t Enter any integer value");
				a[i][j] = sc.nextInt();
				b[i][j] = sc.nextInt();

			}
		}
		System.out.println("\n\t******Displaying value from 1st 2D Array******");
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				System.out.print("\t" + a[i][j]);

			}
			System.out.print("\n");
		}
		System.out.println("\n\t******Displaying value from 2nd 2D Array******");
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				System.out.print("\t" + b[i][j]);

			}
			System.out.print("\n");
		}

	}

}
