package softeng3.StudentRegisrationSystem;


import java.util.*;

import org.joda.time.LocalDate;

public class Student {
	private String fname;
	private String surname;
	private int age;
	private String username;
	private int studentId;
	private LocalDate dob;
	private CourseProgram course;
	private ArrayList<Module> modules = new ArrayList<Module>();
	
	public Student(String fname, String surname, int age,int studentId, LocalDate dob){
		this.fname = fname;
		this.surname = surname;
		this.age = age;
		this.studentId = studentId;
		this.dob = dob;
		getUsername();
	}
	
	public String getUsername() {
		return this.username = new StringBuilder().append(this.fname).append(this.surname).append(this.age).toString();	
	}
	
	public void setUsername(String username){
		this.username = username;
	}

	public String getName(){
		return fname + " " + surname;
	}
	
	public void setFirstName(String fname){
		this.fname = fname;
	}
	
	public void setSurname(String surname){
		this.surname = surname;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}

	public int getStudentId(){
		return studentId;
	}
	
	public void setStudentId(int studentId){
		this.studentId = studentId;
	}
	
	public void setModule(Module module){
		this.modules.add(module);
	}
	
	public ArrayList<Module> getModules(){
		return modules;
	}
	
	public void setCourse(CourseProgram course){
		this.course = course;
	}
	
	public CourseProgram getCourse(){
		return course;
	}
	
	public String toString(){
		return "Name: " + this.fname + " " + this.surname + ", Username: " + this.getUsername();
	}
}
