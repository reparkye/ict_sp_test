package ict.sp.test.ch4;

public class Tiger implements Animal {

	@Override
	public void attack() {
		System.out.println("즉사히지 않을까?");
	}

	@Override
	public void howl() {
		System.out.println("어흥");
	}

	@Override
	public void sleep() {
		System.out.println("고롱고롱~!!");
	}

}
