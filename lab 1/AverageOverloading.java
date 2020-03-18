/**An exercise on method overloading
*/

public class AverageOverloading {
public static void main(String[] args) {

//call the overloading methods respectively
calcAverage(2.2,2.3);
calcAverage(2.2,2.3,2.4);
calcAverage(2.2,2.3,2.4,2.5);




}

/** calculate the average of two doubles */
public static double calcAverage(double x, double y){
double avg = ((x+y)/2);
return avg;
}



/** calculate the average of three doubles */

public static double calcAverage(double x, double y, double z){
double avg = ((x+y+z)/3);
return avg;
}


/** calculate the average of four doubles */
public static double calcAverage(double x,double y, double z, double a){
double avg = ((x+y+z+a)/4);
return avg;
}
}


