import java.util.HashMap;

public class SalesManager extends Employee{
	
	HashMap<Integer, SalesRep> salesTeam;

	SalesManager(String fName, String lName, int reg, int ageE, int dWorked, int vacDaysTaken, double sal, int yWorked,
			String uName, String pass,HashMap<Integer, SalesRep> sTeam) {
		super(fName, lName, reg, ageE, dWorked, vacDaysTaken, sal, yWorked);
		// TODO Auto-generated constructor stub
		salesTeam = sTeam;
	}
	  public void calculateComission(){
	      // 0.03 * all sales made by team
		  /*double totalSales = salesTeam.values().stream().mapToDouble(SalesRep::getSalesMade).sum();
	       double commision = 0.03 * totalSales;*/
 
	   }
}
