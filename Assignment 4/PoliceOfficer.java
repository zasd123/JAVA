//Zachary Hansen
//Assignment 4
//CSC 142-80
public class PoliceOfficer{
//necessary fields
   private String name;
   private String badgeNumber;
   //normal constructor
   public PoliceOfficer (String n, String bn){
      name = n;
      badgeNumber = bn;
   }
   //copy constructor
   public PoliceOfficer(PoliceOfficer officer2){
      this(officer2.getName(),officer2.getBadge());
   }
   //This class creates a Parking ticket object
   // and will find out how many minutes the car has been parked illegally
   public ParkingTicket patrol(ParkedCar car,ParkingMeter meter){
   int illegalMins = car.getMins()- meter.getMinutesPurchased();
      System.out.println("This "+car+"has been parked illegally for "+illegalMins+" minutes");
      ParkingTicket temp = new ParkingTicket(car,this,illegalMins );
      return temp;
      
   
   }
   //getter method for Name
   public String getName(){
      return this.name;
   }
   //getter method for badgeNumber
   public String getBadge(){
      return this.badgeNumber;
   }
   //alternate toString method
   public String toString(){
   String str = "Officer "+name+": Badge Number: "+badgeNumber;
   return str;
   }
}