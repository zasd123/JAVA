public class RecursiveMultiplication{ binarySearch(A, middle + 1, hiIndex, value);
   public static void main(String args[]){
      System.out.println(recMultiply(5,6));
      System.out.println(recMultiply(7,10));
   }
   public static int recMultiply(int x,int y){
    
      if( x==0 || y==0){
         return 0;
      }
      if(x == 1){
         return y;
      }
      else{
         
         return recMultiply(x-1,y)+y;
      }
      
      
   }
}