package interest;

public class InterestCalculator {
	
	public static void CalculateInterest(String[] args){
		
		InterestParameters interestParameters=new InterestParameters();
		SimpleInterest simpleInterest=new SimpleInterest();
		CompoundInterest compoundInterest=new CompoundInterest();
		
		int principle,time,rate;
		interestParameters.readInput();
		principle=interestParameters.getPrinciple();
		time=interestParameters.getTimePeriod();
		rate=interestParameters.getRateOfInterest();
		
		simpleInterest.calculateSimpleInterest(principle,time,rate);
		compoundInterest.calculateCompoundInterest(principle,time,rate);
		
	}
	
}
