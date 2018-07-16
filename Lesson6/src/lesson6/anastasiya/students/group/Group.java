package lesson6.anastasiya.students.group;

import java.util.ArrayList;
import java.util.List;

public class Group {
	
	List<Students> students = new ArrayList<Students>();
	public void addStudents (Students newStudent) {
		students.add(newStudent);
		
	}
	
	public List<Students> getStudents() {
		return students;
	}
	public void setStudents (List<Students> students){
		this.students = students;
	}
	

}
