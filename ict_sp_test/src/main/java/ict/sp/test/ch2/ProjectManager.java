package ict.sp.test.ch2;

import org.springframework.stereotype.Service;

@Service		//이름 안써주면 ProjectManager 소문자
public class ProjectManager implements Emp {

	@Override
	public void goForWork() {
		System.out.println("플젝관리자가 출근합니다.");
	}

	@Override
	public void doWorking() {
		System.out.println("플젝관리자님이 일하는척을 시연중입니다.");
	}

	@Override
	public void geHome() {
		System.out.println("외근은 곧 퇴근!");
	}

}
