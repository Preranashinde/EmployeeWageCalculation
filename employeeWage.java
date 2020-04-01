import java.util.Scanner;
import java.util.*;
interface EmployeeWageInterface {
   void calculationOfWage();
}

public class employeeWage implements EmployeeWageInterface {
   //CONSTANTS
   private static final int IS_FULL_TIME = 1, IS_PART_TIME = 2;
 
   //Variables
   private static int employeeRatePerHour = 0, numberOfWorkingDays = 0;
   private static int maximumHoursInMonth = 0;
	ArrayList <EmployeeWageOfCompany> employee = new ArrayList<EmployeeWageOfCompany>();

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Employee Wage Computation\n");
		employeeWage company = new employeeWage();
		int chooseOption;
		do{
         employeeRatePerHour = (int) (100 + Math.random() * 200);
         numberOfWorkingDays = (int) (20 + Math.random() * 25);
         maximumHoursInMonth = (int) (100 + Math.random() * 200);

         company.employee.add(new EmployeeWageOfCompany(employeeRatePerHour,numberOfWorkingDays, maximumHoursInMonth));
			chooseOption = sc.nextInt();
		}
		while(chooseOption == 1);
		company.calculationOfWage();

	}

public void calculationOfWage() {

   for(EmployeeWageOfCompany Employee: employee){
		int employeeNumber=1;
      int employeeHours = 0, employeeWage = 0, totalEmployeeWage = 0;
      int totalWorkingDays = 0, totalEmployeeHours = 0;
      //Computation
      while (totalEmployeeHours <= Employee.getMaximumHoursInMonth() &&
            totalWorkingDays < Employee.getNumberOfWorkingDays()) {
         totalWorkingDays++;
		int employeeCheck = ((int) Math.floor(Math.random() * 10)) % 3;
         switch(employeeCheck) {
            case IS_FULL_TIME:
               employeeHours = 8;
               break;
            case IS_PART_TIME:
               employeeHours = 4;
               break;
            default:
               employeeHours = 0;
         }
         totalEmployeeHours += employeeHours;
         employeeWage = employeeHours * Employee.getEmployeeRatePerHour();
         totalEmployeeWage += employeeWage;
      }
		Employee.setTotalEmployeeWage(totalEmployeeWage);
      System.out.println("Monthly salary of employee is "+(employeeNumber)+":" +totalEmployeeWage);
		employeeNumber++;
   }
}
}
class EmployeeWageOfCompany{

   //CONSTANTS
   private final int EMPLOYEE_RATE_PER_HOUR, NUMBER_OF_WORKING_DAYS, MAXIMUM_HOURS_IN_MONTH;

   //Variables
   private int totalEmployeeWage = 0;
   public EmployeeWageOfCompany(int employeeRatePerHour,int numberOfWorkingDays,int maximumHoursInMonth) {

      this.EMPLOYEE_RATE_PER_HOUR = employeeRatePerHour;
      this.NUMBER_OF_WORKING_DAYS = numberOfWorkingDays;
      this.MAXIMUM_HOURS_IN_MONTH = maximumHoursInMonth;
   }

   public int getEmployeeRatePerHour() {
      return EMPLOYEE_RATE_PER_HOUR;
   }

   public int getNumberOfWorkingDays() {
      return NUMBER_OF_WORKING_DAYS;
   }

   public int getMaximumHoursInMonth() {
      return MAXIMUM_HOURS_IN_MONTH;
}

   public void setTotalEmployeeWage(int totalEmployeeWage) {
      this.totalEmployeeWage = totalEmployeeWage;
   }
}


