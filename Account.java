//Zachary Hansen
//csc142-80
//Assignment 1
//imports necessary utilties
import java.util.Date;
import java.util.Scanner;
public class Account {
//data fields below
   public static int id;
   public static double balance; 
   public static double anualInterestRate ;
   public static Date dateCreated;
   public static Scanner kbd = new Scanner(System.in);

//@param: int x
//@return: void
   public static void setId (int x){
      id = kbd.nextInt();
   }
//@param : none
//@return : int
   public static int getId(){
      return id;
   
   }
//@param :double x
//@return : void
   public static void setBalance(double x){
      balance = x;
   }
//@param : none
//@return : double 
   public static double getBalance(){
      return balance;
   }
//@param : dvoid  
   public static void setAir(double x){
      anualInterestRate = x;
   }
//@param : none
//@return : double
   public static double getAir(){
      return anualInterestRate;
   }
//@param : none
//@return : void
   public static void setDate(){
      dateCreated = new Date();
   
   }
   
//@param : none
//@return : void
   public static double getMonthlyInterestRate(){
      return anualInterestRate /12;
   }
   
 //@param : double x
 //@return : void
 
   public static void withdraw(double x){
      balance = balance - x ;
   
   }
//@param : double x
//@return : void
   public static void deposit(double x){
      balance = balance + x;
   }
   
//@param : none
//@return : void
   public Date getDateCreated(){
   return dateCreated;
   }
}



