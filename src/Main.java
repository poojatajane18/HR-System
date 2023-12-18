import java.util.HashMap;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create an Employee
        Employee employee = new Employee("Pooja", "Tajane", 123, 30, 200, 10, 50000, 5);
        System.out.println("======================================================================");
        System.out.println("Employee Login : ");
        // Test login
        if (employee.login("pooja123", "password123")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }
        System.out.println("-----------------------------------------------------------------------");
        employee.EmployeeDetails();

        // Test other Employee methods
        System.out.println("Time to retirement: " + employee.timeToRetirement());
        System.out.println("Vacation time left: " + employee.vacationTimeLeft());
        System.out.println("Bonus: " + employee.calculateBonus());
        System.out.println("");
        System.out.println();
        

        // Create a SalesRep
        SalesRep salesRep = new SalesRep("Mahesh", "Shinde", 456, 25, 150, 8, 60000, 3, 5000.0);
        System.out.println("========================================================================");
        System.out.println("SalesRep Login : ");

        // Test login for SalesRep
        if (salesRep.login("mahesh456", "password456")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }
        System.out.println("-------------------------------------------------------------------------");
        salesRep.EmployeeDetails();

        // Test calculateCommission for SalesRep
        System.out.println("Commission: " + salesRep.calculateComission());

        // Create a SalesManager with a sales team
        System.out.println();
        System.out.println("==========================================================================");
        System.out.println("SalesManager Login : ");
        HashMap<Integer, SalesRep> salesTeam = new HashMap<>();
        salesTeam.put(1, new SalesRep("Bob", "Johnson", 789, 28, 180, 12, 70000, 7, 8000.0));
        SalesManager salesManager = new SalesManager("Manager", "One", 999, 35, 250, 15, 80000, 10, salesTeam);

        // Test login for SalesManager
        if (salesManager.login("manager999", "password999")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }
        System.out.println("-------------------------------------------------------------------------------");
        salesManager.EmployeeDetails();

        // Test calculateCommission for SalesManager
        System.out.println("Total Commission: " + salesManager.calculateCommission());
        

	}

}
