package com.ait.arrays;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the row and col size of Matrix:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		int mat1[][]=new int[row][col];
		int mat2[][]=new int[row][col];
		
		
		System.out.println("Enter Matrix 1 Data:");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Enter Matrix:"+"["+i+"]["+j+"]:");
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Matrix 2 Data:");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Enter Matrix:"+"["+i+"]["+j+"]:");
				mat2[i][j]=sc.nextInt();
			}
		}
		int mat3[][]=new int[row][col];
		
		System.out.println("Addition of Mat1 and Mat2:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				
				mat3[i][j]=mat1[i][j]+mat2[i][j];
				System.out.print(mat3[i][j]+" ");
			}
			System.out.println();
		}

	}

}
