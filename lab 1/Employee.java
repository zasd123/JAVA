public class Employee{
public String name;
public int idNumber;
public String department;
public String position;
public Employee(String a,int b,String c,String d){
name = a;
idNumber = b;
department = c;
position = d;
}
public Employee(String a, int b){
name = a;
idNumber = b;
department = "''";
position = "''";
}
public Employee(){
name = "''";
idNumber = 0;
department = "''";
position = "''";
}

public String getName(){
System.out.print(name+ " ");
return name;
}
public void setName(String x){
name = x;
}
public int getId(){
System.out.print(idNumber + " ");
return idNumber;
}
public void setId(int x){
idNumber = x;
}
public String getDepartment(){
System.out.print(department + " ");
return department;
}
public void setDepartment(String x){
department = x;
}
public String getPosition(){
System.out.print(position + " ");
System.out.println();
return position;

}
public void setPosition(String x){
position = x;
}

}
