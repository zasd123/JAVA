public class IsMember{
   public static void main(String args[]){
   int test[] = {1,2,3,4,5};
   System.out.println(isMember(test,4,test.length,0));
   }
   public static boolean isMember(int[] x, int target, int highest, int lowest){
      if(x.length==0){
         return false;
      }
      else{
         int middle= (highest+lowest)/2;
      
         if (target == x[middle])
            return true;
         
         else if(target < x[middle])
            return isMember(x,lowest, middle - 1, target);
         
         else
            return isMember(x,middle + 1, highest, target);
      }
   
   }
}