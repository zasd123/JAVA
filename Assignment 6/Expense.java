public class Expense{
   private double days;
   private double airfare;
   private double carFees;
   private double milesDriven;
   private double parkingFees;
   private double taxiFees;
   private double semFees;
   private double lodgeFees;
   private double allowance;
   private double totalExpenses;
   private double savings;

   public Expense(double d,double a,double c,double md,double pf,double tf,double sf,double lf){
      days = d;
      airfare = a;
      carFees = c;
      milesDriven = md;
      parkingFees = pf;
      taxiFees = tf;
      semFees = sf;
      lodgeFees = lf;
   }
   public void calcTotalExpenses(){
      totalExpenses = airfare+carFees+parkingFees+taxiFees+semFees+lodgeFees;
   }
   
   public void calcAllowance(){
      
      double mealAllowance = 37*days;
      double parkingAllowance = 10*days;
      double taxiAllowance = 20*days;
      double lodgeAllowance = 95 * days;
      double carAllowance = .27 * milesDriven;
      allowance  = mealAllowance+parkingAllowance+taxiAllowance+lodgeAllowance+carAllowance;
   } 
   public void calcSavings(){
      if(totalExpenses < allowance){
         savings = totalExpenses;
      }
      else{
         savings = -1*(totalExpenses-allowance);
      }
   }
   public double getAllowance(){
      return allowance;
   }
   public double getExpenses(){
      return totalExpenses;
   }
   public double getSavings(){
      return savings;
   }
   
   
   
   
   
   public static void main(String args[]){
   
   }
}