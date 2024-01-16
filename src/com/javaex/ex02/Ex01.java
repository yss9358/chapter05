package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		// Writer 변수명 = new FileWriter("주소"); 
		// try ~ catch ~ 로 예외처리를 해주어야함
		// 같은 이름의 파일이 있을경우 덮어써버림 **주의
		
		Writer fw = new FileWriter("C:\\javaStudy\\File\\song.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("학교종이 땡땡땡");
		//bw.write("\n"); // \n 줄바꿈
		bw.newLine(); // 줄바꿈 .
		bw.write("어서 모이자");
		bw.newLine();
		bw.write("선생님이 우리를");
		bw.newLine();
		bw.write("기다리신다.");
		
		bw.close(); // bw 만 close 해주면 fw 도 close 됨
		
	}

}
