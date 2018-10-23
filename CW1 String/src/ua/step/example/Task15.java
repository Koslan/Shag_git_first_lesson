package ua.step.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Метод sumNumbers должен вернуть сумму чисел, входящих в строку, игнорируя все
 * остальные символы. Число - это серия из 1 или более цифр подряд. 
 * Подсказка:
 * Character.isDigit (char) проверяет, является ли char одним из символов '0', * '1', .. '9'. 
 * Integer.parseInt (string) преобразует строку в значение типа int.
 * Задача хорошо решается с использованием регулярных выражений.
 */
public class Task15
{
    public int sumNumbers(String str)
    {
        return -1;
    }
    
    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ 
     */
    
    @Test
    public void test01()
    {
        int result = sumNumbers("abc123xyz");
        assertEquals("Не верно", 123, result );
    }

    @Test
    public void test02()
    {
        int result = sumNumbers("aa11b33");
        assertEquals("Не верно", 44, result);
    }

    @Test
    public void test03()
    {
        int result = sumNumbers("7 11");
        assertEquals("Не верно", 18, result);
    }

    @Test
    public void test04()
    {
        int result = sumNumbers("Chocolate");
        assertEquals("Не верно", 0, result);
    }

    @Test
    public void test05()
    {
        int result = sumNumbers("4hoco1a1e");
        assertEquals("Не верно", 6, result);
    }

    @Test
    public void test06()
    {
        int result = sumNumbers("5$$1;;1!!");
        assertEquals("Не верно", 7, result);
    }

    @Test
    public void test07()
    {
        int result = sumNumbers("a1234bb11");
        assertEquals("Не верно", 1245, result);
    }

    @Test
    public void test08()
    {
        int result = sumNumbers("");
        assertEquals("Не верно", 0, result);
    }

    @Test
    public void test09()
    {
        int result = sumNumbers("a22bbb3");
        assertEquals("Не верно", 25, result);
    }
}