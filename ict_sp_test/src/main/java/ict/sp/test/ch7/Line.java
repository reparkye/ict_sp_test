package ict.sp.test.ch7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Line {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ch7/ioc.xml");
		Chatting c = (Chatting)ac.getBean("ictc");
		System.out.println(c.getFile());
		
	}
}
