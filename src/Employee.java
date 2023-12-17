
public class Employee implements User {
	String firstName;
	String lastName;
	int registration;
	int age;
	int daysWorked;
	int vacationDaysTaken;
	double salary;
	int yearsWorked;
	private String username;
	private String password;
	
	
	//constructor
	Employee(String fName,String lName,int reg,int ageE,int dWorked,int vacDaysTaken,double sal,int yWorked){
		firstName=fName;
		lastName=lName;
		registration=reg;
		age=ageE;
		daysWorked=dWorked;
		vacationDaysTaken=vacDaysTaken;
		salary=sal;
		yearsWorked=yWorked;
		
		
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return username.equals(username) && password.equals(password);
	}
	
	//method
	public int timeToRetirement(){
	      // time to retirement = min(60 - age, 40 - yearsWorked)
		return Math.min(60 - age, 40 - yearsWorked);
	   }

	   public int vacationTimeLeft(){
	       // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
		   return (int)((daysWorked/360)*(30 - vacationDaysTaken));
	   }

	   public int calculateBonus(){
	       // bonus = 2.2*salary
		   return (int)( 2.2*salary);
	   }
	

}
