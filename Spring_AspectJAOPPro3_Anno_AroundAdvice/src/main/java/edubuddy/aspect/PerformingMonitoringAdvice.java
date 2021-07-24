package edubuddy.aspect;

import java.util.Arrays;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformingMonitoringAdvice {

	long starttime,endtime;
	
	@Around("execution(* edubuddy.service.*.*(..))")
	public Object pMonitor(ProceedingJoinPoint pjp) throws Throwable
	{
		starttime=System.currentTimeMillis();
		Object retval=pjp.proceed();
		endtime=System.currentTimeMillis();
		System.out.println(pjp.getSignature() +" with "+Arrays.toString(pjp.getArgs())+" has taken "+(endtime-starttime)+" ms");
		
		return retval;
		
	}
}