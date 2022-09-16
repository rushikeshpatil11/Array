package com.array;
//Create transpose of given matrix
import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		int i, j;
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				System.out.println("Enter any value");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("<<<<<< Simple Matrix >>>>>>");

		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				System.out.print("\t" + a[i][j]);
			}
			System.out.print("\n");
		}
		System.out.println("<<<<<< Transpose Matrix >>>>>>");

		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				System.out.print("\t" + a[j][i]);
			}
			System.out.print("\n");
		}
	}

}
