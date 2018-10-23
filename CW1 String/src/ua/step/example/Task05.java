package ua.step.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * Метод nonStart должен возврашать строку в которой объеденены две
 * входные строки, без первого символа из каждой строки.
 *
 */
public class Task05
{
    public String nonStart(String start, String end)
    {
        return "";
    }
    
    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ 
     */
    
    @Test
    public void test00()
    {
        String result = nonStart("", "");
        assertEquals("Не верно", "", result);
    }

    @Test
    public void test01()
    {
        String result = nonStart("Hello", "There");
        assertEquals("Не верно", "ellohere", result);
    }

    @Test
    public void test02()
    {
        String result = nonStart("java", "code");
        assertEquals("Не верно", "avaode", result);
    }

    @Test
    public void test03()
    {
        String result = nonStart("shotl", "java");
        assertEquals("Не верно", "hotlava", result);
    }

    @Test
    public void test04()
    {
        String result = nonStart("ab", "xy");
        assertEquals("Не верно", "by", result);
    }

    @Test
    public void test05()
    {
        String result = nonStart("ab", "x");
        assertEquals("Не верно", "b", result);
    }

    @Test
    public void test06()
    {
        String result = nonStart("x", "ac");
        assertEquals("Не верно",  "c", result);
    }

    @Test
    public void test07()
    {
        String result = nonStart("x", "y");
        assertEquals("Не верно", "", result);
    }

    @Test
    public void test08()
    {
        String result = nonStart("123", "321");
        assertEquals("Не верно", "2321", result);
    }
}