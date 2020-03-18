//Zachary Hansen
//4/30/18


import java.util.Scanner;
import java.util.Arrays;

public class Walkthrough{
   public static void main(String[] args) {
      String in;
      String[] tokens;
      String[] argsz;
      boolean flag;
    
      
      Scanner input = new Scanner(System.in);
      System.out.print("Input a comand:");
   
      while ((!(in = input.nextLine()).equals("exit"))){
         System.out.println("You entered " + in);
         tokens = tokenizeSpace(in);
      
         if(tokens[0].equals ("exist")){
            System.out.println(Trans.exist(tokens[1]));
         }
      
         if(tokens[0].equals ("read")){    
            for(int x = 4; x < tokens.length; x++){
               tokens[3]=tokens[3]+" "+tokens[x];
               System.out.println(tokens[3]);
            }
            printList(Trans.read(tokens[1],tokens[2],tokens[3]));
         }
      
         if(tokens[0].equals("found")){
            tokens[3]= (tokens[3] + " " + tokens[4] + " " + tokens[5]);
            System.out.println(Trans.found(tokens[1],tokens[2],tokens[3]));
         }
      
         if(tokens[0].equals("create")){
            
            for(int x = 3; x < tokens.length; x++){
               tokens[2]=tokens[2]+" "+tokens[x];
               System.out.println (tokens[2]);
            }
            Trans.create(tokens[1],tokens[2]);
         }
         
         if(tokens[0].equals("write")){
            boolean wrtFlag = false;
            
            for(int x = 0; x< tokens.length; x++){
               System.out.println(tokens[x]);
               if(tokens[x].contains("{")){
                  System.out.println("FOUND IT");
                  wrtFlag = true;
               }
            }
            
            if(wrtFlag == true){
               System.out.println("Inserting");
               String[] argz = tokenizeList(Arrays.copyOfRange(tokens, 1, (tokens.length)));
               String table = extractTableName(argz);
               argz = extractArgumentList(argz);
               Trans.write(table,argz); 
            }
               
            if(wrtFlag == false){
               System.out.println("Updating");  
               for(int y = 4; y < tokens.length; y++){
                  tokens[3]=tokens[3]+" "+tokens[y];
                  System.out.println(tokens[3]);
               }
               Trans.write(tokens[1],tokens[2],tokens[3]);
               
            }
               
                  
         }
            
         System.out.print("Input a command:");
      }
   
      System.out.println("Exiting...");
      System.exit(0);
   }

   //pulls and returns the table name
   private static String extractTableName(String[] in){
      return tokenizeComma(in)[0];
   }
   
   
   //pulls arguments for the insert command
   private static String[] extractArgumentList(String[] in){
      String[] argz = Arrays.copyOfRange(in, 1, (in.length));
      return cleanupArgs(tokenizeComma(argz));
   }
   
   
   //tokenizes user input by spaces
   private static String[] tokenizeSpace(String in){
      String delims = "[ ]+";
      String[] tokens = in.split(delims);
      return tokens;
   }
   
   
   //tokenizes an arg list and reformats
   private static String[] tokenizeList(String[] in){
   
      String rebuiltStr = rebuildStringArray(in);
      String delims = "\\{";
      String[] tokens = rebuiltStr.split(delims);
      return tokens;
   }
   
   //tokenizes user input by commas , rather than spaces
   private static String[] tokenizeComma(String[] in){
   
      String rebuiltStr = rebuildStringArray(in);
      String delims = ",";
      String[] tokens = rebuiltStr.split(delims);
      return tokens;
   }
   
   
   //used for formatting argument lists in extract Arg list
   private static String[] cleanupArgs(String [] args)
   {
      String cleanedArgs[] = new String [args.length];
      
      for(int i=0; i < args.length;i++){
         cleanedArgs[i] = args[i].replaceAll("\"","").replaceAll("\\}","");
      }
      return cleanedArgs;
   }
   
   
   //rebuilds string
   private static String rebuildStringArray(String[] in)
   {
      String retStr = "";
      
      for(int i=0;i<in.length;i++)
      {
         retStr += in[i];
      }
      return retStr;
   }
   
   //used for easily printing lists
   
   private static void printList(String[] in){
      for(int x=0;x < in.length;x++){
         System.out.println(in[x]);
      }
   }
   
//Create:
//create table id VARCHAR(255), class VARCHAR(255), assignment VARCHAR(255), grade VARCHAR(255)

//Found:
//found example id order by id

//Read:
//read mytable grade where grade = '1'

//Insert :
//write mytable,{ "1-56592-588-6", "Database Management System", "Program", "10" }

//Update:
//write mytable grade = 100 where assignment = 'paper'




}
