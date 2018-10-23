package ua.step.example;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

/**
 * 
 * Метод getCountBeforeDota должен возвращать количество символов в строке str,
 * до первой точки, если точки в строке нет, метод должен возвращать -1
 * Подсказка: Используй метод indexOn для нахождения позиции первой точки.
 */
public class Task04
{
    public int getCountBeforeDota(String str)
    {
        return -1;
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ 
     */
    
    @Test
    public void test01()
    {
        int result = getCountBeforeDota(null);
        assertEquals("Не верно", 0, result);
    }

    @Test
    public void test02()
    {
        int result = getCountBeforeDota("");
        assertEquals("Не верно", 0, result);
    }

    @Test
    public void test03()
    {
        int result = getCountBeforeDota(".");
        assertEquals("Не верно", 0, result);
    }

    @Test
    public void test04()
    {
        int result = getCountBeforeDota("a.");
        assertEquals("Не верно", 1, result);
    }

    @Test
    public void test05()
    {
        int result = getCountBeforeDota("ab.");
        assertEquals("Не верно", 2, result);
    }

    @Test
    public void test06()
    {
        int result = getCountBeforeDota(".abc.");
        assertEquals("Не верно", 0, result);
    }

    @Test
    public void test07()
    {
        int result = getCountBeforeDota("abc");
        assertEquals("Не верно", -1, result);
    }

    @Test
    public void test08()
    {
        Random rnd = new Random();
        int n = rnd.nextInt(99999);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++)
        {
            sb.append('a');
        }
        sb.append('.');
        int result = getCountBeforeDota(sb.toString());
        assertEquals("Не верно", n, result);
    }
}