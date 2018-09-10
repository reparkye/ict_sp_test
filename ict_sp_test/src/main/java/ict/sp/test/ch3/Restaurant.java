package ict.sp.test.ch3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
@Service("rest")
public class Restaurant {
	@Autowired						//파스타던 피자던 전부 같이 넣어준다.
	private List<Food> foods;
	
	@Autowired
	@Qualifier("pas")
	private Food food1;
	
	@Autowired
	@Qualifier("pizza")
	private Food food2;
	
	public List<Food> getFoods(){
		return foods;
	}
	
	public Food getPasta() {
		return food1;
	}
	
	public Food getPizza() {
		return food2;
	}
	
	public static void main(String[] args) {
		ApplicationContext ac;
		ac = new ClassPathXmlApplicationContext("ch3/ioc.xml"); //프리로딩이라 실행하는 순간 미리 다 읽어 
														//놔서 관계없는것에 에러가 발생해도 전부 에러가 된다.

		Restaurant r = (Restaurant) ac.getBean("rest");
		/*Pizza p = (Pizza) r.getPizza();
		p.sell();*/
		List<Food> foodList = r.getFoods();
		for(Food f : foodList) {
			f.sell();
		}
	
	}
}
