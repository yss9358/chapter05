package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		
		
		// Out
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\File\\PhoneDB.txt");
		OutputStreamWriter ow = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(ow);
		
		bw.write("이정재,010-2222-2222,02-4332-9090");
		bw.newLine();
		bw.write("정우성,011-0000-23451,02-6552-2341");
		bw.newLine();
		bw.write("유재석,010-5555-5555,02-7552-9994");
		bw.newLine();
		bw.write("이효리,011-9999-7777,02-900-9888");
		
		
		
		
		
		
		bw.close();
		
	}

}
