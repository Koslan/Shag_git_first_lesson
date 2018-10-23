package ua.step.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Метод withoutX принимает на вход строку a, если первый или последний символы
 * в строке «x», верните строку без этих символов «x», иначе верните строку без
 * изменений.
 *
 */
public class Task09
{
    public String withoutX(String str)
    {
        return "";
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ 
     */
    
    @Test
    public void test01()
    {
        String result = withoutX("xHix");
        assertEquals("Не верно", "Hi", result);
    }

    @Test
    public void test02()
    {
        String result = withoutX("xHi");
        assertEquals("Не верно", "Hi", result);
    }

    @Test
    public void test03()
    {
        String result = withoutX("Hxix");
        assertEquals("Не верно", "Hxi", result);
    }

    @Test
    public void test04()
    {
        String result = withoutX("Hi");
        assertEquals("Не верно", "Hi", result);
    }

    @Test
    public void test05()
    {
        String result = withoutX("xxHi");
        assertEquals("Не верно", "xHi", result);
    }

    @Test
    public void test06()
    {
        String result = withoutX("Hix");
        assertEquals("Не верно", "Hi", result);
    }

    @Test
    public void test07()
    {
        String result = withoutX("xx");
        assertTrue("Не пустая строка", result.isEmpty());
    }

    @Test
    public void test08()
    {
        String result = withoutX("");
        assertTrue("Не пустая строка", result.isEmpty());
    }

    @Test
    public void test09()
    {
        String result = withoutX("x");
        assertTrue("Не пустая строка", result.isEmpty());
    }

    @Test
    public void test10()
    {
        String result = withoutX("Hello");
        assertEquals("Не верно", "Hello", result);
    }

    @Test
    public void test11()
    {
        String result = withoutX("Hexllo");
        assertEquals("Не верно", "Hexllo", result);
    }
}