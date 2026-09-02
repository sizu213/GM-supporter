package GMsupporter;

import java.util.Scanner;

public class InputUtil {

	private static Scanner scanner = new Scanner(System.in);

	public static String readString(String prompt) {
		System.out.println(prompt);
		return scanner.nextLine();
	}

	public static int readInt(String prompt) {
		while (true) {
			System.out.println(prompt);
			if (scanner.hasNextInt()) {
				int input = scanner.nextInt();
				scanner.nextLine();
				return input;
			} else {
				System.out.println("エラー: 数字を入力してください");
				scanner.next();
			}

		}
	}
}
