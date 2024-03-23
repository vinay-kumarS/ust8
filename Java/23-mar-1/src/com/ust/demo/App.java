package com.ust.demo;
public class App {

	public static void main(String[] args) {
		//how do i create an object of Employee class?
//		new Employee();
		Employee raja=new Employee(121, "Raja", "Sivakumar", "CSE");
		Employee ravi=new Employee(121,"Ravi","Kumar","ECE");
		System.out.println(raja.equals(ravi));
	}

}
