package ua.step.homework.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ua.step.homework.Task04;

public class TaskTest04 {
	@Test
	public void testZeroMatrix() {
		int[][] r = {{1},{2,5},{4,3,2},{5,3,7,2}};
		String s = "вправо, влево, вправо.";
		String result = Task04.way(Task04.path(r, 4), 4);
		assertEquals(s, result);
	}
}
