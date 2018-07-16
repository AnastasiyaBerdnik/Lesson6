package lesson6.anastasiya.students.group;

import java.util.List;

public class ResultsFormat {
	void printStudents(String message, List<Students> students) {
		

	}
	
	void printBadLevelStudents(List<Students> students) {
		for(Students bad: students)
		{
			
			System.out.print( bad.getName());
			System.out.println( bad.getSurname());
		}

	}

	void printGoodLevelStudents(List<Students> students) {
		for(Students good: students)
		{
			System.out.print( good.getName());
			System.out.println( good.getSurname());
		}

	}

}
