public class employeeWage
{	public static int salary=0;
	public static int employeeWorkHours=0;
   public static int totalSalary=0;
   public static int totalEmployeeHours=0;
   public static int noOfDays=0;
	final int IS_FULL_TIME=1, IS_PART_TIME=2;

	public static void main ( String[] args )
	{
		employeeWage employee= new employeeWage();
		employee.wageCalculation("Microsoft India",20,25,110);
		employee.wageCalculation("Mercedes Benz",22,30,100);

	}

	public void wageCalculation( String companyName, int MAXIMUM_DAYS, int WAGE_PER_HOUR, int MAXIMUM_HOURS )
	{
      while ( totalEmployeeHours < MAXIMUM_HOURS && noOfDays < MAXIMUM_DAYS )
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
        totalSalary+=salary;
        System.out.println("Salary of employee on "+noOfDays+ " is "+salary);
      }
		System.out.println("Company name is: "+companyName+" Total salary of employee is:"+ totalSalary);
	}
}
