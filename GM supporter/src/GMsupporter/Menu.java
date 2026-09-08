package GMsupporter;

public class Menu {

	private GradesService service = new GradesService();

	public void start() {
		while (true) {
			System.out.println("\n== メニュー ==");
			System.out.println("1: 登録");
			System.out.println("2: 一覧");
			System.out.println("3: 更新");
			System.out.println("4: 削除");
			System.out.println("0: アプリを閉じる");

			int choice = InputUtil.readInt("メニュー番号を選んでください: ");

			switch (choice) {
			case 1:
				executeCreate();
				break;
			case 2:
				service.showGradesList();
				break;
			case 3:
				executeUpdate();
				break;
			case 4:
				executeDelete();
				break;
			case 0:
				System.out.println("アプリを終了します。");
				return;
			default:
				System.out.println("無効な番号です。0〜4を選択してください。");
			}
		}
	}

	private void executeCreate() {
		System.out.println("\n--- 成績データの登録 ---");
		int id = InputUtil.readInt("出席番号 (ID): ");
		String name = InputUtil.readString("生徒名: ");
		String subject = InputUtil.readString("教科: ");
		int score = InputUtil.readInt("点数: ");

		service.createGrades(id, name, subject, score);
	}

	private void executeUpdate() {
		System.out.println("\n--- 成績データの更新 ---");
		int id = InputUtil.readInt("更新したい生徒の出席番号 (ID): ");
		String subject = InputUtil.readString("更新したい教科: ");
		int newScore = InputUtil.readInt("新しい点数: ");

		boolean isUpdated = service.updateGrade(id, subject, newScore);

		if (isUpdated) {
			System.out.println("成績を更新しました。");
		} else {
			System.out.println("指定された ID (" + id + ") と教科 (" + subject + ") のデータが見つかりませんでした。");
		}
	}

	private void executeDelete() {
		System.out.println("\n--- 成績データの削除 ---");
		int id = InputUtil.readInt("削除したい生徒の出席番号 (ID): ");
		String subject = InputUtil.readString("削除したい教科: ");

		boolean isDeleted = service.deleteGrade(id, subject);

		if (isDeleted) {
			System.out.println("データを削除しました。");
		} else {
			System.out.println("指定された ID (" + id + ") と教科 (" + subject + ") のデータが見つかりませんでした。");
		}
	}
}