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

	void executeCreate() {
		System.out.println("\n--- 成績データの登録 ---");
		int id = InputUtil.readInt("出席番号 (ID): ");
		String name = InputUtil.readString("生徒名: ");
		String subject = InputUtil.readString("教科: ");
		int score = InputUtil.readInt("点数: ");

		createGrades(id, name, subject, score);
	}

	void Gradeslist() {
		if (gradesList.isEmpty()) {
			System.out.println("何も登録されていません");
		} else {
			System.out.println(gradesList);
		}
	}
}
