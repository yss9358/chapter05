package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		// in
		InputStream in = new FileInputStream("C:\\javaStudy\\File\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);
        
		// out 
		OutputStream out = new FileOutputStream("C:\\javaStudy\\File\\buffedimg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		System.out.println("복사시작");
		
		while(true) {
			int data = bin.read();
			
			if (data == -1) {
				System.out.println("복사끝");
				break;
			}
			
			bout.write(data);
		}
		
		bout.close();
		bin.close();
	
	}

}
