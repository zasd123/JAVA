//Zachary Hansen
//CSC142-80
//Assignment 5
//
public class Recursion{
   public static void main (String args[]){
   //loop to control the amount of times the recusive method is called
      for(int x=1;x<=20;x++){
         System.out.println(x+"      "+recurse(x));
      }
   }
//recusive method that gets the answers for the function given
   public static double recurse(double x){
      if(x==0){
         return 0;
      }
      else{
         
         return (recurse(x-1)+x/(x+1.0));
         
      }
     
   
   
   }
}