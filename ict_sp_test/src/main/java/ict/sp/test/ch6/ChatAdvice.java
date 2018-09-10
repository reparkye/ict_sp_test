package ict.sp.test.ch6;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ChatAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("채팅 시작전");
		Object obj = mi.proceed();						//mi.proceed(); 이걸로 쓰면 밑의 리턴값이 null						
		System.out.println("채팅 실핼끝");
		return obj;										//return null	
	}

	
}
