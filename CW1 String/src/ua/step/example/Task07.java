package ua.step.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Метод lastChars принимает на входе 2 строки (a и b) и должен возврашать новую
 * строку в которой первый символ - это символ из строки a и последий символ это
 * последний символ из строки b. 
 * Если водные строки пустые или null, используйте «@» для отсутствующего символа.
 *
 */
public class Task07
{
    public String lastChars(String a, String b)
    {
        return "";
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ 
     */
    
    @Test
    public void test00()
    {
        String result = lastChars("", "hello");
        assertEquals("Не верно", "@o", result);
    }

    @Test
    public void test01()
    {
        String result = lastChars(null, "hello");
        assertEquals("Не верно", "@o", result);
    }

    @Test
    public void test02()
    {
        String result = lastChars("hi", "");
        assertEquals("Не верно", "h@", result);
    }

    @Test
    public void test03()
    {
        String result = lastChars("hi", null);
        assertEquals("Не верно", "h@", result);
    }

    @Test
    public void test04()
    {
        String result = lastChars("last", "chars");
        assertEquals("Не верно", "ls", result);
    }

    @Test
    public void test05()
    {
        String result = lastChars("yo", "java");
        assertEquals("Не верно", "ya", result);
    }

    @Test
    public void test06()
    {
        String result = lastChars("", "");
        assertEquals("Не верно", "@@", result);
    }

    @Test
    public void test07()
    {
        String result = lastChars("k", "zip");
        assertEquals("Не верно", "kp", result);
    }
}