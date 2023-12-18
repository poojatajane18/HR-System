import java.util.HashMap;

public class SalesManager extends Employee{
	
	HashMap<Integer, SalesRep> salesTeam = new HashMap<Integer,SalesRep>(); 

	SalesManager(String fName, String lName, int reg, int ageE, int dWorked, int vacDaysTaken, double sal, int yWorked,HashMap<Integer, SalesRep> ssleTeam) {
		super(fName, lName, reg, ageE, dWorked, vacDaysTaken, sal, yWorked);
		// TODO Auto-generated constructor stub
		this.salesTeam = salesTeam;
	}
		
	public double calculateCommission() {
        double totalCommission = 0.0;
        for (SalesRep salesRep : salesTeam.values()) {
            totalCommission += salesRep.calculateComission();
        }
        return 0.03 * totalCommission;
    }
	
}
