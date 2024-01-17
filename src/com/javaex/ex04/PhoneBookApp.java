package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class PhoneBookApp {

	public static void main(String[] args) throws IOException{ // 예외처리를 해준다.
		
		
		// 쓰기 빨대쓰면 파일 다 지워짐
		// 파일에서 읽어온 내용을 리스트로 관리
		// 이름 핸드폰 회사 -> person class 추가
		
		// 자신의 정보를 person 리스트에 추가하고
		// 리스트 전체 내용을 PhoneDB.txt 에 쓴다

		// Reader 
		Reader fr = new FileReader("C:\\javaStudy\\File\\PhoneDB.txt"); // Reader 로 파일을 읽어온다.
		BufferedReader br = new BufferedReader(fr); // BufferedReader 로 빠르게 읽어올 수 있도록 한다.
		
		// Writer
		Writer fw = new FileWriter("C:\\javaStudy\\File\\PhoneDB.txt"); // Writer 로 파일에 작성할 수 있도록 한다.
		BufferedWriter bw = new BufferedWriter(fw); // BufferedWriter 로 빠르게 전달할 수 있도록 한다.
		
		List<Person> pList = new ArrayList<Person>(); // 읽어 온 정보들을 보관하기 위해 pList를 만든다.
		
		Person p01 = new Person("유승수","010-1234-1234","010-4321-4321"); // 내정보를 추가하기 위해 생성자를 불러와서 값을 저장한다.
		
		pList.add(p01); // pList에 내 정보를 추가한다.
		
		while(true) { // 내용을 전부 읽어오기 위해 while반복문을 사용한다.
			
			String str = br.readLine(); // 한줄을 읽어온다.
			
			if(str == null) { // str의 주소에 내용이 없으면(null) 종료한다. null 이면 종료되기 때문에 읽어온 다음 바로확인 할 수 있도록 위에 작성.
				break;
			}
			
			String[] info = str.split(","); // 읽어온 파일을 , 를 기준으로 배열에 넣을 수 있도록 한다.

			String name = info[0];    // 0 번째방에 name 저장
			String hp = info[1];      // 1 번째방에 hp 저장  
			String company = info[2]; // 2 번째방에 company 저장
			
			//System.out.println( str );  // 읽어온 값이 제대로 들어왔는지 확인하기 위해 사용
		    //System.out.println(info[1].toString()); // split 을 통해 personInfo 배열에 담김.
			
		  
		    Person p = new Person(name,hp,company); // 생성자를 불러와서 p를 만든다. p는 name hp company가 들어있은 주소값 -> person 에 저장.
		    
		    		    
		    pList.add(p); // p값을 pList에 추가한다
		    
		    for(int i=0; i<pList.size(); i++) {
				bw.write(pList.get(i).getName());
				bw.write(pList.get(i).getHp());
				bw.write(pList.get(i).getCompany());
				bw.newLine();
			}

		}
	
		for(int i=0; i<pList.size(); i++) { // 추가된 정보값을 포함하여 pList를 확인한다.
			System.out.println("이름: " + pList.get(i).getName());
			System.out.println("핸드폰: " + pList.get(i).getHp());
			System.out.println("회사: " + pList.get(i).getCompany());
			System.out.println("");
		}
		
		
		
		
		
		
		//bw.close(); // bw 종료
		br.close(); // br 종료
		
	}

}
