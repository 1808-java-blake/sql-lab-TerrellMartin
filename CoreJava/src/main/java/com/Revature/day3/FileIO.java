package com.Revature.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
			bw.write("hello\n");
			bw.write("world");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			System.out.println("failed to write onto file");
		}

	}

}
