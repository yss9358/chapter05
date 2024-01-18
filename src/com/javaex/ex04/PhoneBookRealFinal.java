package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PhoneBookRealFinal {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader(("C:\\javaStudy\\File\\PhoneDB_원본.txt")));
		BufferedWriter bw;
		List<Person> pList = new ArrayList<>();
		
		while(true) {
			
			String str = br.readLine();
			if(str==null) {
				break;
			}
			
			String[] info = str.split(",");
			String name = info[0];
			String hp = info[1];
			String company = info[2];
			
			Person p = new Person(name,hp,company);
			
			pList.add(p);
			
		}
		
		Person p = new Person("유승수","010-1234-1234","010-4321-4321");
		pList.add(p);
		
		pList.get(0).draw();
		pList.get(1).draw();
		pList.get(2).draw();
		pList.get(3).draw();
		
		bw =  new BufferedWriter(new FileWriter(("C:\\javaStudy\\File\\PhoneDB_원본.txt")));
		
		for (int i=0; i<pList.size(); i++) {
			
			bw.write(pList.get(i).getName() + "," + pList.get(i).getHp() + "," + pList.get(i).getCompany());
			bw.newLine();
			bw.flush();
			
		}
		
		
		bw.close();
		br.close();

	}

}
