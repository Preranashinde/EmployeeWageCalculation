public class employeeWage
{	public static int salary=0;
	public static void main ( String[] args )
   {
		
      final int IS_FULLTIME=1, IS_PARTTIME=2, WAGE_PER_HOUR=20, NO_OF_DAYS=20; ;
		
      int totalSalary=0;
		
		for ( int i=0; i<NO_OF_DAYS; i++ )
      {
         int checkNumber=(int)(Math.floor(Math.random()*10)%3);
			int empHours=0;
         switch (checkNumber)
         {
         case IS_FULLTIME:
               System.out.println("Employee is full time");
               empHours=8;
               break;
         case IS_PARTTIME:
               System.out.println("Employee is part time");
               empHours=4;
               break;
         default:
               System.out.println("Employee is absent");
               empHours=0;
               break;
         }
            salary=empHours*WAGE_PER_HOUR;
            System.out.println("Salary of employee is "+salary);
      }
      totalSalary+=salary;
      System.out.println("Total salary of employee is " +totalSalary);
   }
}
