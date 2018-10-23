package ua.step.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * При заданной строке str нечетной длины метод middleThree должен возвращать
 * три символа из ее середины, Например при входе «Candy» должно вернуть «and».
 * Если длина строки str менее 3 символов, метод должен вернуть null.
 *
 */
public class Task06
{
    public String middleThree(String str)
    {
        return "";
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ
     */

    @Test
    public void test00()
    {
        String result = middleThree("Candy");
        assertEquals("Не верное количество символов", 3, result.length());
    }

    @Test
    public void test01()
    {
        String result = middleThree("Candy");
        assertEquals("Не верно", "and", result);
    }

    @Test
    public void test02()
    {
        String result = middleThree("and");
        assertEquals("Не верно", "and", result);
    }

    @Test
    public void test03()
    {
        String result = middleThree("solving");
        assertEquals("Не верно", "lvi", result);
    }

    @Test
    public void test04()
    {
        String result = middleThree("Hi yet Hi");
        assertEquals("Не верно", "yet", result);
    }

    @Test
    public void test05()
    {
        String result = middleThree("java yet java");
        assertEquals("Не верно", "yet", result);
    }

    @Test
    public void test06()
    {
        String result = middleThree("Chocolate");
        assertEquals("Не верно", "col", result);
    }

    @Test
    public void test07()
    {
        String result = middleThree("XabcxyzabcX");
        assertEquals("Не верно", "xyz", result);
    }

    @Test
    public void test08()
    {
        String result = middleThree("1");
        assertNull("Короткая строка не обрабатывается", result);
    }

    @Test
    public void test09()
    {
        String result = middleThree("aa");
        assertNull("Короткая строка не обрабатывается", result);
    }
}