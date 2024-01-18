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

public class PhoneBookFinal {

	public static void main(String[] args) throws IOException {
		
		
		
		String str = null;
		String data = "C:\\javaStudy\\File\\PhoneDB_원본.txt";
		
		Reader fr = new FileReader(data);
		BufferedReader br = new BufferedReader(fr);
	
		List<Person> pList = new ArrayList<Person>();
		
		Person p01 = new Person("유승수","010-1234-1234","010-4321-4321");
		pList.add(p01);
		
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
		
		
		
		BufferedWriter bwr = new BufferedWriter(new FileWriter("C:\\javaStudy\\File\\PhoneDB.txt"));
		
		for(int i=0; i<pList.size(); i++) {
		
			bwr.write(pList.get(i).getName());
			bwr.newLine();
			bwr.flush();
		
		}
	
		
		
		System.out.println(pList);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		br.close();
		
	}

}
