package GMsupporter;

import java.util.ArrayList;
import java.util.List;

public class GradesService {

	private List<Grades> gradesList = new ArrayList<>();

	public void createGrades(int id, String name, String subject, int score) {
		Grades grade = new Grades(id, name, subject, score);
		gradesList.add(grade);
		System.out.println("登録完了: " + name + " / " + subject);
	}
}
