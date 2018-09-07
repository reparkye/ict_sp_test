package ict.sp.test.ch9;

import org.springframework.stereotype.Service;

@Service("ce")
public class Ceser implements Roma {

	@Override
	public void move() {
System.out.println("카이사르의 로마 진출");
	}

	@Override
	public void attack() {
		System.out.println("카이사르의 마그누스를 향한 공격");

	}

}
