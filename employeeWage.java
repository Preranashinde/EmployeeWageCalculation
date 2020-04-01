import java.util.Scanner;
public class employeeWage{
//CONSTANTS
public static final int IS_FULL_TIME=1, IS_PART_TIME=2;
//variables
public static  int wagePerHour, numberOfWorkingDays, maximumHoursInMonth;
static int totalWage=0;

public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the how many companies you want to enter");
	int totalCompanies= sc.nextInt();
	EmployeeWageBuilder company[] = new EmployeeWageBuilder[totalCompanies];
	for (int number = 0; number < totalCompanies; number++) {
		
		wagePerHour = (int) (100 + Math.random() * 500);

		numberOfWorkingDays = (int) (20 + Math.random() * 26);

		maximumHoursInMonth = (int) (100 + Math.random() * 190);
		
		company[number] = new EmployeeWageBuilder(wagePerHour, numberOfWorkingDays,maximumHoursInMonth);
		calculationOfWage(company[number], number);
	}
}

public static void calculationOfWage(EmployeeWageBuilder company, int employeeNumber) {
	int salary=0, totalEmployeeHours=0, totalWorkingDays=0 ,totalWage=0;
	while ( totalEmployeeHours <=company.getMaximumHoursInMonth() && totalWorkingDays < company.getNumberOfWorkingDays()){
		int checkNumber=(int)(Math.floor(Math.random()*10)%3);
		int employeeWorkHours=0;
		totalWorkingDays+=1;
		switch (checkNumber){
			case IS_FULL_TIME:
				employeeWorkHours=8;
				break;
			case IS_PART_TIME:
				employeeWorkHours=4;
				break;
			default:
				employeeWorkHours=0;
				break;
			}
		salary=employeeWorkHours*company.getWagePerHour();
		totalEmployeeHours+=employeeWorkHours;
		totalWage+=salary;
	}
	company.setTotalWage(totalWage);
	System.out.println("ToTal Salary of Employee-" +(employeeNumber + 1)+ " is::"+ totalWage);
}

}


class EmployeeWageBuilder{
	//CONSTANTS
	public static int wagePerHour, numberOfWorkingDays, maximumHoursInMonth;
	public static int NUMBER_OF_WORKING_DAYS, WAGE_PER_HOUR, MAXIMUM_HOURS_IN_MONTH;
	//Variables
	static int totalWage=0;

   public EmployeeWageBuilder( int numberOfWorkingDays, int wagePerHour, int maximumHoursInMonth ){

		this.NUMBER_OF_WORKING_DAYS = numberOfWorkingDays;
		this.WAGE_PER_HOUR = wagePerHour;
		this.MAXIMUM_HOURS_IN_MONTH = maximumHoursInMonth;
	}

	public int getWagePerHour() {
		return WAGE_PER_HOUR;
	}

	public int getNumberOfWorkingDays() {
		return NUMBER_OF_WORKING_DAYS;
	}

	public int getMaximumHoursInMonth() {
		return MAXIMUM_HOURS_IN_MONTH;
	}

	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}
}
