package ict.sp.test.ch1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class PreExecute {
	@Autowired
	List<Action> acList;
	
	public void attack() {
		for(Action g : acList) {
			g.attack();
			g.end();
			g.jump();
		}
	}
	
	public static void main(String[] args) {
		ApplicationContext ac; 
		ac = new ClassPathXmlApplicationContext("ch1/ioc.xml");
		
		PreExecute pr = (PreExecute) ac.getBean("preExecute");
		pr.attack();
		
	}
}
