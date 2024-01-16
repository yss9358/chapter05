package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		
		// InputStream -> InputStreamReader -> BufferedReader 순서로 불러온다.
		// InputStream 이진법으로 받아들인다
		// InputStreamReader 문자형태로 받아들인다
		// BufferedReader 문자형태로 받아들이는 속도를 올려준다
		
		
		// In
		InputStream in = new FileInputStream("C:\\javaStudy\\File\\MS949.txt"); // MS949형태의 파일을 불러오려고한다.
		InputStreamReader isr = new InputStreamReader(in, "MS949"); // 
		//InputStreamReader(in, MS949) 는 in 의 주소값을 MS949방식으로 받아들일 수 있도록 번역기를 부른거
		BufferedReader br = new BufferedReader(isr);
		
		// Out
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\File\\MS949-copy.txt"); // 경로를 설정하는 순간 파일이 초기화 되므로 copy버전을 만들어 두고 작성먼저한다
		OutputStreamWriter osw = new OutputStreamWriter(out, "MS949"); 
		// MS949 파일로 보내서 저장하게 끔 OutputStreamWriter(out, "MS949") 로 작성
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		
		
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			// System.out.println(str);  // 출력해서 보기위한 코드
			bw.write(str); // 읽어온 결과값을 파일에 보낸다.
			bw.newLine(); // 한줄씩 읽어온 값을 보내고 줄바꿈을 위해 newLine()을 작성함
		}
		
		bw.close();
		br.close();
		
	}

}
