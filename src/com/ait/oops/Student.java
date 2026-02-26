package com.ait.oops;

import java.util.*;

class StudentData{
	
	int sid;
	String sname;
	String[] courses;
	double[] grades;
	
	StudentData(){
		System.out.println("Its Class Default Constructor...");
	}
	
	StudentData(int id, String name){
		sid=id;
		sname=name;
	}
	StudentData(StudentData st){
		sid=st.sid;
		sname=st.sname;
	}
	
	void display() {
		System.out.println("SId:"+sid+" Name:"+sname+" Courses:"+courses+" Grades:"+grades);
	}
	
}

public class Student {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		while(true) {
			System.out.println("----Student Management Menu----");
			System.out.println("1. Add Student");
			System.out.println("2. List Students");
			System.out.println("3. Update Student Courses and Grade");
			System.out.println("4. Exit.");
			System.out.println("Enter Your choice:");
			int choice=sc.nextInt();
			StudentData s1;
			switch(choice) {
			case 1:
				System.out.println("Enter Student id:");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Student Name:");
				String name=sc.nextLine();
				StudentData s=new StudentData();
				s1=new StudentData(id,name);
				s1.display();
				StudentData s2=new StudentData(s1);
				s2.display();
				System.out.println("Student creation is done.");
				break;
			
			case 4:
				System.out.println("Thank you for Using.");
				sc.close();
				return;
			}
		}
	}

}



















