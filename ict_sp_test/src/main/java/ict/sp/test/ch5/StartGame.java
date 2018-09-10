package ict.sp.test.ch5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartGame {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ch5/ioc.xml");
		AttackReplace ar = (AttackReplace) ac.getBean("ar");
		ar.getGc().attack();
		
	}
}
