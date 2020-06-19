
public class Controller {

	public static void main(String[] args) {
		/*2069*/
		Unit unit2069 = new Unit("2069");
		unit2069.addAssessment("Lab", 5.2, 10, 30);
		unit2069.addAssessment("Tutorial", 46.67, 100, 10);
		
		System.out.println(unit2069.getName() + "\n" + unit2069.getAnalysis());
		
		
		/*1049*/
		Unit unit1049 = new Unit("1049");
		unit1049.addAssessment("eFolioA", 4.04, 10, 4);
		unit1049.addAssessment("eFolioB", 41, 48, 10);
		unit1049.addAssessment("Mindfulness", 4, 8, 8);
		unit1049.addAssessment("a1pA",37 , 50, 10);
		unit1049.addAssessment("a1pB", 49.5, 60, 10);
		unit1049.addAssessment("a2pA", 11, 25, 8);
		unit1049.addAssessment("a2pB", 46.5, 60, 10);
		unit1049.addAssessment("a2pC", 19, 25, 5);
		
		System.out.println(unit1049.getName() + "\n" + unit1049.getAnalysis());
		
		/*2099*/
		Unit unit2099 = new Unit("2099");
		unit2099.addAssessment("Lab", 2, 10, 10);
		unit2099.addAssessment("A1", 16.5, 20, 15);
		unit2099.addAssessment("A2", 17.5, 20, 15);
		unit2099.addAssessment("A3",10, 20, 20);
		System.out.println(unit2099.getName() + "\n" + unit2099.getAnalysis());

		/*transport*/
		Unit unitTransport = new Unit("Transport Phenomenon");
		unitTransport.addAssessment("Internal Assess.", 25, 50, 50);
		System.out.println(unitTransport.getName() + "\n" + unitTransport.getAnalysis());
		
		/*History*/
		Unit unitHistory = new Unit("History");
		unitHistory.addAssessment("Research essay", 70, 100, 40);
		unitHistory.addAssessment("Document analysis", 72, 100, 20);
		unitHistory.addAssessment("Tute participation", 70, 100, 10);
		System.out.println(unitHistory.getName() + "\n" + unitHistory.getAnalysis());
		
		/*Thermo*/
		Unit unitThermo = new Unit("Thermo");
		unitThermo.addAssessment("Quiz", 10, 10, 1);
		unitThermo.addAssessment("Quiz", 7, 10, 1);
		unitThermo.addAssessment("Quiz", 8.5, 10, 1);
		unitThermo.addAssessment("Quiz", 10, 10, 1);
		unitThermo.addAssessment("Quiz", 7, 10, 1);
		unitThermo.addAssessment("Quiz", 8, 10, 1);
		unitThermo.addAssessment("Quiz", 7, 10, 1);
		unitThermo.addAssessment("Quiz", 9, 10, 1);
		unitThermo.addAssessment("Quiz", 4.5, 10, 1);
		unitThermo.addAssessment("Quiz", 10, 10, 1);

		unitThermo.addAssessment("Quiz", 86, 100, 10);
		unitThermo.addAssessment("Quiz", 9.5, 10, 10);
		unitThermo.addAssessment("Quiz", 300, 300, 6);
		unitThermo.addAssessment("Quiz", 300, 300, 4);

		System.out.println(unitThermo.getName() + "\n" + unitThermo.getAnalysis());
		
		Unit unitPoverty = new Unit("Poverty");
		unitPoverty.addAssessment("EssayPlan", 77, 100, 10);
		unitPoverty.addAssessment("Essay1", 80, 100, 40);
		unitPoverty.addAssessment("Tutorial", 10, 10, 10);
		System.out.println(unitPoverty.getName() + "\n" + unitPoverty.getAnalysis());
//Change percentages to 2 decimals

		
		/*Ethics of war*/
		Unit unitEow = new Unit("Ethics of War");
		unitEow.addAssessment("Writing exercise", 90, 100, 15);
		unitEow.addAssessment("Essay", 90, 100, 40);
		unitEow.addAssessment("Tute participation", 13.5, 15, 15);
		System.out.println(unitEow.getName() + "\n" + unitEow.getAnalysis());

	}

}
