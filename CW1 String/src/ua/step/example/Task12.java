package ua.step.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Метод mixString должен возврашать строку, состоящую из первого символа str1,
 * первого символа str2, второго символа str1, второго символа str2 и т. Д. Любые
 * оставшиеся символы идут в конце результата.
 *
 */
public class Task12
{
    public String mixString(String str1, String str2)
    {
        return "";
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ 
     */
    
    @Test
    public void test01()
    {
        String result = mixString("abc", "xyz");
        assertEquals("Не верно", "axbycz", result);
    }

    @Test
    public void test02()
    {
        String result = mixString("Hi", "There");
        assertEquals("Не верно", "HTihere", result);
    }

    @Test
    public void test03()
    {
        String result = mixString("xxxx", "There");
        assertEquals("Не верно", "xTxhxexre", result);
    }

    @Test
    public void test04()
    {
        String result = mixString("xxx", "X");
        assertEquals("Не верно", "xXxx", result);
    }

    @Test
    public void test05()
    {
        String result = mixString("2/", "27 around");
        assertEquals("Не верно", "22/7 around" , result);
    }

    @Test
    public void test06()
    {
        String result = mixString("", "Hello");
        assertEquals("Не верно", "Hello", result);
    }

    @Test
    public void test07()
    {
        String result = mixString("Abc", "");
        assertEquals("Не верно", "Abc", result);
    }

    @Test
    public void test08()
    {
        String result = mixString("", "");
        assertTrue("Не верно", result.isEmpty());
    }

    @Test
    public void test09()
    {
        String result = mixString("+++", "---");
        assertEquals("Не верно", "+-+-+-", result);
    }
}