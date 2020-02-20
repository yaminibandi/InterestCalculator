package interest;

public class SimpleInterest {
	
	double simpleInterest;
	public void calculateSimpleInterest(int principle,int time,int rate){
		double interest= (principle*time*rate)/100;
		setSimpleInterest(interest);
	}
	public double getSimpleInterest() {
		return simpleInterest;
	}
	public void setSimpleInterest(double simpleInterest) {
		this.simpleInterest = simpleInterest;
	}
	
}
