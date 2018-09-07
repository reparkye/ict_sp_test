package ict.sp.test.ch9;

import org.springframework.stereotype.Service;

@Service("sul")
public class Sula implements Roma {

	@Override
	public void move() {
		System.out.println("술라의 로마 진출");
	}

	@Override
	public void attack() {
		System.out.println("술라의 카르보를 향한 공격");
	}

}
