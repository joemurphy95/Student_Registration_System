package softeng3.StudentRegisrationSystem;

import java.util.*;

import org.joda.time.LocalDate;

public class CourseProgram {
	private String courseName;
	private ArrayList<Module> modules = new ArrayList<Module>();
	private LocalDate startDate;
	private LocalDate endDate;
	
	public CourseProgram(String courseName, ArrayList<Module> modules, LocalDate startDate, LocalDate endDate){
		this.courseName = courseName;
		this.modules = modules;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public void setCourseName(String courseName){
		this.courseName = courseName;
	}
	
	public ArrayList<Module> getModules(){
		return modules;
	}
	
	public void setModules(ArrayList<Module> modules){
		this.modules = modules;
		for(Module m:modules){
			m.setCourse(this);
		}
	}
	
	public LocalDate getStartDate(){
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate){
		this.startDate = startDate;
	}
	
	public LocalDate getEndDate(){
		return endDate;
	}

	public void setEndDate(LocalDate endDate){
		this.endDate = endDate;
	}
}
