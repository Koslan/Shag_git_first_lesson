package ua.step.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Метод stringX должен вернуть новую строку в которой все символы «x» в строке
 * str будут удалены. За исключением «x» в самом начале или в конце строки str.
 * 
 */
public class Task13
{
    public String stringX(String str)
    {
        return "";
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ
     */

    @Test
    public void test00()
    {
        String result = stringX("");
        assertTrue("Результат должен быть пустой строкой", result.isEmpty());
    }

    @Test
    public void test01()
    {
        String result = stringX("xxHxix");
        assertEquals("Не верно", "xHix", result);
    }

    @Test
    public void test02()
    {
        String result = stringX(" abxxxcd ");
        assertEquals("Не верно", " abcd ", result);
    }

    @Test
    public void test03()
    {
        String result = stringX(" xabxxxcdx ");
        assertEquals("Не верно", " xabcdx ", result);
    }

    @Test
    public void test04()
    {
        String result = stringX("xKittenx");
        assertEquals("Не верно", "xKittenx", result);
    }

    @Test
    public void test05()
    {
        String result = stringX("Hello");
        assertEquals("Не верно", "Hello", result);
    }

    @Test
    public void test06()
    {
        String result = stringX("Hix");
        assertEquals("Не верно", result, result);
    }

    @Test
    public void test07()
    {
        String result = stringX("xx");
        assertEquals("Не верно", "xx", result);
    }

    @Test
    public void test08()
    {
        String result = stringX("x");
        assertEquals("Не верно", "x", result);
    }

    @Test
    public void test09()
    {
        String result = stringX("2x2");
        assertEquals("Не верно", "22", result);
    }

    @Test
    public void test10()
    {
        String result = stringX("x x x");
        assertEquals("Не верно", "x  x", result);
    }
}