
public class SalesRep extends Employee {
	double salesMade;

	SalesRep(String fName, String lName, int reg, int ageE, int dWorked, int vacDaysTaken, double sal, int yWorked,double saleMade) {
		super(fName, lName, reg, ageE, dWorked, vacDaysTaken, sal, yWorked);
		// TODO Auto-generated constructor stub
		this.salesMade = saleMade;
	}
	 public double getSalesMade() {
	        return salesMade;
	    }
	public int calculateComission(){
	      // comission = 0.1 * salesMade
		return (int)(0.1*salesMade);
	   }

	
}
