package ict.sp.test.ch7;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectLog {									
	
	@Around("execution(* ict.sp.test.ch7.*Chatting.**())")   //클래스 이름이 Chatting 끝남 , ** 라면 메소드 리턴 상관없음
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {		// point = ict.sp.test.ch7.*Chatting.**())
		System.out.println("실핼전");
		Object obj =pjp.proceed();
		System.out.println("실행후");
		return obj;
	}
}
