package com.array;

//Calculate Addition of two matrix
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int i, j;
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				System.out.println("\n\t Enter any values");
				a[i][j] = sc.nextInt();
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("\n\t****Display addition****");
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				System.out.print("\t" + (a[i][j] + b[i][j]));
			}
			System.out.print("\n");
		}
	}

}
