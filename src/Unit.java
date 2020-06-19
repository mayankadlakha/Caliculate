import java.util.ArrayList;

public class Unit {
	ArrayList<CompletedAssessment> assessments = new ArrayList<CompletedAssessment>();
	String name;
	
	double totalAssessedPercentage = 0;
	double totalAssessedPercentageWeight = 0;
	double totalAssessedWeight = 0;
	double HD = 80;
	double D = 70;
	double C = 60;
	double P = 50;
	

	public Unit(String unitName){
		this.name = unitName;
	}
	
	public void addAssessment(String assessmentName, double assessmentMark, double assessmentMarkOutOf, double assessmentWeight){
		CompletedAssessment newAssessment = new CompletedAssessment(assessmentName, assessmentMark, assessmentMarkOutOf, assessmentWeight);
		
		this.assessments.add(newAssessment);
		
		this.update();
		
	}

	public String getName(){
		return this.name;
	} 
	
	private void update() {
		//this.totalAssessedPercentage += assessments.get(assessments.size()-1).getPercentage();
		this.totalAssessedPercentageWeight += assessments.get(assessments.size()-1).getPercentageWeight();
		this.totalAssessedWeight += assessments.get(assessments.size()-1).getWeight();
	}
	
	private double getFinalAssessmentScore(double marksNeeded, double totalAssessedWeight) {
		return marksNeeded/(100-totalAssessedWeight)*100;
	}
	
	public String getAnalysis(){
		String returnString = "";
		//TODO: add some mechanism to update these add assessments are added:
		this.HD -= this.totalAssessedPercentageWeight; 
		this.D -= this.totalAssessedPercentageWeight; 
		this.C -= this.totalAssessedPercentageWeight; 
		this.P -= this.totalAssessedPercentageWeight;
		returnString += ("Your current mark is: " + Math.round(totalAssessedPercentageWeight)+ "%\n");
		returnString += ("out of: " + Math.round(totalAssessedWeight)+ "% of the unit.\n");
		
		double[] grades = {this.HD, this.D, this.C, this.P};
		String[] gradeText = {"HD", "D", "C", "P"};
		double remainingWeight = 100-totalAssessedWeight;
		int counter = 0;
		
		for(double grade : grades) {
			returnString += ("You need " + Math.round(grade) + "/" + Math.round(remainingWeight)  + " to get "+ gradeText[counter] + " (" + Math.round(getFinalAssessmentScore(grade, totalAssessedWeight)) + "%)\n");
			counter++;
		}
		
	return returnString;
	}
}
