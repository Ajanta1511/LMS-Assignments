package com.manipal.spring_core_demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.manipal.spring_core_demo2.model.Employee;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ){
    	//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	ApplicationContext context = new FileSystemXmlApplicationContext("src\\main\\java\\spring.xml");
    	//ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\kumareshg\\Desktop\\spring.xml");
    	
    	//C:\Users\kumareshg\Desktop
    	Employee emp = (Employee) context.getBean("employee");
    	
    	System.out.println(emp.getEmpName() + "\t" +emp.getSalary() + 
    			"\t" + emp.getAddress().getCity() +"\t" + emp.getAddress().getPin());
    	
    	System.out.println(emp);
    	
    }
}
