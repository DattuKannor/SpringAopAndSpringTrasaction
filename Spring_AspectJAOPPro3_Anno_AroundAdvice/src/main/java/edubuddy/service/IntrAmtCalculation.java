package edubuddy.service;

import org.springframework.stereotype.Service;

@Service("iac")
public class IntrAmtCalculation {
	public float calcSimpleIntrAmt(float p, float t, float r) {
		return (p * r * r) / 100.0f;
	}

	public float calcCompoundIntrAmt(float p, float t, float r) {
		return (float) (p * Math.pow((1 + r / 100.0f), t) - p);
	}

}
