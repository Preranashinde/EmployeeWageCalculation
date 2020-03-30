public class employeeWage
{
	public static void main ( String[] args )
	{	
		int salary=0, IS_PRESENT=1,WAGE_PER_HOUR=20,FULL_DAY_HOUR=8;
		int checkNumber=(int)(Math.floor(Math.random()*10)%2);
	
		if ( checkNumber == IS_PRESENT )
		{
         System.out.println("Employee Is Present");
			salary=(WAGE_PER_HOUR*FULL_DAY_HOUR);
			System.out.println("Employee Salary = "+salary);
		}
		else
		{
			System.out.println("Employee Is Absent");
	      System.out.println("Employee Salary = "+salary);
		}
	}
}
