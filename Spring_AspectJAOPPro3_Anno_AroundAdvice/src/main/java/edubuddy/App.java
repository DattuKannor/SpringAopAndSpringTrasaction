package edubuddy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import edubuddy.service.IntrAmtCalculation;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/main/java/edubuddy/cfgs/applicationContext.xml");

		IntrAmtCalculation proxy = ctx.getBean("iac", IntrAmtCalculation.class);

		System.out.println("Simple amt " + proxy.calcCompoundIntrAmt(60000, 20, 1));
	}
}
