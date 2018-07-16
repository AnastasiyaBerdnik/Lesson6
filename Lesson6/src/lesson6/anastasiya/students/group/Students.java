package lesson6.anastasiya.students.group;

import java.util.ArrayList;
import java.util.List;

public class Students {
	public String name;
	public String surname;
	
	List<Mark> marks = new ArrayList<Mark>();
	
	public Students () {
		
	}
	
	public Students(String name, String surname, List<Mark> marks) {
		this.name = name;
		this.surname  = surname;
		this.marks = marks;
	}
	
	
	public Students(String name, String surname) {
		this.name = name;
		this.surname  = surname;
	}
	
	
	void addMark (String subject, int mark){
		marks.add(new Mark(subject, mark));
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public List<Mark> getMarks() {
		return marks;
	}
	public void setMarks(List<Mark> marks) {
		this.marks = marks;
	}
	
	
	

	
}
