package lesson6.anastasiya.students.group;

public class Mark {
	public String subject;
	public int mark;
	
	
	public Mark() {
		
	}
	public Mark (String subject, int mark){
		this.subject = subject;
		this.mark = mark;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}

}
