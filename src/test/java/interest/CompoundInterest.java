package interest;

public class CompoundInterest {
	
	double compoundInterest;
	public void calculateCompoundInterest(int principle,int time,int rate){
		double interest= (principle* Math.pow(1.0+rate/100.0,time)-principle);
		setCompoundInterest(interest);
	}
	public double getCompoundInterest() {
		return compoundInterest;
	}
	public void setCompoundInterest(double compoundInterest) {
		this.compoundInterest = compoundInterest;
	}
	
}
