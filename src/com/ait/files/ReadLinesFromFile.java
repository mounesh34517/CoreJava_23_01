package com.ait.files;

import java.io.*;
import java.util.Scanner;
public class ReadLinesFromFile {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		Scanner sc=new Scanner(System.in);
		File file=new File("data.txt");
		if (!file.exists()) {
			System.out.println("Required File not found...");
			return;
		}
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		System.out.println("Enter how many lines you want to read:");
		int noOfLines=sc.nextInt();
		sc.nextLine();
		
		for(int i=1;i<=noOfLines;i++) {
			String lineData=br.readLine();
			if(lineData!=null) {
				System.out.println("Line "+i+" data: "+lineData);
			}
			else {
				System.out.println("No more lines to read...");
				break;
			}
			
		}
	}

}


















