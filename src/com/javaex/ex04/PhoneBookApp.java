package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneBookApp {

	public static void main(String[] args) throws IOException{ // 예외처리를 해준다.
		
		
		// 쓰기 발대쓰면 파일 다 지워짐
		// 파일에서 읽어온 내용을 리스트로 관리
		// 이름 핸드폰 회사 -> person class 추가
		
		// 자신의 정보를 person 리스트에 추가하고
		// 리스트 전체 내용을 PhoneDB.txt 에 쓴다
	
		// PhoneDB에서 파일을 읽어온다.
		// 읽어 올 수 있게 Reader,BufferedReader 준비
		// Person 에 ArrayList 를 만들어 관리 -> pList
		// 읽어 온 파일을 ,로 분리 -> String.split(",") 사용
		// 읽어 온 파일을 pList에 저장한다. pList.add();
		// PhoneDB에 추가할 수 있게 Writer,BufferedWriter를 준비
		// pList 에 자신의 정보를 추가한다.
		
		Reader fr = new FileReader("C:\\javaStudy\\File\\PhoneDB.txt"); // Reader 로 파일을 읽어온다.
		BufferedReader br = new BufferedReader(fr); // BufferedReader 로 빠르게 읽어올 수 있도록 한다.
		
		List<Person> pList = new ArrayList<Person>();
		
		
		while(true) { // 내용을 전부 읽어오기 위해 while반복문을 사용한다.
			
			String str = br.readLine(); // 한줄을 읽어온다.
			
			if(str == null) { // str의 주소에 내용이 없으면(null) 종료한다. null 이면 종료되기 때문에 읽어온 다음 바로확인 할 수 있도록 위에 작성.
				break;
			}
			
			String[] personInfo = str.split(","); // 읽어온 파일을 , 를 기준으로 배열에 넣을 수 있도록 한다.

			String name = personInfo[0]; 
			String hp = personInfo[1];
			String company = personInfo[2];
			
			//System.out.println(str);  // 읽어온 값이 제대로 들어왔는지 확인하기 위해 사용
			//System.out.println(personInfo[2].toString()); // split을 통해 personInfo 배열에 담김.
		}
		
		
		
		
		
		
		
		
		
		
		
		
		br.close(); // br을 종료
		
	}

}
