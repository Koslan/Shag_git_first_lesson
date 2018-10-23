package ua.step.example;

public class Task06 {
	public static void main(String[] args) {
		// вызов статического метода из другого класса.
		int[][] mas = Task05.createIntMas(4, 4);
		Task05.fillRandom(mas, 7);
		changeNumber(mas);
		Task05.print(mas);
	}

	static void changeNumber(int[][] mas1) {
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				if (j % 2 == 0) {
					mas1[i][j] = -mas1[i][j];
				}
			}
		}
	}
}
/**
 * Написать метод, который принимает в качестве формального параметра массив
 * целых чисел и изменяет значения каждого четного элемента массива на
 * противоположное. Вывести результат используя метод print из класса Task05.
 */
