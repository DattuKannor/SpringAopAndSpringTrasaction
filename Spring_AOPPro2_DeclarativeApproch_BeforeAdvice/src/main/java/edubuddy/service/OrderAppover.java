package edubuddy.service;

import java.util.Calendar;

public class OrderAppover {
	
	public String approveOrder(int orderId)
	{
		//get syster date
		Calendar cl=Calendar.getInstance();
	//get date current month
		int month=cl.get(Calendar.MONTH);
		
		if(month>=7 && month<=10)
		{
			return orderId+" order is not approved";
		}
		else
		{
			return orderId+" order is approved";
		}
	}

}
