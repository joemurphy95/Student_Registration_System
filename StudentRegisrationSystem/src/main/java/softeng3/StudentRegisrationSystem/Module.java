package softeng3.StudentRegisrationSystem;

import java.util.*;


public class Module {
	private String moduleName;
	private String moduleId;
	private ArrayList<Student> students = new ArrayList<Student>();
	private CourseProgram course;
	
	public Module(String moduleName, String moduleId, ArrayList students){
		this.moduleName = moduleName;
		this.moduleId = moduleId;
		setStudents(students);
	}
	
	public String getModuleName(){
		return moduleName;
	}
	
	public void setModuleName(String moduleName){
		this.moduleName = moduleName;
	}
	
	public String getModuleId(){
		return moduleId;
	}
	
	public void setModuleId(String moduleId){
		this.moduleId = moduleId;
	}
	
	public ArrayList<Student> getStudents(){
		return students;
	}
	
	public void setStudents(ArrayList<Student> students){
		this.students = students;
		for(Student st:students){
			st.setModule(this);
		}
	}
	
	public CourseProgram getCourse(){
		return course;
	}
	
	public void setCourse(CourseProgram course){
		this.course = course;
		for(Student s:students){
			if(s.getCourse() == null){
				s.setCourse(this.course);
			}
		}
	}
	
	public String toString(){
		return "Module name: " + this.getModuleName() + ", Module ID: " + this.getModuleId();
	}
}
