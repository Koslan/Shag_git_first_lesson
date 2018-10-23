package ua.step.homework.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ua.step.homework.Task01;

public class TaskTest01 {
	@Test
	public void testDiagonal() {
		int[][] r = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		int[][] result = Task01.createDiagonalMatrix(3, 1);
		assertEquals(r, result);
	}

	@Test
	public void testDiagonal_1() {
		int[][] r = { { 1, 0 }, { 0, 1 } };
		int[][] result = Task01.createDiagonalMatrix(2, 1);
		assertEquals(r, result);
	}

	@Test
	public void testZeroMatrix() {
		int[][] r = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		int[][] result = Task01.createZeroMatrix(3);
		assertEquals(r, result);
	}

	@Test
	public void testZeroMatrix_2() {
		int[][] r = { { 0, 0 }, { 0, 0 } };
		int[][] result = Task01.createZeroMatrix(2);
		assertEquals(r, result);
	}

	@Test
	public void testSumMatrix() {
		int[][] i1 =  { { 1, 2, 3 }, { 1, 1, 1 }, { 1, 1, 3 } };
		int[][] i2 =  { { 1, 2, 3 }, { 1, 1, 1 }, { 1, 1, 1 } };
		int[][] sum = { { 2, 4, 6 }, { 2, 2, 2 }, { 2, 2, 4 } };

		int[][] result = Task01.sumMatrix(i1, i2, 3);
		Task01.print(result, 3);
		Task01.print(sum, 3);
		assertEquals(sum, result);
	}

	@Test
	public void testSumMatrix_1() {
		int[][] i1 = { { 0, 0 }, { 0, 0 } };
		int[][] i2 = { { 0, 0 }, { 0, 0 } };
		int[][] sum = { { 0, 0 }, { 0, 0 } };

		int[][] result = Task01.sumMatrix(i1, i2, 2);
		assertEquals(sum, result);
	}

	public void testSumMatrix_3() {
		int[][] i1 = { { 1, 2 }, { 1, 1 }, { 1, 1 } };
		int[][] i2 = { { 1, 2 }, { 1, 1 }, { 1, 1 } };
		int[][] sum = { { 2, 4 }, { 2, 2 }, { 2, 2 } };

		int[][] result = Task01.sumMatrix(i1, i2, 2);
		assertEquals(sum, result);
	}

	// multiplicationMatrix
	public void testMultiplicationMatrix() {
		int[][] i1 = { { 1, 2 }, { 1, 1 }, { 1, 1 } };
		int[][] i2 = { { 1, 2 }, { 1, 1 }, { 1, 1 } };
		int[][] m = { { 1, 4 }, { 1, 1 }, { 1, 1 } };

		int[][] result = Task01.multiplicationMatrix(i1, i2, 2);
		assertEquals(m, result);
	}

	@Test
	public void testMultiplicationMatrix_1() {
		int[][] i1 = { { 0, 0 }, { 0, 0 } };
		int[][] i2 = { { 0, 0 }, { 0, 0 } };
		int[][] sum = { { 0, 0 }, { 0, 0 } };

		int[][] result = Task01.multiplicationMatrix(i1, i2, 2);
		assertEquals(sum, result);
	}

	/** determinantMatrix */
	@Test
	public void testDeterminantMatrix() {

		int[][] i1 = { { 1, 5, 3 }, { 2, 4, 7 }, { 11, 5, 1 } };
		int det = 242;

		int result = Task01.determinantMatrix(i1, 3);
		assertEquals(det, result);
	}

	@Test
	public void testDeterminantMatrix_1() {
		int[][] i1 = { { 1, 2, 3 }, { 2, 2, 3 }, { 3, 3, 3 } };
		int det = 3;

		int result = Task01.determinantMatrix(i1, 3);
		assertEquals(det, result);
	}
}
