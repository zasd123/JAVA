public class Car{
   private double curSpeed;
   private double curMileage;

   public Car(double speed, double mileage){
      curSpeed = speed;
      curMileage = mileage;
   }

   public void getInfo(){
      System.out.println(curSpeed);
      System.out.println(curMileage);
   }
}