package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		// 파일 위치 입력 + thorws IOException 을 통해 파일이없을경우의 예외를 try~catch~로 적어야함
		
		InputStream in = new FileInputStream("C:\\javaStudy\\File\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\File\\byteimg.jpg");
		
		// 복사시작
		while(true) {
			int data = in.read();
			System.out.println(data);
			
			if (data == -1) {
				System.out.println("반복문 끝" + data);
				break;
			}
			out.write(data);
		}
		
		out.close();
		in.close();
		
		// 단점 : 속도가 느림 -> 속도를 빠르게 해주는 기능을 사용해야함
		// 

	}

}
