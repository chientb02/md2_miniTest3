
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StaffManger staffManger = new StaffManger();
        staffManger.showList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("input choice");
            System.out.println("Enter 1 to display the salary received for the employee");
            System.out.println("Enter 2 to calculate the average salary of all employees in the company");
            System.out.println("Enter 3 to list full-time employees whose salary is lower than the average salary of employees in the company.");
            System.out.println("Enter 4 to calculate the salary payable for all part-time employees");
            System.out.println("Enter 5 to sort full-time employees by salary ascending.");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    staffManger.payroll();
                    break;
                case 2:
                    System.out.println("the average wage is :  " + staffManger.averageWage());
                    break;
                case 3:
                    staffManger.WageOfStaffBetterThanAverageWage();
                    break;
                case 4:
                    System.out.println(staffManger.WageOfStaffPartTime());
                    break;
                case 5:
                    staffManger.sortStaffFullTimes();
                    for (Staff value :
                            staffManger.staffFullTimes) {
                        System.out.println(value);
                    }
                    break;
            }
        }
    }
}