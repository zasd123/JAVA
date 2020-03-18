public abstract class Course_for_Grade {
// find a key to determine one of the 1-to-m relation with instructors
// assume no collaborative class
private Instructor ins;

// find a key to determine 1-to-n relation with students
private Student stu;

// course info.
private String name;
private int year;
private int section;

// above identity are used to determine m-to-n relation between 
// instructor and student

// each object represents a student in a specified course relation with 
// a faculty. Many object will have identical student information but 
// have different course link and grading records, which indicates 
// the records in different courses taken by this student.
// only reference, no new (storage) involved

private String [] category;
private int [] score;

private Course_for_Grade(){
//This is called by an instructor.  
}
…
}//end of class Course_for_Grade

public abstractclass User {
//login table
protected String name;
protected String id;
protected String passwd;

public boolean login(String name, String passwd){
}

public abstract void write();
//for student to reset passwd and 
//     faculty to reset both passwd and student grading info.
public abstract String read();
// for matching the passwd and relevantgrading information

//for abstract class not being able to have constructor:
public String get_name(){return name;}
public String get_id(){return id;}
public String get_passwd(){returnpasswd;}
public void set_name(String name){this.name=name;}
public void set_id(String id){this.id=id;}
public void set_passwd(String passwd){this.passwd = passwd;}
}//end of class User

public class Faculty extends User {
// each faculty can initiate the course relation since all classes 
// are accessible. 


public void create(int [] numbers, String [] names){
//for create the course object and relevant student records
//at the beginning
…
}

public void create(String name, String course_name, intnew_score){
//update the student record individually
…
}
…
}//end of class Faculty

public class Student extends User {
public void write(…){
//need authorization passed from the instructor
…
}

public void read(…){
//no constraint, can be called at everywhere, by student or faculty
…
}
} //end of class Student
