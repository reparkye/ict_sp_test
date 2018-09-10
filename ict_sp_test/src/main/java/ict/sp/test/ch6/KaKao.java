package ict.sp.test.ch6;

import org.springframework.aop.framework.ProxyFactory;

public class KaKao {
	
	public static void main(String[] args) {
		Chatting c = new ICTChatting();
		ProxyFactory pf = new ProxyFactory();
		ChatAdvice ac = new ChatAdvice();	//가로채서 
		pf.addAdvice(ac);				//
		pf.setTarget(c);				//
		
		Chatting pc = (Chatting)pf.getProxy();    //c를 실행한것이 아니라 프록시에서 받아온것을 실행한다.
		pc.chat();
		System.out.println(pc.getFile());
	}
}
