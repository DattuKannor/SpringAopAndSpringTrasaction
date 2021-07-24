package edubuddy.Spring_AOPPro2_DeclarativeApproch_BeforeAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import edubuddy.service.OrderAppover;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext contxt=new FileSystemXmlApplicationContext("src/main/java/edubuddy/cfgs/applicationContext.xml");
    
    OrderAppover service=contxt.getBean("pfb",OrderAppover.class);
    
    //call b.method
   // System.out.println("Order approved ? "+service.approveOrder(1234));
    System.out.println("Order approved ? "+service.approveOrder(-4567));
    //System.out.println("Order approved ? "+service.approveOrder(0));


    
    }
}
