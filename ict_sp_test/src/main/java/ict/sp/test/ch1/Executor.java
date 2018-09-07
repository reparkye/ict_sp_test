package ict.sp.test.ch1;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

public class Executor {


	public static void main(String[] args) {
		DefaultListableBeanFactory fac; 
		fac = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader; 
		reader = new XmlBeanDefinitionReader(fac);
		FileSystemResource fr;
		fr = new FileSystemResource("src/main/resources/ch1/ioc.xml");
		reader.loadBeanDefinitions(fr);
		
		ConsoleGame cg = (ConsoleGame)fac.getBean("cg");
		try {
			cg.on();
			cg.startGame();
		} catch (Exception e) {
			e.printStackTrace();
		}
		cg.off();
	}
}
