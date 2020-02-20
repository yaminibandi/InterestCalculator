package interest;
import java.util.*;

public class InterestParameters {
	
	private int principle,rateOfInterest,timePeriod;
	
	public void readInput(){
		Scanner scanner=new Scanner(System.in);
		setPrinciple(scanner.nextInt());
		setRateOfInterest(scanner.nextInt());
		setTimePeriod(scanner.nextInt());
	}
	public int getPrinciple() {
		return principle;
	}
	public void setPrinciple(int principle) {
		this.principle = principle;
	}
	public int getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(int rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public int getTimePeriod() {
		return timePeriod;
	}
	public void setTimePeriod(int timePeriod) {
		this.timePeriod = timePeriod;
	}
}
