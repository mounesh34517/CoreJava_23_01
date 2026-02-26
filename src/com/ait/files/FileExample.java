package com.ait.files;

import java.io.*;

public class FileExample {

	public static void main(String[] args) throws IOException {
		
		File file=new File("tuesday.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		FileReader fr=new FileReader(file);
		for (int i = 1; i <= file.length(); i++) {
			System.out.print((char) fr.read());
		}
		
		fr.close();
	}

}


















