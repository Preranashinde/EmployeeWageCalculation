public class employeeWage
{	public static int salary=0;
	public static int employeeWorkHours=0;
   public static int totalSalary=0;
   public static int totalEmployeeHours=0;
   public static int noOfDays=0;
	final int IS_FULLTIME=1, IS_PARTTIME=2;

	public static void main ( String[] args )
	{

		employeeWage employee= new employeeWage();
		employee.wageCalculation(20,20,100);
	}



public void wageCalculation( int MAXIMUM_DAYS, int WAGE_PER_HOUR, int MAXIMUM_HOURS )
	{
      while ( totalEmployeeHours < MAXIMUM_HOURS && noOfDays < MAXIMUM_DAYS )
      {
        int employeeCheck=(int)(Math.floor(Math.random()*10)%3);
        noOfDays+=1;
        switch (employeeCheck)
        {
				case IS_FULLTIME:
            employeeWorkHours=8;
            break;
				case IS_PARTTIME:
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
      System.out.println("Total salary of employee is "+totalSalary);
	}
}
