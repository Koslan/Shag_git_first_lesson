package ua.step.homework;

import java.util.Scanner;

/**
 * Напишите метод, проверяющую правильность расстановки скобок в строке
 * введённой с клавиатуры. При правильной расстановке выполняются условия: •
 * количество открывающих и закрывающих скобок равно. • внутри любой пары
 * открывающая – соответствующая закрывающая скобка, скобки расставлены
 * правильно. В строке могут присутствовать скобки как круглые, так и квадратные
 * скобки (и др. символы). Каждой открывающей скобке соответствует закрывающая
 * того же типа (круглой – круглая, квадратной- квадратная). Пример неправильной
 * расстановки: ( [ a) b]. Пример правильных входных данных (a[b](f[(g)(g)]))
 * 
 * Программа должна вывести результат в виде сообщения, примеры: • Правильная
 * строка • Ошибка отсутствие ( • Ошибка отсутствие ( • Ошибка отсутствие [ •
 * Ошибка отсутствие ]
 */

public class Task06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введете Строку");
		String line = scanner.nextLine();
		System.out.println(checking(line));

	}

	public static String checking(String s) {
		int checkCL = 0; // CL - circular left 1
		int checkSL = 0; // SL - square left 2
		int checkCR = 0; // 11
		int checkSR = 0; // 22

		String sequence = "";

		for (int i = 0; i < s.length(); i++) {
			String symbol = s.substring(i, i + 1);

			if (checkCR > checkCL) {
				return "Ошибка! Отсутствие (";
			}
			if (checkSR > checkSL) {
				return "Ошибка! Отсутствие [";
			}
			if (symbol.equals("(")) {
				checkCL++;
				sequence += symbol;
			}
			if (symbol.equals("[")) {
				checkSL++;
				sequence += symbol;
			}
			if (symbol.equals(")")) {
				checkCR++;
				sequence += symbol;
			}
			if (symbol.equals("]")) {
				checkSR++;
				sequence += symbol;
			}
		}

		if (checkCL - checkCR != 0 || checkSL - checkSR != 0) {
			if (checkCL > checkCR) {
				return "Ошибка! Отсутствие )";
			}
			if (checkCL < checkCR) {
				return "Ошибка! Отсутствие (";
			}
			if (checkSL > checkSR) {
				return "Ошибка! Отсутствие ]";
			}
			if (checkSL < checkSR) {
				return "Ошибка! Отсутствие [";
			}

			if (sequence.charAt(1) == ')' || sequence.charAt(1) == ']') {
				return "Неправильная первая скобка";
			}
		}

		for (int i = 1; i < sequence.length(); i++) {
			boolean b1 = sequence.charAt(i - 1) == '(' && sequence.charAt(i) == ']';
			boolean b2 = sequence.charAt(i - 1) == '[' && sequence.charAt(i) == ')';
			if (b1 || b2) {
				return "Неправильная последовательность скобок";
			}
		}

		return "Правильная строка";

	}
}
