public class Pet{
public String name;
public String animal;
public int age;

public Pet(){
name = "''";
animal = "''";
age = 0;
}
public Pet(String x,String y){
name = x;
animal = y;
age = 0;
}
public Pet(String x, String y, int z){
name = x;
animal = y;
age = z;
}

public void setName(String x){
name = x;
}
public String getName(){
System.out.println(name);
return name;
}
public void setAnimal(String x){
animal = x;
}
public String getAnimal(){
System.out.println(animal);
return animal;
}
public void setAge(int x){
age = x;
}
public int getAge(){
System.out.println(age);
return age;
}
}

