public class PetTest{
public static void main(String[] args){
Pet test = new Pet("Rudy","Dog");
Pet test2 = new Pet("Max","Bird",5);
test.getName();
test.getAnimal();
test.getAge();
test2.getName();
test2.getAnimal();
test2.getAge();
test.setName("Rico");
test.setAnimal("Octopus");
test.setAge(100);
test.getName();
test.getAnimal();
test.getAge();

}
}