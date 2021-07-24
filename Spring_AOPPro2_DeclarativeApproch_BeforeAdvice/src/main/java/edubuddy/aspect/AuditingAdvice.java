package edubuddy.aspect;

import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

public class AuditingAdvice implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target) throws Throwable {

		System.out.println("Target Class Name " + target.getClass());
		System.out.println("Target method name " + method.getName());
		System.out.println("Target method args " + Arrays.toString(args));

		if ((Integer) args[0] == 0) {
			throw new IllegalArgumentException("Wrong order id");

		}
		if ((Integer) args[0] < 0) {
			args[0] = (Integer) args[0] * -1;
		}

		FileWriter fw = new FileWriter("D:\\AuditLog.txt", true);
		fw.write(args[0] + " order has come for approval at " + new Date() + "\n");
		fw.flush();
		fw.close();

	}

}
