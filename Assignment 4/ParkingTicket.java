//Zachary Hansen
//Assignment 4
//CSC 142-80
public class ParkingTicket{
//necessary fields
   private ParkedCar car;
   private PoliceOfficer officer;
   private double fine;
   private int minutes;
   public double BASE_FINE = 25;
   public double HOURLY_FINE = 10;
   //normal PArking ticket constructor
   public ParkingTicket(ParkedCar aCar, PoliceOfficer anOfficer,int min){
      car = aCar;
      officer = anOfficer;
      minutes = min;
      calculateFine();
   }
   //copy constructor
   public ParkingTicket(ParkingTicket ticket2){
      this(ticket2.getCar(),ticket2.getOfficer(),ticket2.getMins());
   }
   //this method takes the minutes the car has been parked illegally fines the vehicle for that time
 
   public void calculateFine(){
   
      int hours = minutes/60;
      if (minutes <0){
         fine = 0;
      }
      if(minutes > 0 &&hours<1){
         fine = BASE_FINE;
      }
      if(minutes>0  && hours>=1){
         fine = BASE_FINE+(HOURLY_FINE*hours);
      }
   
   }
   //getter method for an officer object
            
   public PoliceOfficer getOfficer(){
      return this.officer;
   }
   //getter method for a car object
   public ParkedCar getCar(){
      return this.car;
   }
   public double getFine(){
      return this.fine;
   }
   //getter method for minutes
   public int  getMins(){
      return this.minutes;
   
   
   }
   //Alternate toString() method
         public String toString(){
      if (minutes>0){
         String str ="A ticket in the ammount of: $"+fine+" was issued by "+officer+" to the "+car ;
         return str;
      }
      else{
         String str =" A ticket was not issued to the "+car;
         return str;
      }
   }
}
