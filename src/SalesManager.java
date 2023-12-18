import java.util.HashMap;

public class SalesManager extends Employee{
	
	HashMap<Integer, SalesRep> salesTeam = new HashMap<Integer,SalesRep>(); 

	SalesManager(String fName, String lName, int reg, int ageE, int dWorked, int vacDaysTaken, double sal, int yWorked,HashMap<Integer, SalesRep> salesTeam) {
		super(fName, lName, reg, ageE, dWorked, vacDaysTaken, sal, yWorked);
		// TODO Auto-generated constructor stub
		this.salesTeam = salesTeam;
	}
		
		public double calculateCommission() {
	        // Calculate the total sales made by the team
			double totalSales = salesTeam.values().stream()
				    .map(salesRep -> (SalesRep) salesRep)  // Explicitly cast each element to SalesRep
				    .mapToDouble(SalesRep::getSalesMade)
				    .sum();

	        return 0.03 * totalSales;
	    }

		public void setSalesTeam(HashMap<Integer, SalesRep> salesTeam2) {
			// TODO Auto-generated method stub
			 this.salesTeam = salesTeam;
			
		}

		
}
