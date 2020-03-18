//Zachary Hansen
//CSC141 - 80
//Assignment 3
//imports necessary utilities

import java.util.Arrays;
import java.io.*;
import java.util.Scanner;
public class Assignment3{
// declares a 2d array to hold the individual hours per day for each employee
   public static int hours [] [] = new int [8][7];
   
 //declares the parallel int arrays i used for the total hours of each employee and that employees idnumber
   public static int totalHours[] = new int [8];
   public static int employee [] = {1,2,3,4,5,6,7,8};

   public static void main (String args[])throws IOException{
   //reads the input from hours.txt and puts the elements into the 2 day array hours[][]
      hours = createArray();
    //calculates the total for each row and saves these sums to the totalHours array
      for(int i = 0; i< hours.length; i++){
         totalHours[i] = getRowTotal(i);
      
      }
    //sorts the totalHours array in decending order , keeping the 2 arrays parallel
      sorter(totalHours,employee);
    //Prints out the result
      for(int x=0; x< totalHours.length;x++){
         System.out.println("employee:"+employee[x]+": "+totalHours[x]);
         
      }
      
   }
   //@param: none
   //@return: int[][]
   //This method takes the file you provided and reads the lines into the 2 day array hours
   public static  int [][] createArray()throws IOException{
      File inputSource = new File("hours.txt");
      if (!inputSource.exists()) {
         System.out.println("Error: file does not exist.");
         System.exit(0);
      }
   
      Scanner kbd = new Scanner(inputSource);
      for (int i=0; i<hours.length;i++){
         for(int j = 0; j <hours[0].length; j++){
         
            hours[i][j] = kbd.nextInt();
         }
      }
      
      return hours;   
   }
   //@param: int x
   //@return: total
   //This method adds the total for the row (x)     
   public static int getRowTotal(int x){
      int total = 0;
      for( int i = 0; i<hours[0].length;i++){
         total +=  hours[x][i]; 
      }
      return total;
   }
   //@param: int[] totals, int[] ids
   //@return:void
   //This method takes the 2 parallel arrays and while it sorts the total array by value in decending order it also 
   //keeps the elements of the totals array parallel with that of the ids array.
   // I used the normal selection sort method and every time I swapped an element in the totalHours array I also swapped
   //the element that was parallel to that total in the ids array.Therefore leaving the employee numbers next to their totals in decending order. 
   public static void sorter(int[] totals, int [] ids ) {
      int max;
      int mIndex;
      int swapTotal;
      int swapId;
      for(int i = 0;i<totals.length;i++){
         max = totals[i];
         mIndex = i;
         for(int j = i; j <totals.length;j++){
            if(totals[j]>max){
               max = totals[j];
               mIndex= j;
            }
         }
         if(max>totals[i]){
            swapTotal = totals[i];
            swapId = ids[i];
            totals[i] = totals[mIndex];
            ids[i] = ids[mIndex];
            totals[mIndex] = swapTotal;
            ids[mIndex] = swapId;
         }
         
      
      }
     
   
   
   
   
   }
   
         
}  
