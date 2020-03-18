//Zachary Hansen
//csc142-80
//Lab 1
//assignment 5
//creates a class fandbPoints with the field of temperature
import java.util.Scanner;
public class fandbPoints{
public static int temp;
//the main method

   public static void main(String[]args){
      setTemp();
      getSolution();
       }
// the following 6 methods test the temperature and return true or false depending on freezing and boiling points
   public static boolean isEthylFreezing(int x){
      if(x <= -173){
         return true;
      }
      else{
         return false;
      }
   }
   public static boolean isEthylBoiling(int x){
      if(x >= 172){
         return true;
      }
      else{
         return false;
      }
   }
   public static boolean isOxygenFreezing(int x){
      if (x <= -362){
         return true;
      }
      else{
         return false;
      }
   }
   public static boolean isOxygenBoiling(int x){
      if(x >= -306){
         return true;
      }
      else{
         return false;
      }
   }
   public static boolean isWaterFreezing(int x){
      if(x <= 32){
         return true;
      }
      else{
         return false;
      }
   }
   public static boolean isWaterBoiling(int x){
      if(x >= 212){
         return true;
      }
      else{
         return false;
      }
   }
   //This method allows the user to set the temperature
   public static void setTemp(){
      Scanner kbd = new Scanner(System.in);
      System.out.print(" what is the temperature: ");
      temp = kbd.nextInt();
   
   }
   //this method prints out the final solutions=
   public static void getSolution(){
      if(isEthylFreezing(temp)){
         System.out.println("Ethyl alcohol would be frozen at this temperature");
      }
      if(isEthylBoiling(temp)){
         System.out.println("Ethyl alchohol would be boiling at this temperature");
      }
      if(isOxygenFreezing(temp)){
         System.out.println("Oxygen would be frozen at this temperature");
      }
      if(isOxygenBoiling(temp)) {
         System.out.println("Oxygen would be boiling at this temperature");
      }
      if(isWaterFreezing(temp)) {
         System.out.println("Water would be freezing at this temperature");
      }
      if(isWaterBoiling(temp)) {
         System.out.println("Water would be boiling at this temperate");
      }   
   
   }
   
}

