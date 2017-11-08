
public class CompletedAssessment extends Assessment {
	double percentage;
	double percentageWeight;

	public CompletedAssessment(String assessmentName, double assessmentMark, double assessmentMarkOutOf, double assessmentWeight) {
		super(assessmentName, assessmentMark, assessmentMarkOutOf, assessmentWeight);
		
		this.calculatePercentage();
		this.calculatePercentageWeight();
	}
	
	public double getPercentage(){
		return this.percentage;
	}
	
	public double getPercentageWeight(){
		return this.percentageWeight;
	}
	
	private void calculatePercentage(){
		this.percentage = (this.mark/this.markOutof);
	}
	
	private void calculatePercentageWeight() {
		this.percentageWeight = this.percentage*this.weight;
	}

	
	
	
	
	
	


}
