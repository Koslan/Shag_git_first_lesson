package ua.step.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Метод getSequence должен возврашать строку в которой хранится
 * последовательность цифр, где каждая цифра повторяется количество раз равных
 * ее значению. Параметр size задает до какого числа повторяется
 * последовательность.
 * Подсказка: Для конкатинации строк используй StringBuilder (он эффективнее)
 */
public class Task03
{
    public String getSequence(int size)
    {
        return null;
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ
     */

    @Test
    public void testNotNull()
    {
        String result = getSequence(0);
        assertNotNull(result);
    }
    
    @Test
    public void test00()
    {
        String result = getSequence(-1);
        assertTrue(result.isEmpty());
    }

    @Test
    public void test01()
    {
        String result = getSequence(0);
        assertTrue(result.isEmpty());
    }

    @Test
    public void test02()
    {
        String result = getSequence(1);
        assertEquals("1", result);
    }

    @Test
    public void test03()
    {
        String result = getSequence(2);
        assertEquals("122", result);
    }
    @Test
    public void test04()
    {
        String result = getSequence(3);
        assertEquals("122333", result);
    }
    @Test
    public void test05()
    {
        String result = getSequence(4);
        assertEquals("1223334444", result);
    }

    // проверяет чтобы время работы метода не привысило 3 мс
    @Test(timeout = 3)
    public void testTime()
    {
        getSequence(100);
    }
}