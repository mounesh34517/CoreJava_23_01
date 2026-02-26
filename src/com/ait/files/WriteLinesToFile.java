package com.ait.files;


import java.io.*;
import java.util.Scanner;
public class WriteLinesToFile {

	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		File file=new File("data.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		FileWriter fw=new FileWriter(file,true);
		BufferedWriter bw=new BufferedWriter(fw);
		
		System.out.println("How many line you want to store:");
		int noOfLines=sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=noOfLines;i++) {
			System.out.println("Enter line "+i+" data:");
			String data=sc.nextLine();
			bw.write(data);
			bw.newLine();
		}
		System.out.println("Data stored successfully...");
		bw.close();
		fw.close();
		
		sc.close();
	}

}
