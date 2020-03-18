//Zachary Hansen
//Assignment 4
//CSC 142-80
//in this class I created 4 different sets of cars, meters and police officers to try and demonstrate my program
public class Assignment4Demo{

public static void main (String args[]){
//test1
ParkedCar acar = new ParkedCar("Lamborghini","Aventador","Red","5TY-64T",120);
ParkingMeter ameter = new ParkingMeter(60);
PoliceOfficer anOfficer = new PoliceOfficer("Albert","123456789");
System.out.println((anOfficer.patrol(acar,ameter)));
System.out.println();
//test2
ParkedCar acar2 = new ParkedCar("Aston Martin","Vanquish","Silver","YT7-IU8",60);
ParkingMeter ameter2 = new ParkingMeter(60);
PoliceOfficer anOfficer2 = new PoliceOfficer("Rico","987654321");
System.out.println((anOfficer2.patrol(acar2,ameter2)));
System.out.println();
//test3
ParkedCar acar3 = new ParkedCar("Chevrolet","Corvet","Blue","RT7-PO8",60);
ParkingMeter ameter3 = new ParkingMeter(59);
PoliceOfficer anOfficer3 = new PoliceOfficer("George","927354351");
System.out.println((anOfficer3.patrol(acar3,ameter3)));
System.out.println();
//test4
ParkedCar acar4 = new ParkedCar("Ford","Mustang","Orange","TY6-WO2",400);
ParkingMeter ameter4 = new ParkingMeter(200);
PoliceOfficer anOfficer4 = new PoliceOfficer("George","187553321");
System.out.println((anOfficer4.patrol(acar4,ameter4)));
System.out.println();




}

}
