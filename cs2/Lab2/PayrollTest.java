//Zachary Hansen
//Lab 2
//Csc 142-80
public class PayrollTest{
//creates a new Payroll object
   static Payroll test = new Payroll();
  
   public static void main(String [] args){
   //I use the for loop  to count through the index's of the arrays hours and payRate prompting
   // the user for the coresponding information for each  
      for(int x = 0; x<7; x++){
         test.setHours(x);
         test.setPayrate(x);
      }
   // I used this for loop to count throught the index's of the array wages, using the getwage method
   //calculates the grossPay for the user at that index
      for(int y = 0; y < 7; y++){
         test.getWage(y);
      }
      // the findPay method searches for the index where that id number is initialized and will output
      // the gross pay for that employee
      System.out.println(test.findPay(5658845));
   }
}