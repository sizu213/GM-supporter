package GMsupporter;

import java.util.Scanner;

public class InputUtil {

	private static Scanner scanner = new Scanner(System.in);

	public static String readString(String prompt) {
		while (true) {
			System.out.println(prompt);

			String input = scanner.nextLine();
			if (input.matches(".*[0-9０-９].*")) {
				System.out.println("数字は入力できません");
				continue;
			}
			return input;

		}

	}

	public static int readInt(String prompt) {
		while (true) {
			System.out.println(prompt);
			if (scanner.hasNextInt()) {
				int input = scanner.nextInt();
				scanner.nextLine();

				if (input < 0) {
					System.out.println("マイナス値は入力できません");
					continue;
				}
				return input;
			} else {
				System.out.println("数字を入力してください");
				scanner.next();
			}
			{

			}

		}
	}
}
