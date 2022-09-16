package com.array;
//Calculate Substraction of two matrix
import java.util.Scanner;

public class Substraction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];

		int i, j;
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				System.out.println("\t Enter any value");
				a[i][j] = sc.nextInt();
				b[i][j] = sc.nextInt();

			}
		}
		System.out.println("*****Displaying Substraction of Two Array*****");
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {

				System.out.print("\t" + (a[i][j] - b[i][j]));

			}
			System.out.print("\n");
		}
	}

}
