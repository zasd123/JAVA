import java.util.Random;
public class Array2D{
public static int[][] array = new int[10][10];

public static void main (String[] args){
randArray(array);

}

public static void randArray(int[] [] array){
for(int row = 0;row<array.length;row++)
	for(int col = 0;col< array[row].length;col++)
      array[row][col] = (int)(Math.random()*100)+1;
      int m = array[row][col];
      system.out.print(m);
      
      }
public static void arrayMin(int[][]array){
int min = 0;
for(int row = 0;row<array.length;row++)
	for(int col = 0; col<array[row].length;col++)
      
		if(array[row][col]< min ){
      array[row][col] = min;
      }
      }
      }
