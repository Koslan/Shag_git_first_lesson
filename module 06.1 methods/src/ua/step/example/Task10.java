package ua.step.example;

import java.util.Random;

/**
 * 
 * Практическая работа на рекурсию.
 *
 */
public class Task10 {
	public static void main(String[] args) {
		/**
		 * FIXME Написать рекурсивный метод для: 1) Вывода значений массива в обратном
		 * порядке 2) Вычисления факториала числа n 3) Вычисление n члена
		 * последовательности Фибоначи
		 */

		int[] mas = new int[8];
		fillRandom(mas);

	}

	static void fillRandom(int[] mas) {
		for (int j = 0; j < mas.length; j++) {
			mas[j] = j;
		}
	}

	// 1) Вывода значений массива в обратном порядке
	static void count(int[] mas, int i) {
		
		if (mas[i] < 8) {
			System.out.println(i);
			count(mas, ++i);

		}

	}
}
