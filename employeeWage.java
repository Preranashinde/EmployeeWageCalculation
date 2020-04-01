import java.util.Scanner;
interface EmployeeWageInterface {
   void calculationOfWage();
}

public class employeeWage implements EmployeeWageInterface {

   //CONSTANTS
   public static final int IS_FULL_TIME = 1, IS_PART_TIME = 2;
   public final int TOTAL_COMPANIES;

   //Variables
   public static int employeeRatePerHour = 0, numberOfWorkingDays = 0;
   public static int maximumHoursInMonth = 0;
   EmployeeWageOfCompany employee[];

   public employeeWage(int totalCompanies) {

      this.TOTAL_COMPANIES = totalCompanies;
      this.employee =new EmployeeWageOfCompany [this.TOTAL_COMPANIES];
   }
      public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Total companies");
      int totalCompanies= sc.nextInt();
      employeeWage company = new employeeWage(totalCompanies);
      for (int i = 0; i < company.employee.length; i++) {

         employeeRatePerHour = (int) (100 + Math.random() * 200);
         numberOfWorkingDays = (int) (20 + Math.random() * 25);
         maximumHoursInMonth = (int) (100 + Math.random() * 200);

         company.employee[i] = new EmployeeWageOfCompany(employeeRatePerHour,numberOfWorkingDays, maximumHoursInMonth);
      }
      company.calculationOfWage();
   }

public void calculationOfWage() {

   for(int employeeNumber = 0; employeeNumber < employee.length; employeeNumber++){
      int employeeHours = 0, employeeWage = 0, totalEmployeeWage = 0;
      int totalWorkingDays = 0, totalEmployeeHours = 0;
      //Computation
      while (totalEmployeeHours <= employee[employeeNumber].getMaximumHoursInMonth() &&
            totalWorkingDays < employee[employeeNumber].getNumberOfWorkingDays()) {
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
         employeeWage = employeeHours * employee[employeeNumber].getEmployeeRatePerHour();
         totalEmployeeWage += employeeWage;
      }
      employee[employeeNumber].setTotalEmployeeWage(totalEmployeeWage);
      System.out.println("Monthly salary of employee is " + (employeeNumber + 1) + ":" + totalEmployeeWage);
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

