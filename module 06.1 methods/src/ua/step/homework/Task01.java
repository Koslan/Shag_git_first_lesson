package ua.step.homework;

import java.util.Random;

/**
 * Написать и протестировать методы работы с квадратными матрицами (матрицы
 * представить в виде двухмерных массивов). Должны присутствовать методы: •
 * создания единичной (диагональной) матрицы • создания нулевой матрицы •
 * сложение матриц • умножения матриц • умножение матрицы на скаляр •
 * определение детерминанта матрицы • вывод матрицы на консоль
 */
public class Task01 {
	public static void main(String[] args) {
		int x = 6;

		/*
		 * print(createDiagonalMatrix(x, 1), x); print(createZeroMatrix(x), x);
		 * print(createRandomMatrix(x), x); print(createRandomMatrix(x), x);
		 * print(sumMatrix(createRandomMatrix(x), createRandomMatrix(x), x), x);
		 */
	}

	public static int[][] createRandomMatrix(int x) {
		Random rnd = new Random();
		int[][] mas = new int[x][x];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				mas[i][j] = rnd.nextInt(x * 10);
				int element = mas[i][j];
			}
		}

		return mas;
	}

	public static int[][] createDiagonalMatrix(int x, int elem) {
		int[][] mas = new int[x][x];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == i) {
					mas[i][j] = elem;
				}
			}
		}

		return mas;
	}

	public static int[][] createZeroMatrix(int x) {
		int[][] mas = new int[x][x];
		return mas;
	}

	public static int[][] sumMatrix(int[][] mas1, int[][] mas2, int x) {
		int[][] mas = new int[x][x];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				mas[i][j] = mas1[i][j] + mas2[i][j];
			}
		}
		return mas;
	}

	public static int[][] multiplicationMatrix(int[][] mas1, int[][] mas2, int x) {
		int[][] mas = new int[x][x];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				mas[i][j] = mas1[i][j] * mas2[i][j];
			}
		}
		return mas;
	}

	public int[][] skalarMatrix(int[][] mas1, int x, int elem) {
		int[][] mas = new int[x][x];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j <= x; j++) {
				mas[i][j] = mas1[i][j] * elem;
			}
		}
		return mas;
	}

	public static int determinantMatrix(int[][] mas, int n) {
		int det = 0;
		if (n == 1) {
			det = mas[0][0];
		} else if (n == 2) {
			det = mas[0][0] * mas[1][1] - mas[1][0] * mas[0][1];
		} else {
			det = 0;
			for (int j1 = 0; j1 < n; j1++) {
				int[][] m = new int[n - 1][];
				for (int k = 0; k < (n - 1); k++) {
					m[k] = new int[n - 1];
				}
				for (int i = 1; i < n; i++) {
					int j2 = 0;
					for (int j = 0; j < n; j++) {
						if (j == j1)
							continue;
						m[i - 1][j2] = mas[i][j];
						j2++;
					}
				}
				det += Math.pow(-1, 1 + j1 + 1) * mas[0][j1] * determinantMatrix(m, n - 1);
			}
		}
		return det;
	}

	public static void print(int[][] mas, int x) {
		for (int i1 = 0; i1 < x; i1++) {
			for (int j1 = 0; j1 < x; j1++) {
				System.out.printf("%2d ", mas[i1][j1]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
