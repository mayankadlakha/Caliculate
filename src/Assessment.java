
public abstract class Assessment {
	String name;
	double mark;
	double markOutof;
	double weight;
	
	public Assessment(String assessmentName, double assessmentMark, double assessmentMarkOutOf, double assessmentWeight){
		this.name = assessmentName;
		this.mark = assessmentMark;
		this.markOutof = assessmentMarkOutOf;
		this.weight = assessmentWeight;	
		
	}
	
	public String getName(){
		return this.name;
	}
	
	public double getMark(){
		return this.mark;
	}
	
	public double getWeight(){
		return this.weight;
	}
	
	
}

