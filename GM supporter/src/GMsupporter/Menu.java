package GMsupporter;

public class Menu {
	private GradesService service = new GradesService();

	public void start() {
		while (true) {
			System.out.println("==メニュー==");
			System.out.println("1:登録");
			System.out.println("2:一覧");
		}

	}
}
