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

	public void showGradesList() {
		if (gradesList.isEmpty()) {
			System.out.println("登録されている成績データはありません。");
			return;
		}

		System.out.println("\n--- 成績一覧 ---");
		for (Grades g : gradesList) {
			System.out.println("ID: " + g.getId() + " | 名前: " + g.getName() + " | 教科: " + g.getSubject() + " | 点数: "
					+ g.getScore());
		}
	}

	public boolean updateGrade(int id, String subject, int newScore) {
		for (Grades grade : gradesList) {
			if (grade.getId() == id && grade.getSubject().equalsIgnoreCase(subject)) {
				grade.setScore(newScore);
				return true;
			}
		}
		return false;
	}

	public boolean deleteGrade(int id, String subject) {
		for (int i = 0; i < gradesList.size(); i++) {
			Grades g = gradesList.get(i);
			if (g.getId() == id && g.getSubject().equalsIgnoreCase(subject)) {
				gradesList.remove(i);
				return true;
			}
		}
		return false;
	}
}