package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneBookFinal {

	public static void main(String[] args) throws IOException {
		
		
		
		String str = null;
		String data = "C:\\javaStudy\\File\\PhoneDB_원본.txt";
		
		Reader fr = new FileReader(data);
		BufferedReader br = new BufferedReader(fr);
	
		List<Person> pList = new ArrayList<Person>();
		
		
		while(true) {
			str = br.readLine();
			if(str == null) {
				break;
			} 
			
			String[] info = str.split(",");
			String name = info[0];
			String hp = info[1];
			String company = info[2];
			
			Person p = new Person();
			p.setName(name);
			p.setHp(hp);
			p.setCompany(company);
			
			pList.add(p);
			
		}
		
		Person p01 = new Person("유승수","010-1234-1234","010-4321-4321");
		pList.add(p01);
		
		
	
		
		System.out.println(pList);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		br.close();
		
	}

}
