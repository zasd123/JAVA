import java.io.*;
import java.util.Scanner;
public class Assignment3{
   public static void main (String args[])throws IOException{
     createArray();
   }
   public static  int [][] createArray()throws IOException{
      int hours [] [] = new int [7][7];
      File inputSource = new File("hours.txt");
     // if (!inputSource.exists()) {
			//System.out.println("Error: file does not exist.");
			//System.exit(0);
		//}

      Scanner kbd = new Scanner(inputSource);
      for (int i=0; i<8;i++){
         for(int j = 0; j <8; j++){
         
         hours[i][j] = kbd.nextInt();
         }
         }
      return hours;   
   }
         
}