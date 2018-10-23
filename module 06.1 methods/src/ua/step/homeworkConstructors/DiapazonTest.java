package ua.step.homeworkConstructors;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


import ua.step.homeworkConstructors.*;

/*
 *	Создать программу, которая позволяет ввести с клавиатуры n 
 *	диапазонов целочисленных значений  (например 3 10).  
 *	Каждый диапазон имеет начальную и конечную точку. 
 *	Диапозоны представляют собой отрезки отложенные на оси X.
 *	В случае если начальное значение больше конечного , 
 *	необходимо поменять их местами.  
 *	Пример:
 *	Входные данные: 3 9, -2 4, 11 15
 *	Выходные 3,  6,  4
 *
 *	Для задание 1 добавить возможность проверки 
 *	пересекаются ли различные диапозоны значений. 
 */

public class DiapazonTest {
	@Test
	public void testDiapazon01() {
		int r =  9 - 3;
		assertEquals(Diapazon.diapazonSum(3, 9), r);
	}
	
	@Test
	public void testDiapazon02() {
		int r =  9 + 3;
		assertEquals(Diapazon.diapazonSum(9, -3), r);
	}
	
	
	@Test
	public void testDiapazon03() {
		int r =  6;
		assertEquals(Diapazon.diapazonSum(-2, 4), r);
	}
	
	
	@Test
	public void testDiapazon04() {
		int r =  6;
		assertEquals(Diapazon.diapazonSum(-2, -8), r);
	}
	
	@Test
	public void testDiapazon05() {
		int r =  11;
		assertEquals(Diapazon.diapazonSum(-11, 0), r);
	}
	
	
	@Test
	public void testDiapazon1_1() {
		assertEquals(Diapazon.crossDiapazon(3, 8, 4, 9), true);
	}
	
	@Test
	public void testDiapazon1_2() {
		assertEquals(Diapazon.crossDiapazon(3, 8,  -1, 9), true);
	}
	
	@Test
	public void testDiapazon1_3() {
		assertEquals(Diapazon.crossDiapazon(3, 8, 4, 5), true);
	}
	
	@Test
	public void testDiapazon1_4() {
		assertEquals(Diapazon.crossDiapazon(0, -5, -1, 2), true);
	}
	
	@Test
	public void testDiapazon1_5() {
		assertEquals(Diapazon.crossDiapazon(-2, -8, 1, 2), false);
	}
	
	@Test
	public void testDiapazon1_6() {
		assertEquals(Diapazon.crossDiapazon(0, 1, -8, -11), false);
	}
}
