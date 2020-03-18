import java.util.Scanner;

/** An exercise of using methods */

public class MethodExercise {

/**main method */
//Group A fill in the blanks for this method
   public static void main (String[] args) {
      double num1, num2, num3, avg, max;
      boolean isTriangle;
   
   //Get input for the three numbers
      Scanner kb = new Scanner(System.in);
   
      System.out.print("Enter the first number: "); 
      num1 = kb.nextDouble();
   
      System.out.print("Enter the second number: ");
      num2 = kb.nextDouble();
   
      System.out.print("Enter the third number: ");
      num3 = kb.nextDouble();
   
   //Call calcAverage method 
      avg = calcAverage(num1,num2,num3);
   
   //Output the result
      System.out.println("The average of the three numbers is " + avg);
   
   //Call findMax method
      max = findMax(num1,num2,num3);
   
   
   //Output max
      System.out.println("The maximum number of the three numbers is " + max);
   
   //Call sort method
      sort(num1, num2, num3);
   
   //Call isValidTriangle method
   
   
      if (isValidTriangle(num1,num2,num3))
         System.out.println("It is a valid triangle");
      else
         System.out.println("It is not a valid triangle");
   
   } //end main

/**Method calcAverage: calculates and returns the average of the three numbers*/

   public static double calcAverage(double x, double y, double z){
      double average = (x + y + z)/3;
      return average;
   }



/**Method findMax: finds and returns the maximum number among the three numbers*/
   public static double findMax ( double x, double y , double z){
      if (x > y && x > z){
      
         return x;
      }
      if(y > x && y > z){
      
         return y;
      }
      if(z > x && z > y){
      
         return z;
      }
      else{
         return 0.0;
      }
   }



/**Method sort: sorts and displays the three numbers in increasing order*/
   public static void sort(double x,double y,double z){
      double three = findMax(x,y,z);
      double one = 0;
      double two = 0; 
   
      if(x < y && x < z){
         one = x;
      }
      if(y < x && y < z){
         one = y;
      }
      if(z < x && z < y){
         one = z;
      }
      
      if( z != one && z != three){
         two = z;
      }
      if( x != one && x != three){
         two = x;
      }
      if(y != one && y != three){
         two = y;
      }
      System.out.println(one+" "+ two +" "+ three);
   }
   
   /**Method isValidTriangle: determines if the three numbers (representing three edges)
   can form a valid triangle*/
   
   
   public static boolean isValidTriangle(double x, double y, double z){
      double high = findMax(x,y,z);
      
      
      if(high == x){
         if((high*high) == ((y*y)+(z*z))){
            return true;
         }
         else{
            return false;
         }
      }        
      if(high == y){
         if((high * high) == ((x*x)+(z*z))){
            return true;
         }
         else{
            return false;
         }
      }         
         
      if (high == z){
         if((high * high) == ((x*x)+(y*y))){
            return true;
         }
         else{
            return false;
         }         
      
      }
   }
   
   
   
   
}