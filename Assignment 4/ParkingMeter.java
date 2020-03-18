//Zachary Hansen
//Assignment 4
//CSC 142-80
public class ParkingMeter{
//necessary fields
private int minutesPurchased;
//constructor
public ParkingMeter(int m){
minutesPurchased = m;
}
//setter method for minutes purchased
public void setMinutesPurchased(int m){
this.minutesPurchased = m;
}
//getter method for minutes purchased
public int getMinutesPurchased(){
return this.minutesPurchased;
}
}