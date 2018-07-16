package lesson6.anastasiya.students.group;

import java.util.List;
import java.util.ArrayList;

public class GroupLogic {

	double calcAvrMark(Group group) {
		double avrMark = 0;

		List<Students> students = group.getStudents();

		for (Students st : students) {
			avrMark = avrMark + calcAvrMark(st);
		}

		avrMark = avrMark / students.size();

		return avrMark;
	}

	double calcAvrMark(Students student) {

		double avrMark = 0;

		List<Mark> marks = student.getMarks();

		for (Mark mark : marks) {
			avrMark = avrMark + mark.getMark();
		}

		avrMark = avrMark / marks.size();

		return avrMark;
	}
	
//bad marks
	List<Students> findBadStudents(Group group) {
		List<Students> badListStudents = new ArrayList<Students>();
		List<Students> students = group.getStudents();
		for (Students st : students) {
			if (hasBadMark(st) == true) {
				badListStudents.add(st);
			}
		}

		return badListStudents;
	}

	boolean hasBadMark(Students student) {
		List<Mark> marks = student.getMarks();
		for (Mark mark : marks) {
			if (mark.getMark() <= 2) {
				return true;
			}
		}
		return false;
	}

	List<Mark> takeWeakSubjects(Students student) {
		List<Mark> weakSubjectsList = new ArrayList<Mark>();
		List<Mark> marks = student.getMarks();
		for (Mark mark : marks) {
			if (mark.getMark() <= 2) {
				weakSubjectsList.add(mark);

			}
		}

		return weakSubjectsList;
	}

	List<Students> findBadStudentsWithBadMark(Group group) {
		List<Students> badListStudents = new ArrayList<Students>();

		List<Students> students = group.getStudents();
		for (Students st : students) {
			List<Mark> badMarks;
			if (hasBadMark(st)) {
				badMarks = takeWeakSubjects(st);
				Students stView = new Students(st.getName(), st.getSurname(),
						badMarks);
				badListStudents.add(stView);
			}
		}

		return badListStudents;
	}


	
	///////  Good Marks
	
	List<Students> findGoodStudents(Group group) {
		List<Students> goodListStudents = new ArrayList<Students>();
		List<Students> students = group.getStudents();
		for (Students st : students) {
			if (hasGoodMark(st) == true) {
				goodListStudents.add(st);
			}
		}

		return goodListStudents;
	}

	boolean hasGoodMark(Students student) {
		List<Mark> marks = student.getMarks();
		for (Mark mark : marks) {
			if (mark.getMark() == 5) {
				return true;
			}
		}
		return false;
	}

	List<Mark> takeStrongSubjects(Students student) {
		List<Mark> strongSubjectsList = new ArrayList<Mark>();
		List<Mark> marks = student.getMarks();
		for (Mark mark : marks) {
			if (mark.getMark() == 5) {
				strongSubjectsList.add(mark);

			}
		}

		return strongSubjectsList;
	}

	List<Students> findGoodStudentsWithGoodMark(Group group) {
		List<Students> goodListStudents = new ArrayList<Students>();

		List<Students> students = group.getStudents();
		for (Students st : students) {
			List<Mark> goodMarks;
			if (hasBadMark(st)) {
				goodMarks = takeStrongSubjects(st);
				Students stView = new Students(st.getName(), st.getSurname(),
						goodMarks);
				goodListStudents.add(stView);
			}
		}

		return goodListStudents;
	
	}


}
