package ua.step.homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * В массиве хранится n явно заданных текстовых строк. Создать метод: •
 * Выводящий содержимое массива в строку через пробел • Сортирующий массив в
 * обратном порядке (без учёта регистра) от z до a; • Сортирующий массив по
 * количеству слов в строке (слова разделены пробелами).
 * 
 * Программа должна вывести строки в начальном и отсортированном порядке.
 * (Дополнительно 1 балл за генерацию случайных уникальных 
 * строк реализованных в
 * виде метода).
 */

public class Task03 {
	public static void main(String[] args) {
		int masLenght = 8;
		int stringLenght = 12;

		// System.out.println(generateUniqString(stringLenght));
		String[] s = generateStringMas(masLenght, stringLenght);

		System.out.println("Массив случайных строк");
		printMas(s);
		System.out.println();

		System.out.println("Сортирующий массив по количеству слов в строке");
		masSortWordCount(s);
		printMas(s);
		System.out.println();

		System.out.println("Сортирующий массив в обратном порядке");

		printMas(masSortReverse(s));

	}

	public static void printMas(String[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
			System.out.println();
		}
	}

	public static String[] masSortReverse(String[] mas) {
		Arrays.sort(mas, Collections.reverseOrder());

		return mas;
	}

	/*
	 * String[] mas1 = new String[mas.length]; int index = 0;
	 * 
	 * for (int i = 0; i < mas.length; i++) { String s = mas[i]; for (int j = 0; j <
	 * mas.length; j++) { if (s.compareTo(mas[j]) < s.compareTo(mas[i])) { s =
	 * mas[j]; index = j; } } mas1[i] = s; mas[index] = ""; } return mas1; }
	 */

	public static void masSortWordCount(String[] origin) {

		for (int i = origin.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				// проверка на пробелы j " "
				String slova1 = origin[j];
				slova1 = slova1.trim();
				while (slova1.indexOf("  ") > -1) {
					slova1 = slova1.replace("  ", " ");
				}
				// проверка на пробелы j+1 " "
				String slova2 = origin[j + 1];
				slova2 = slova2.trim();
				while (slova2.indexOf("  ") > -1) {
					slova2 = slova2.replace("  ", " ");
				}
				String[] kolSlov = slova1.split(" ");
				int kolSlovOne = kolSlov.length;
				String[] kolSlov2 = slova2.split(" ");
				int kolSlovTwo = kolSlov2.length;

				if (kolSlovOne > kolSlovTwo) {
					String tmp = origin[j];
					origin[j] = origin[j + 1];
					origin[j + 1] = tmp;
				}

			}

		}
	}

	public static String generateUniqString(int n) {
		String s = new String();
		Random rnd = new Random();
		s += (char) ((rnd.nextInt(26)) + 'a'); // первый символ в строке

		for (int i = 1; i < n; i++) {
			int x = (rnd.nextInt(26));
			int r = (rnd.nextInt(26));

			if (r > 20 && s.charAt(i - 1) != ' ') {
				s += ' ';
			} else {
				s += (char) (x + 'a');
			}
		}
		return s;
	}

	public static String[] generateStringMas(int masLenght, int stringLenght) {
		String[] s = new String[masLenght];
		for (int i = 0; i < masLenght; i++) {
			s[i] = generateUniqString(stringLenght);
		}
		return s;
	}
}
