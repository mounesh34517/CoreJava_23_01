package com.ait.oops;

import java.util.Scanner;

class Employee{
	
	private int empId;
	private String empName;
	private double salary;
	private String address;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

public class EmployeeApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter How many Employees you want to add:");
		int noOfEmps=sc.nextInt();
		Employee[] emps=new Employee[noOfEmps];
		
		for(int i=0;i<emps.length;i++) {
			
			emps[i]=new Employee();
			System.out.println("Enter employee "+(i+1)+" Id:");
			emps[i].setEmpId(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter employee "+(i+1)+" Name:");
			emps[i].setEmpName(sc.nextLine());
			System.out.println("Enter employee "+(i+1)+" Salary:");
			emps[i].setSalary(sc.nextDouble());
			sc.nextLine();
			System.out.println("Enter employee "+(i+1)+" Address:");
			emps[i].setAddress(sc.nextLine());
			
		}
		System.out.println("====Employee Details====");
		for (Employee emp : emps) {
			System.out.println("Employee Id :" + emp.getEmpId());
			System.out.println("Employee Name :" + emp.getEmpName());
			System.out.println("Employee Salary :" + emp.getSalary());
			System.out.println("Employee Address :" + emp.getAddress());
			System.out.println("-------------------------");
		}
	}

}



















