public class employeeWage
{
	public static void main ( String args[] )
	{
		int checkNumber=(int)(Math.floor(Math.random()*10)%2);
		int IS_PRESENT=1;
		if ( checkNumber == IS_PRESENT )
			System.out.println("Employee Is Present");
		else
			System.out.println("Employee Is Absent");
	}
}
