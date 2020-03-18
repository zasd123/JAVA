//Zachary Hansen
//Lab 2
//Csc 142-80
public class Rainfall{
// creates an array called rain with an index of 12
   private double rain[] = new double[12];
// constructor for rainfall that has a double array as an arg
// this constructor takes all the elements in the given array and transfers them to rain[]
   public Rainfall(double x[]){
      for (int i = 0; i < rain.length; i++) {
         rain[i] = x[i];
      }
   }
   //@param : none
   //@return : double total
   //this method returns the total rainfall for all the months of the year
   public double total(){
      double total = 0;
      for(int c = 0;c<rain.length;c++){
         total = rain[c] + total;
      }
      System.out.println("The total rainfall is: "+total+" inches");
      return total;
   }
         
//@param : none
//@return : double avg
// this method returns the average rainfall for the 12 months
   public double avgRain(){
      double total = 0;
      for(int c = 0;c<rain.length;c++){
         total = rain[c] +total;
      }
      double avg = total/12;
      System.out.println("The average rainfall for the year is: "+avg+" inches");
      return avg;
      
   }
   //@param : none
   //@return : String
   //This method first finds the index with the greatest rainfall and then uses a switch statement with 12 cases
   //to return the name of the month that had the most rain

   public String maxRain(){
      double maxMonth = 0;
      int count  = 0;
      for(int c = 0;c<rain.length;c++){
         if(rain[c] > maxMonth){
            maxMonth = rain[c];
         }
      
      }
      
      while(count<rain.length){
         if(rain[count] == maxMonth){
            break;
         }
         else{
            count++;
         }
      }
      
         
      switch (count){
         default : 
            System.out.println("The month with the most rain is : error");
            return "error";
            
         case 0 : 
            System.out.println("The month with the most rain is : January");
            return "January"; 
                         
         case 1 : 
            System.out.println("The month with the most rain is : February");
            return "February";
                  
         case 2 : 
            System.out.println("The month with the most rain is : March");    
            return " March";
         case 3 : 
            System.out.println("The month with the most rain is : April");
            return "April";
                  
         case 4 : 
            System.out.println("The month with the most rain is : May");
         
            return "May";
                  
         case 5 : 
         System.out.println("The month with the most rain is : June");
            return "June";
                  
         case 6 : 
         System.out.println("The month with the most rain is : July");
            return "July";
         case 7 : 
         System.out.println("The month with the most rain is : August");

            return "August";
                  
         case 8 : 
         System.out.println("The month with the most rain is : September");

            return " September";
                  
         case 9 : 
         System.out.println("The month with the most rain is : October");

            return "October";
                  
         case 10 : 
         System.out.println("The month with the most rain is : November");

            return " November";
                  
         case 11 : 
         System.out.println("The month with the most rain is : December");

               
            return"December";
                  
            
      }
            
               
   }
   //@param : none
   //@return : String
   //This method first finds the index with the least rainfall and then uses a switch statement with 12 cases
   //to return the name of the month that had the least rain


   public String minRain(){
      double minMonth = 9999;
      int count  = 0;
      for(int c = 0;c<rain.length;c++){
         if(rain[c] < minMonth){
            minMonth = rain[c];
         }
      
      }
      
      while(count<rain.length){
         if(rain[count] == minMonth){
            break;
         }
         else{
            count++;
         }
      }
      
         
      switch (count){
         default : 
            System.out.println("The month with the least rain is : error");
            return "error";
            
         case 0 : 
            System.out.println("The month with the least rain is : January");
            return "January"; 
                         
         case 1 : 
            System.out.println("The month with the least rain is : February");
            return "February";
                  
         case 2 : 
            System.out.println("The month with the least rain is : March");    
            return " March";
         case 3 : 
            System.out.println("The month with the least rain is : April");
            return "April";
                  
         case 4 : 
            System.out.println("The month with the least rain is : May");
         
            return "May";
                  
         case 5 : 
         System.out.println("The month with the least rain is : June");
            return "June";
                  
         case 6 : 
         System.out.println("The month with the least rain is : July");
            return "July";
         case 7 : 
         System.out.println("The month with the least rain is : August");

            return "August";
                  
         case 8 : 
         System.out.println("The month with the least rain is : September");

            return " September";
                  
         case 9 : 
         System.out.println("The month with the least rain is : October");

            return "October";
                  
         case 10 : 
         System.out.println("The month with the least rain is : November");

            return " November";
                  
         case 11 : 
         System.out.println("The month with the least rain is : December");

               
            return"December";
                  
            
      }
            
               
   }

}