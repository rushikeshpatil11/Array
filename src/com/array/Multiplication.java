package com.array;

import java.util.Scanner;

//Multiplication of Two Arrays
public class Multiplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i, j;
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				System.out.println("\t Enter any Values to store in both Arrays");
				a[i][j] = sc.nextInt();
				b[i][j] = sc.nextInt();

			}
		}
		System.out.println("<<<<<< Multipication of Both Arrays >>>>>>");
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				System.out.print("\t" + (a[i][j] * b[i][j]));

			}
			System.out.print("\n");
		}
	}

}
