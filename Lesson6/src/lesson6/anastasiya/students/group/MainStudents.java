package lesson6.anastasiya.students.group;

import java.util.List;

public class MainStudents {
	public static void main(String[] args) {

		Students st1 = new Students("Petr", "Petrov");
		st1.addMark("Math", 2);
		st1.addMark("Phisics", 5);
		st1.addMark("English", 4);

		Students st2 = new Students("Oleg", "Sokolov");
		st2.addMark("Math", 2);
		st2.addMark("Phisics", 5);
		st2.addMark("English", 3);

		Students st3 = new Students("Elena", "Petrova");
		st3.addMark("Math", 2);
		st3.addMark("Phisics", 2);
		st3.addMark("English", 2);

		Group gr1 = new Group();
		gr1.addStudents(st1);
		gr1.addStudents(st2);
		gr1.addStudents(st3);

		GroupLogic groupLogic = new GroupLogic();

		System.out.println("Weak Students");
		System.out
				.println("------------------------------------------------------");
		List<Students> students = groupLogic.findBadStudents(gr1);
		List<Students> badStudents = groupLogic.findBadStudentsWithBadMark(gr1);

		ResultsFormat view = new ResultsFormat();
		view.printBadLevelStudents(students);

		System.out.println("");
		System.out.println("Good Students");
		System.out
				.println("------------------------------------------------------");
		List<Students> goodStudents = groupLogic
				.findGoodStudentsWithGoodMark(gr1);

		ResultsFormat view1 = new ResultsFormat();
		view.printGoodLevelStudents(students);

		System.out
				.println("------------------------------------------------------");

		GroupLogic logic = new GroupLogic();

		System.out.println("Group Average Mark: ");
		double avrMarkGroup = groupLogic.calcAvrMark(gr1);
		System.out.println("Value = " + avrMarkGroup);

		System.out.println(" ");

		System.out.println("Average Students Value: ");
		double avrMarkStudent1 = groupLogic.calcAvrMark(st1);
		System.out.println("[Petrov] = " + avrMarkStudent1);

		double avrMarkStudent2 = groupLogic.calcAvrMark(st2);
		System.out.println("[Sokolov] = " + avrMarkStudent2);

		double avrMarkStudent3 = groupLogic.calcAvrMark(st3);
		System.out.println("[Petrova] = " + avrMarkStudent3);

		System.out.println(" ");

	}

}
