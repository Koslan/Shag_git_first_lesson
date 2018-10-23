package ua.step.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Метод conCat должен соеденять две строки в одну (конкатенация) и вернуть результат.
 * Однако, если конкатенация создает двойной символ в результате, то метод
 * должен пропустить один из символов, поэтому при входных данных "abc" и "cat"
 * метод должен вернуть "abcat".
 *
 */
public class Task08
{
    public String conCat(String a, String b)
    {
        return "";
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ 
     */
    
    @Test
    public void test1()
    {
        String result = conCat("abc", "cat");
        assertEquals("Не верно", "abcat", result);
    }

    @Test
    public void test2()
    {
        String result = conCat("dog", "cat");
        assertEquals("Не верно", "dogcat", result);
    }

    @Test
    public void test3()
    {
        String result = conCat("abc", "");
        assertEquals("Не верно", "abc", result);
    }

    @Test
    public void test4()
    {
        String result = conCat("", "cat");
        assertEquals("Не верно", "cat", result);
    }

    @Test
    public void test5()
    {
        String result = conCat("pig", "god");
        assertEquals("Не верно", "pigod", result);
    }

    @Test
    public void test6()
    {
        String result = conCat("pig", "doggy");
        assertEquals("Не верно", "pigdoggy", result);
    }
}