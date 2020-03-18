//Zachary Hansen
//csc142-80
//Lab 1
//assignment 1
public class AccountTest{
   public static void main (String [] args){
      Account test = new Account();
      test.setId(1122);
      test.setBalance(20000);
      test.setAir(4.5);
      test.withdraw(2500);
      test.deposit(3000);
      test.setDate();
      
      System.out.println("your balance is : "+test.balance);
      System.out.println("your Monthly interest rate is : "+test.getMonthlyInterestRate());
      System.out.println("your account was created on : " +test.getDateCreated());
   }
}
