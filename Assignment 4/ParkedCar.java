//Zachary Hansen
//Assignment 4
//CSC 142-80
//necessary fields
public class ParkedCar{
private String make;
private String model;
private String color;
private String lisenseNumber;
private int minutesParked;
//normal constructor 
public ParkedCar(String mk,String mod,String col,String lic, int min){
make  = mk;
model = mod;
color = col;
lisenseNumber = lic;
minutesParked = min;
}
//copy constructor
public ParkedCar(ParkedCar car2){
this (car2.getMake(),car2.getModel(),car2.getColor(),car2.getLic(),car2.getMins());
}
//getter for the make
public String getMake(){
return this.make;
}
//getter for the model
public String getModel(){
return this.model;
}
//getter for the color
public String getColor(){
return this.color;
}
//getter for the Lisense plate number
public String getLic(){
return this.lisenseNumber;
}
//getter for the minutes the car was parked
public int getMins(){
return this.minutesParked;
}
//alternate toString() method for the ParkedCar class
public String toString(){
String str = color+" "+make+" "+model+" with the lisense plate number: "+lisenseNumber+" ";
return str;
}
}