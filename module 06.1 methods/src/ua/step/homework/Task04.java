package ua.step.homework;

import java.util.Random;


/**Написать метод:
 * выводящий  значения треугольника на консоль в таком виде как на рисунке.
 * вычисляющий наибольшую сумму чисел, через которые проходит путь, 
 * начинающийся на вершине и заканчивающийся где-то на основании.
 * 1. Каждый шаг может идти диагонально вниз направо или диагонально вниз налево.
 * 2. Количество строк в треугольнике >1, но  <100.
 * 3. Числа в треугольнике все целые от 0 до 99 включительно 
 * (генерируются случайным образом).
 * В примере, описанном выше, это путь 7, 3, 8, 7, 5, дающий максимальную сумму 30.
 * Программа должна выводить на экран треугольник и путь, который даст 
 * максимальный результат. 
 * Для текущего примера он будет такой — влево, влево, вправо, влево.
*/

public class Task04 {
	public static void main(String[] args) {
		int masHeight = 10; // высота треугольника
		
		int[][] newRandomTriangle = newRandomTriangle(masHeight);
		masPrint(newRandomTriangle);
		System.out.println();
		System.out.println(way(path(newRandomTriangle, masHeight), masHeight));	

	}

	public static int[][] newRandomR(int masHeight) { 
		int[][] mas = new int[masHeight][masHeight];
		for (int i = 0; i < masHeight; i++) {
			mas[i][i] = i + 1;
		}
		return mas;
	}

	public static int[][] newRandomTriangle(int masHeight) {
		int[][] mas = new int[masHeight][];
		Random rnd = new Random();

		for (int i = 0; i < masHeight; i++) {
			mas[i] = new int[i + 1];
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rnd.nextInt(99);
			}
		}
		return mas;
	}

	public static void masPrint(int[][] mas) {
		for (int i = 0; i < mas.length; i++) { // по высоте
			for (int j = 0; j < mas[i].length; j++) {
				if (j == 0) {
					for (int j2 = mas.length - 1; j2 > i; j2--) {
						System.out.print("   ");
					}
				}
				System.out.printf("%2d    ", mas[i][j]);
				//System.out.printf("%2d ", mas[i][j]);
			}
			System.out.println();
		}
	}

	public static int path(int[][] mas, int masHeight) {
		int iterationCount = (int) (Math.pow(2, masHeight));
		int pathMax = 0;
		int sumMax = 0;

		for (int i = 0; i < iterationCount; i++) // Проверка всех путей
		{
			int x = 0;
			int sum = 0;
			int z = (int) (Math.pow(2, masHeight - 1));

			for (int h = 1; h < masHeight; h++) // Проверка этажей
			{
				if ((i & z) == z) {
					x += 1;
					sum += mas[h][x];
				} else {
					sum += mas[h][x];
				}
				z >>= 1;
			}
			if (sum > sumMax) {
				pathMax = i;
				sumMax = sum;
			}
		}
		return pathMax;
	}

	

	
	public static String way(int number, int masHeight) {
		int z = (int) (Math.pow(2, masHeight - 1));
		String way = "";

		for (int h = 1; h < masHeight; h++) {
			if ((number & z) == z) {
				way += "вправо";
			} else {
				way += "влево";
			}
			if (h == masHeight - 1) {
				way += ".";
			} else {
				way += ", ";
			}
			z >>= 1;
		}
		return way;
	}
}



