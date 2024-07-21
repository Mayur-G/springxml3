package com.springxml3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springxml3.Student;

public class Client {
	
	public static void main(String[] args) {
		
//		Student student = new Student();
//		MathCheat cheat = new MathCheat();
//		student.setMathCheat(cheat);
//		student.cheating();
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		Student s2 = context.getBean("student",Student.class);
//		s2.cheating();
//		
//		AnotherStudent anotherStudent = context.getBean("anotherStudent",AnotherStudent.class);
//		anotherStudent.startCheating();
		
		//interface Cheat
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student s2 = context.getBean("student",Student.class);
		s2.cheating();
	
		
	}
}
