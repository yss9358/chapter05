package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		// Reader 연습
		// Reader 는 기본적으로 UTF-8로 읽어온다.
		Reader fr = new FileReader("C:\\javaStudy\\File\\MS949.txt"); // MS949 방식으로 저장된 값을 불러오려고 한다.
		BufferedReader br = new BufferedReader(fr);
		
		// UTF-8이 아닌 다른 방식으로 불러올 수 있도록 추가로 코드를 짜야한다.
		
		while(true) {
			
			String str = br.readLine(); 
			
			if(str == null) {
				break;
			}
			
			System.out.println(str);
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		br.close();
		
	}

}
