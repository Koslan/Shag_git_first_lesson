package ua.step.homework.test;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;

import ua.step.homework.*;
import ua.step.homework.Task01;

public class TaskTest02 {
	@Test
	public void testInt() {
		int[] r = {1,0,0};
		String s = Arrays.toString(r);
		String result = Task02.print(r);
		assertEquals(s, result);
	}
	
	@Test
	public void testString() {
		String[] r = {"one","two","free"};
		String s = Arrays.toString(r);
		String result = Task02.print(r);
		assertEquals(s, result);
	}

	@Test
	public void testMultiIntMas() {
		int[][] r = {{1,0,0},{1,1,0},{0,0,1}};
		String s = Arrays.deepToString(r);
		String result = Task02.print(r, 3);
		assertEquals(s, result);
	}
	
	@Test
	public void testMultiFloatMas() {
		float[][] r = {{1.1f,0.1f,0},{1.1f,1,0},{0,0,1}};
		String s = Arrays.deepToString(r);
		String result = Task02.print(r, r.length);
		assertEquals(s, result);
	}
	
}
