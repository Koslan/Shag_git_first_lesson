package ua.step.example;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * Перегрузка методов.
 * 
 */
public class Task07 {
	public static void main(String[] args) {
		/*print();
		print(2);
		print("2");*/
		
		
		int row = 4;
		int col = 4;
		int[][] mas = Task05.createIntMas(col, row);
		
		float[][] masF = new float[col][row];
		fillFloat(masF);
		printFloat(masF);
		
		boolean[][] masB = new boolean[col][row];
		fillBoolean(masB);
		printBoolean(masB);
		
		char[][] masC = new char[col][row];
		fillChar(masC);
		printChar(masC);

	}

	static void print() {
		System.out.println("empty");
	}

	// метод имеет такое же имя, но один формальный параметр
	static void print(int i) {
		System.out.println("int value " + i);
	}

	// метод имеет такое же имя, один формальный параметр, но другого типа
	static void print(String s) {
		System.out.println("string " + s);
	}

	static void print(String[] mas) {
		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			System.out.println(mas[i]);
		}
	}

	static void printFloat(float[][] mas1) {
		System.out.println();
		System.out.println("                Массив float");
		System.out.println();
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				System.out.printf("%2f  ", mas1[i][j]);
			}
			System.out.println();
		}
	}

	static void printBoolean(boolean[][] mas1) {
		System.out.println();
		System.out.println("                Массив boolean");
		System.out.println();
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				System.out.print( mas1[i][j] + "  ");
			}
			System.out.println();
		}
	}

	static void printChar(char[][] mas1) {
		System.out.println();
		System.out.println("                Массив char");
		System.out.println();
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				System.out.printf("%6c  ", mas1[i][j]);
			}
			System.out.println();
		}
	}

	static int[][] createFloatMas(int col, int row) {
		return new int[col][row];
	}

	static void fillFloat(float[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = .5f;
			}
		}

	}

	static int[][] createBooleanMas(int col, int row) {
		return new int[col][row];
	}

	static void fillBoolean(boolean[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = true;
			}
		}

	}

	static int[][] createCharMas(int col, int row) {
		return new int[col][row];
	}

	static void fillChar(char[][] mas) {
		Random rnd = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (char) rnd.nextInt(10_000);
			}
		}

	}

	// FIXME Дописать перегруженный метод для вывода массива строк не используя
	// класс Arrays. Дописать методы для вывода на консоль, двухмерных массивов
	// с различными типами данных (float, boolean, char).
}
