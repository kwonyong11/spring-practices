package com.bitacademy.aoptest.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

	@Before("execution(public com.bitacademy.aoptest.vo.ProductVo com.bitacademy.aoptest.service.ProductService.find(String))")
	public void beforeAdvice() {
		System.out.println("--- before Advice ---");
	}

	@After("execution(* *..*.service.ProductService.*(..))")
	public void afterAdvice() {
		System.out.println("--- after Advice ---");
	}

	@AfterReturning("execution(* *..*.service.ProductService.*(..))")
	public void afterReturningAdvice() {
		System.out.println("--- afterReturning Advice ---");
	}

	@AfterThrowing(value = "execution(* *..*.*.ProductService.*(..))", throwing = "ex")
	public void afterThrowingAdvice(Throwable ex) {
		System.out.println("--- afterThrowing Advice : " + ex + "---");
	}

	@Around("execution(* *..*.*.ProductService.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable{
		// before advice
		System.out.println("--- @Around(before) Advice ---");
		
		// pointCut Method 실행
		
		// 파라미터 가로채기(바꿔버리기)
		// Object[] params = {"camera"};
		// Object result = pjp.proceed(params);
		
		Object result = pjp.proceed();
		
		// after advice
		System.out.println("--- @Around(after) Advice ---");
		
		return result;
	}
}
