//Zachary Hansen
//Lab 2
//Csc 142 -80
//imports scanner Utility
import java.util.Scanner;
public class Payroll{
//creates 4 arrays with index's of 7  and initializes employeeId to the listed values
   private int [] employeeId = {5658845,4520125,7895122,8777541,8451277,1302850,7580489};
   private int [] hours = new int[7];
   private double[] payRate = new double[7];
   private double[] wages = new double[7];
 //@param: int index
 //@return: none
 //this method gets input from the User for the ammount of hours a specific employee worked
   public void setHours(int index){
      Scanner kbd = new Scanner(System.in);
      System.out.print("How many hours did employee "+employeeId[index]+" work this week: ");
      hours[index] = kbd.nextInt();
      System.out.println();
   }
   //@param:int index
   //@return:none
   //this method gets input from the user for the ammount a specific employee makes per hour
   public void setPayrate(int index){
      Scanner kbd = new Scanner(System.in);
      System.out.print("How much does employee: "+employeeId[index]+" work for in an hour : ");
      payRate[index] = kbd.nextDouble();
      System.out.println();
   }
   //@param : int index
   //@return :  wages[index]
   //this method gets the grosspay for all employees and displays them for the user
   public double getWage(int index){
      wages[index] = (hours[index]*payRate[index]);
      System.out.print("Employee "+employeeId[index]+" made "+wages[index]+" dollars this week");
      System.out.println();
      return wages[index];
   }
   //@param : int x
   //@return : wages[c];
   // this method takes an id number and return the amount of money that specific employee made during the week
   public double findPay(int x){
      for(int c = 0; c<7;c++){
         if(employeeId[c] == x){
            return wages[c];
         }else{
         break;
         }
      }
      return 0.0;
      
   
   }
}
   
