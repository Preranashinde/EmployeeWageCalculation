public class employeeWage
{	public static int salary=0;
	public static int employeeHours=0;
	public static void main ( String[] args )
	{
      final int IS_FULLTIME=1, IS_PARTTIME=2, MAXIMUM_DAYS=20, WAGE_PER_HOUR=20, MAXIMUM_HOURS=100;
      int totalSalary=0; 
		int totalEmployeeHours=0; 
		int noOfDays=0;
      while ( totalEmployeeHours < MAXIMUM_HOURS && noOfDays < MAXIMUM_DAYS )
      {
        int empCheckNumber=(int)(Math.floor(Math.random()*10)%3);
        noOfDays+=1;
        switch (empCheckNumber)
        {
				case IS_FULLTIME:
            employeeHours=8;
            break;
				case IS_PARTTIME:
            employeeHours=4;
            break;
				default:
            employeeHours=0;
            break;
        }
        salary=employeeHours*WAGE_PER_HOUR;
        totalEmployeeHours+=employeeHours;
        totalSalary+=salary;
        System.out.println("Salary of employee on "+noOfDays+ " is "+salary);
      }
      System.out.println("Total salary of employee is "+totalSalary);
	}
}
