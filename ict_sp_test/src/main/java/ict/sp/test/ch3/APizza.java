package ict.sp.test.ch3;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(3)
public class APizza implements Food{

	@Override
	public void sell() {
		System.out.println("에이피자를 팝니다.");
		
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		
	}

}
