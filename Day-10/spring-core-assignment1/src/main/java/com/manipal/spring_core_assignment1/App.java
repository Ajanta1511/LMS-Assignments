package com.manipal.spring_core_assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.manipal.spring_core_assignment1.model.Line;
import com.manipal.spring_core_assignment1.model.Point;
import com.manipal.spring_core_assignment1.model.Triangle;


public class App {
    public static void main( String[] args ){
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	//ApplicationContext context = new FileSystemXmlApplicationContext("src\\main\\java\\spring.xml");
    	//ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\kumareshg\\Desktop\\spring.xml");

    	Point p = (Point) context.getBean("point");
    	Line l = (Line) context.getBean("line");
    	Triangle t = (Triangle) context.getBean("triangle");
    	
    	System.out.println(p.getX() + "\t" +p.getY());
    	System.out.println(l.getPoint1().getX() + "\t" +l.getPoint1().getY()+ "\t" +l.getPoint2().getX()+ "\t" +l.getPoint2().getY());
    	System.out.println(t.getP1().getX() + "\t" +t.getP1().getY()+ "\t" +t.getP2().getX()+ "\t" +t.getP2().getY()+ "\t" +t.getP3().getX()+ "\t" +t.getP3().getY());
    	
    	
    }
}
