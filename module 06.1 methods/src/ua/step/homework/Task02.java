package ua.step.homework;

import java.util.Arrays;
import java.util.Locale;

import com.sun.glass.ui.Pixels.Format;

/**
 * Написать и протестировать перегруженый метод выводящий на экран: Одномерный
 * массив типа int Одномерный массив типа String Двухмерный массив типа int
 * Двухмерный массив типа float
 */

public class Task02 {
	public static void main(String[] args) {

	}

	public static String print(int[] mas) {
		String s = "[";

		for (int i1 = 0; i1 < mas.length; i1++) {
			if (i1 + 1 != mas.length) {
				s = s + String.format("%d, ", mas[i1]);
			} else {
				s = s + String.format("%d]", mas[i1]);
			}

		}
		System.out.println(s);
		System.out.println();
		return s;
	}

	public static String print(String[] mas) {
		String s = "[";
		for (int i1 = 0; i1 < mas.length; i1++) {
			if (i1 + 1 != mas.length) {
				s = s + String.format("%3s, ", mas[i1]);
			} else {
				s = s + String.format("%3s]", mas[i1]);
			}
		}
		System.out.print(s);
		return s;
	}

	public static String print(int[][] mas, int x) {
		String s = "[";
		for (int i1 = 0; i1 < mas.length; i1++) {
			s += "[";
			for (int j1 = 0; j1 < mas[i1].length; j1++) {
				if (j1 + 1 != mas[i1].length) {
					s = s + String.format("%d, ", mas[i1][j1]);
				} else {
					s = s + String.format("%d]", mas[i1][j1]);
				}
			}
			if (i1 + 1 != mas.length) {
				s += ", ";
			}
		}
		s += "]";

		System.out.println(Arrays.deepToString(mas));
		System.out.println(s);
		return s;

	}

	public static String print(float[][] mas, int x) {
		String s = "[";
		for (int i1 = 0; i1 < mas.length; i1++) {
			s += "[";
			for (int j1 = 0; j1 < mas[i1].length; j1++) {
				if (j1 + 1 != mas[i1].length) {
					s = s + String.format(Locale.ROOT, "%.1f, ", mas[i1][j1]);
				} else {
					s = s + String.format(Locale.ROOT, "%.1f]", mas[i1][j1]);
				}
			}
			if (i1 + 1 != mas.length) {
				s += ", ";
			}
		}
		s += "]";

		System.out.println(Arrays.deepToString(mas));
		System.out.println(s);
		return s;
	}

}
