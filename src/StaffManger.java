import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StaffManger  {
    ArrayList <Staff > staffList = new ArrayList<>() ;
    ArrayList <Staff> staffFullTimes = new ArrayList<>();

   public void showList  () {
       staffList.add(new StaffFullTime("Chien",20 , "0364833162","chienad2002ad@gmail.com",new Address("Thai Binh","Quynh Phu","AnDuc", 10),10000,5000,100000) );
       staffList.add(new StaffFullTime("Nam",22 , "0364833162","chienad2002ad@gmail.com",new Address("Thai Binh","Quynh Phu","AnDuc", 10),10000,5000,1200000) );
       staffList.add(new StaffFullTime("Oanh",21 , "0364833162","chienad2002ad@gmail.com",new Address("Thai Binh","Quynh Phu","AnDuc", 10),10000,5000,1400000) );
       staffList.add(new StaffFullTime("Tuyen",23 , "0364833162","chienad2002ad@gmail.com",new Address("Thai Binh","Quynh Phu","AnDuc", 10),10000,5000,100000) );
       staffList.add(new StaffPartTime("Dong",19 , "0364833162","chienad2002ad@gmail.com",new Address("Thai Binh","Quynh Phu","AnDuc", 10),10) );
       staffList.add(new StaffPartTime("Phu",10 , "0364833162","chienad2002ad@gmail.com",new Address("Thai Binh","Quynh Phu","AnDuc", 10),10) );
       staffList.add(new StaffPartTime("Thanh",15 , "0364833162","chienad2002ad@gmail.com",new Address("Thai Binh","Quynh Phu","AnDuc", 10),90) );
       staffList.add(new StaffPartTime("VietAnh",17 , "0364833162","chienad2002ad@gmail.com",new Address("ThaiBinh","Quynh Phu","AnDuc", 10),50) );
       for (Staff value:
            staffList) {
           System.out.println(value);
       }
       for (int i = 0; i < staffList.size(); i++) {
           if(staffList.get(i) instanceof StaffFullTime){
               staffFullTimes.add(staffList.get(i)) ;
           }
       }
   }
   public void payroll () {
       double total ;
       for (int i = 0; i < staffList.size(); i++) {
           if(staffList.get(i) instanceof StaffFullTime){
               total = ((StaffFullTime) staffList.get(i)).getHardSalary() + ((StaffFullTime) staffList.get(i)).getBonus() -((StaffFullTime) staffList.get(i)).getForfeit() ;
               System.out.println(staffList.get(i));
               System.out.println("This total salary is :" + total );

           }
           if (staffList.get(i) instanceof StaffPartTime) {
               total = ((StaffPartTime) staffList.get(i)).getWorkingHours() * 100000;
               System.out.println(staffList.get(i));
               System.out.println("This total salary is :" + total );
           }
       }
   }
   public double averageWage () {
       double averageWage;
       double totalWage  = 0 ;
       for (int i = 0; i < staffList.size(); i++) {
           if(staffList.get(i) instanceof StaffFullTime){
               totalWage += ((StaffFullTime) staffList.get(i)).getHardSalary() + ((StaffFullTime) staffList.get(i)).getBonus() -((StaffFullTime) staffList.get(i)).getForfeit() ;

           }
           if (staffList.get(i) instanceof StaffPartTime) {
               totalWage += ((StaffPartTime) staffList.get(i)).getWorkingHours() * 100000;
           }
       }
       averageWage = totalWage/staffList.size();
       return averageWage;
   }
   public void WageOfStaffBetterThanAverageWage () {
       System.out.println("the average wage is :  " + averageWage());
       double total ;
       for (int i = 0; i < staffList.size(); i++) {
           if(staffList.get(i) instanceof StaffFullTime){
               total = ((StaffFullTime) staffList.get(i)).getHardSalary() + ((StaffFullTime) staffList.get(i)).getBonus() -((StaffFullTime) staffList.get(i)).getForfeit() ;
               if(total < averageWage()) {
                   System.out.println(staffList.get(i));
               }
           }

       }
   }
   public double WageOfStaffPartTime () {
       double total = 0;
       for (int i = 0; i < staffList.size(); i++) {
           if (staffList.get(i) instanceof StaffPartTime) {
               total += ((StaffPartTime) staffList.get(i)).getWorkingHours() * 100000;
           }
       }
       return total ;
   }




   public void sortStaffFullTimes(){
       staffFullTimes.sort(new Comparator<Staff>() {
           @Override
           public int compare(Staff o1, Staff o2) {
               return Double.compare(((StaffFullTime)o1).getHardSalary(),((StaffFullTime)o2).getHardSalary());
           }
       });

   }


    @Override
    public String toString() {
        return "StaffManger{" +
                "staffList=" + staffList +
                '}';
    }



}
