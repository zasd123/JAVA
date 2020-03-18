//Zachary Hansen
//Lab 2
//Prof. Lu csc 142-80

import java.util.Scanner;
public class DistinctNumbers{
//creates an int array for the initial 10 numbers
   public static int inputNumbers[] = new int[10];
   
 //creates an int array for the distinct values to be copied to  
   public static int distNumbers[] = new int[10];
   int count = 0;
 //main method
   public static  void main(String[]args){
   
      getInput();
      saveDistinctNumbers(inputNumbers);
      for(int i=0; i<distNumbers.length; i++){
         System.out.print(distNumbers[i]);
      }
   }
   
   //@param: int[] nums
   //@return: distNumbers
   //this method takes the first elements of the first array and if the value
   // is not repeated it will copy it to the second array
   public static int[] saveDistinctNumbers(int[] nums){
      for(int i = 0;i< nums.length;i++){
         if(searchArray(nums,nums[i])){
            if(nums[i] != 0){
               nums[i] = distNumbers[i];
               nums[i] = 0;
            }
         }
         else{
         
            if(nums[i] != 0){
               nums[i] = distNumbers[i];
            }
         }
      }
      return distNumbers;
   }
   //@param: none
   //@return:none
   //this method gets input for the numbers to initialized into the first array
   public static  void getInput(){
      Scanner kbd = new Scanner(System.in);
      int i = 0;
      while( i<inputNumbers.length){
         System.out.print("what is number "+(i+1)+"? : ");
         int temp = kbd.nextInt(); 
         if (temp > 0){
            temp = inputNumbers[i];
            i++;
         }
         //input verification
         else{
            System.out.println("enter a number greater than 0");       
         }
      
      }
   }
   //@param: int x[] and int y[]
   //@return: boolean 
   // this method gives a true or false value for weather or not the value is repeated in the first array
   public static boolean searchArray(int[] x , int y){
      for(int i = 0; i<x.length;i++){
         if(y == x[i]){
            return true;
         }
         else{
            return false;
         }
         
      }
      return true;
   }
}
