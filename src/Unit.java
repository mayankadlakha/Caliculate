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
	
	public String getAnalysis(){
		String returnString = "";
		//TODO: add some mechanism to update these add assessments are added:
		this.HD -= this.totalAssessedPercentageWeight; 
		this.D -= this.totalAssessedPercentageWeight; 
		this.C -= this.totalAssessedPercentageWeight; 
		this.P -= this.totalAssessedPercentageWeight;
		returnString += ("Your current mark is: " + Math.round(totalAssessedPercentageWeight)+ "%\n");
		returnString += ("out of: " + Math.round(totalAssessedWeight)+ "% of the unit.\n");
		returnString += ("You need " + Math.round(HD) + "% more to get an HD\n");
		returnString += ("You need " + Math.round(D) + "% more to get a D\n");
		returnString += ("You need " + Math.round(C) + "% more to get a C\n");
		returnString += ("You need " + Math.round(P) + "% more to get a P\n");
		
	return returnString;
	}
}
