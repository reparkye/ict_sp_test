package ict.sp.test.ch5;

public class Marine implements GameCharacter{

	@Override
	public void attack() {
		System.out.println("총을 쏜다.");
	}

	@Override
	public void deffence() {
		System.out.println("매딕을 찾는다~!!!");
		
	}

}
