package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class PhoneBookApp {

	public static void main(String[] args) throws IOException  {
		
		// Reader 준비
		   // 리더 + 버퍼 ; PhoneDB  / UTF-8
		
		Reader fr = new FileReader("C:\\javaStudy\\File\\PhoneDB_copy.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		
		// 반복
		// 파일을 1줄 읽는다
		//   , 로 분리한다 
		// String name;
		// String hp;
		// String company;
		
		
		// 반복문
		while(true) {
			// 파일을 한줄씩 읽는다
			String str = br.readLine();
			
			// null 이면 반복문 탈출한다 ( 글자가 없으면 )
			if(str == null) { 
				break;
			}
			
			// 읽어온 str을 split 으로 배열에 넣는다 (",") 를 통해 , 로 나눈다
			// , 로 나눈 값들을 배열로 저장한다.
			String[] personInfo = str.split(",");
			
			// 배열의 0번째 방은 name , 1번째 방은 hp , 2번째 방은 company 로 저장된다.
			String name = personInfo[0];
			String hp = personInfo[1];
			String company = personInfo[2];
			
			//출력한다
			System.out.println("이름: " + name);
			System.out.println("핸드폰: " + hp);
			System.out.println("회사: " + company);
			System.out.println("");
		
		}
		
		br.close();
	}

}
