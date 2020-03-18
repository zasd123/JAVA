//Zachary Hansen
//Lab 2
//Csc 142-80
public class RainfallTest{
//creates and initializes the sample array
public static double [] sample = {10,20,30,40,50,60,70,80,90,100,110,120};

public static void main(String [] args){
//creates a new rainfall object with the argument of the sample array
Rainfall test = new Rainfall(sample);
//calculates the total and outputs it to the user
test.total();
//calculates the average rainfall per month and outputs it to the user
test.avgRain();
//calculates which month had the most rain and outputs it to the user
test.maxRain();
//calculates which month had the least rain and outputs it to the user
test.minRain();
}
}