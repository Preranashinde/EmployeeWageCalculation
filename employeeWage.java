public class employeeWageBuilder
{	
	public static final int IS_FULL_TIME=1, IS_PART_TIME=2;
	public static int NUMBER_OF_WORKING_DAYS, WAGE_PER_HOUR, MAXIMUM_HOURS_IN_MONTH;

//Variables
	public static int totalWage=0;

	public employeeWageBuilder( int numberOfWorkingDays, int wagePerHour, int maximumHoursInMonth )
	{
		this.NUMBER_OF_WORKING_DAYS = numberOfWorkingDays;
		this.WAGE_PER_HOUR = wagePerHour;
		this.MAXIMUM_HOURS_IN_MONTH = maximumHoursInMonth;
	}
	public static void main ( String[] args )
	{
		System.out.println("Employee details of Microsoft India is:");
		employeeWageBuilder companyOne = new employeeWageBuilder(20,25,110);
		System.out.println("Salary of employee of company one is");
		calculationOfWage(companyOne);
		System.out.println("Employee details of Mercedes Benz is:");
		employeeWageBuilder companyTwo = new employeeWageBuilder(22,30,100);
		System.out.println("Salary of employee of company two is");
		calculationOfWage(companyTwo);
	}

	private void calculateTotalWage(int totalWage){
	this.totalWage =totalWage;
	}
	public static void calculationOfWage( employeeWageBuilder company )
	{
		int salary=0, totalEmployeeHours=0, noOfDays=0, totalWage=0, employeeWorkHours=0 ;
      while ( totalEmployeeHours <=company.MAXIMUM_HOURS_IN_MONTH && noOfDays < company.NUMBER_OF_WORKING_DAYS )
      {
        int employeeCheck=(int)(Math.floor(Math.random()*10)%3);
        noOfDays+=1;
        switch (employeeCheck)
        {
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
        salary=employeeWorkHours*WAGE_PER_HOUR;
        totalEmployeeHours+=employeeWorkHours;
        totalWage+=salary;
      }
		company.calculateTotalWage(totalWage);
		System.out.println("Total salary of employee is"+totalWage);
	}
}
