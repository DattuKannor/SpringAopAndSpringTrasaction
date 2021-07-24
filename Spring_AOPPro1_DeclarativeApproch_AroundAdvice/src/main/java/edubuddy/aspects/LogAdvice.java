package edubuddy.aspects;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAdvice implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retvalue = null;
		System.out.println("Entering into " + invocation.getMethod().getName() + " With args "
				+ Arrays.toString(invocation.getArguments()));

		// Modify argument values
		Object args[] = invocation.getArguments();

		if ((Float) args[0] < 50000) {
			args[1] = 1.0f;
		}

		// controlling target method

		if ((Float) args[0] == 0.0f || (Float) args[1] == 0.0f || (Float) args[2] == 0.0f) {
			return 0.0f;
		} else {
			retvalue = invocation.proceed();
		}

		System.out.println("Leaving from " + invocation.getMethod().getName() + " with args "
				+ Arrays.toString(invocation.getArguments()));

		if ((Float) retvalue <= 25000) {
			return retvalue;
		}
		else {
			return ((Float)retvalue)+(((Float)retvalue)*0.1f);
		}

	}

}
