package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("C:\\javaStudy\\File\\song.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		while(true) {
			// str 변수에 담는다 .
			String str = br.readLine(); // readLine 은 한 줄 씩 읽어온다. 
			
			// str은 값을 담아놓은 주소값. 주소값을 비교하기 위해 equals 가 아니라 == 을 사용한다
			// str값을 비교하는게 아니라 str 주소값을 비교하는것이기 때문에 == 가 필요함.
			if(str == null) { 
				break;
			}
			
			System.out.println(str); // 한줄씩 불러온 str을 출력한다.
		}
		
		br.close();
		
	}

}
