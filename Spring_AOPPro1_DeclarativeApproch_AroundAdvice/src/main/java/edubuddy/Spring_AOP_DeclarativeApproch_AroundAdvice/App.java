 package edubuddy.Spring_AOP_DeclarativeApproch_AroundAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import edubuddy.service.IntrAmtCalculator;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// Cretae IOC Container
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/edubuddy/cfgs/applicationContext.xml");
	    IntrAmtCalculator proxy=context.getBean("pfb",IntrAmtCalculator.class);
	    
	    //call b.method
	    float intrAmt=proxy.calclIntrAmtname(80000, 2, 20);
	    System.out.println("Intr "+intrAmt);
	}
}
