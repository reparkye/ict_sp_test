package ict.sp.test.ch9;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("god")
public class GodOfWar {
	@Autowired
	private List<Roma> romas;
	
	@Autowired
	@Qualifier("sul")
	private Roma roma1;
	
	@Autowired
	@Qualifier("ce")
	private Roma roma2;
	
	
	
	public List<Roma> getRomas(){
		return romas;
	}
	
	public Roma getSula() {
		return roma1;
	}

	public Roma getCeser() {
		return roma2;
	}

	public static void main(String[] args) {
		ApplicationContext ac;
		ac = new ClassPathXmlApplicationContext("ch9/ioc.xml");

		GodOfWar gow = (GodOfWar)ac.getBean("god");
		Sula s = (Sula) gow.getSula();
		s.attack();
	}
}
