import java.util.Scanner;
public class Employee{
public static String name;
public static int idNumber;
public static String department;
public static String position;
public Employee (String n,int i,String d,String p){
name = n;
idNumber = i;
department= d;
position = p;
}
public Employee(String n,int i){
name = n;
idNumber = i;
department = " ";
position = " ";
}
public Employee(){
name = " ";
idNumber = 0;
department = " ";
position = " ";
}
public static void setEmployee(){
Scanner kbd = new Scanner(System.in);
System.out.print("what is your name? : ");
name = kbd.nextLine();
System.out.print("what is your id# : ");
idNumber = kbd.nextInt();
System.out.print("what department are you in? : ");
department = kbd.nextLine();
System.out.print("what is your position? : ");
position = kbd.nextLine();
}
public static void getEmployee(){
System.out.print(name+",");

System.out.print(idNumber+",");

System.out.print(department+",");

System.out.print(position);
System.out.println();
}
}