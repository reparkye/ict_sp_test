package ict.sp.test.ch1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("cg")
public class ConsoleGame {
	private Game game;
	
	public ConsoleGame() {
		System.out.println("난 xml 입니다..");
	}
	
	@Autowired
	@Qualifier("sonic")
	public void setGame(Game g) {
		this.game = g;
	}
	public void on() throws Exception {
		if(game==null) {
			throw new Exception("어휴 게임팩이 없네요");   
		}
		System.out.println("로딩 완료");
	}
	
	public void startGame() {
		game.start();
		game.attack();
		game.jump();
	}
	public void off() {
		game.end();
	}
}
