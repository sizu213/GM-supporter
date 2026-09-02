package GMsupporter;

public class Menu {

	private GradesService service = new GradesService();

	public void start() {
		while (true) {
			System.out.println("==メニュー==");
			System.out.println("1:登録");
			System.out.println("2:一覧");
			System.out.println("3:更新");
			System.out.println("4:削除");
			System.out.println("0:アプリを閉じる");
			int choice = InputUtil.readInt("メニュー番号を選んでください");
			switch (choice) {
			case 1: {
				service.executeCreate();
				break;
			}
			case 2: {
				service.Gradeslist();
				break;
			}
			default:
				System.out.println("無効な番号です。0~4を選択してください");
			}

		}

	}

}
