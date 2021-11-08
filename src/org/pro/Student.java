package org.pro;

public class Student {
	public void studInfo(int Id) {
		System.out.println("Student Id is:"+Id);
	}
	public void studInfo(String name) {
		System.out.println("Stucent name is:"+name);
	}
	public void studInfo(boolean status) {
		System.out.println("student status is:"+status);
	}
	public void studInfo(char gender) {
		System.out.println("Student gender is:"+gender);
	}
	public void studInfo(long phone) {
		System.out.println("Student phone number is:"+phone);
	}
	public void studInfo(float salary) {
		System.out.println("Student salary info is:"+salary );
	
	}
	public static void main(String[] args) {
		Student a = new Student();
		a.studInfo(true);
		a.studInfo('F');
		a.studInfo(500000f);
		a.studInfo(45425454);
		a.studInfo(9790640803l);
		a.studInfo("Sarah");
		
	}

}
