package com.array;
//Create copy of Given Array into another array
import java.util.Scanner;

public class CopyArray {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int [][]a=new int[3][3];
		int [][]b=new int[a.length][a.length];
		int i,j;
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				System.out.println("\t Enter any Value");
				a[i][j]=sc.nextInt();
				b[i][j]=a[i][j];
			}
		}
		System.out.println("<<<<<< Displaying Value From Original (A) Array >>>>>>");
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				System.out.print("\t"+a[i][j]);
			}
			System.out.print("\n");
		}
		
		System.out.println("<<<<<< Displaying Value From Copy (B) Array >>>>>>");
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				System.out.print("\t"+b[i][j]);
			}
			System.out.print("\n");
		}
	}

}
