package ua.step.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Дана строка str, метод maxBlock должен вернуть длину самого большого «блока»
 * в строке. Блок - это последовательность одинаковых символов не прерываемая
 * другими символами.
 *
 */
public class Task16
{
    public int maxBlock(String str)
    {
        return -1;
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ
     */

    @Test
    public void test01()
    {
        int result = maxBlock("hoopla");
        assertEquals("Не верно", 2, result);
    }

    @Test
    public void test02()
    {
        int result = maxBlock("abbCCCddBBBxx");
        assertEquals("Не верно", 3, result);
    }

    @Test
    public void test03()
    {
        int result = maxBlock("xyz");
        assertEquals("Не верно", 1, result);
    }

    @Test
    public void test04()
    {
        int result = maxBlock("xxyz");
        assertEquals("Не верно", 2, result);
    }

    @Test
    public void test05()
    {
        int result = maxBlock("xyzz");
        assertEquals("Не верно", 2, result);
    }

    @Test
    public void test06()
    {
        int result = maxBlock("abbbcbbbxbbbx");
        assertEquals("Не верно", 3, result);
    }

    @Test
    public void test07()
    {
        int result = maxBlock("XXBBBbbxx");
        assertEquals("Не верно", 3, result);
    }

    @Test
    public void test08()
    {
        int result = maxBlock("XXBBBBbbxx");
        assertEquals("Не верно", 4, result);
    }

    @Test
    public void test09()
    {
        int result = maxBlock("XXBBBbbxxXXXX");
        assertEquals("Не верно", 4, result);
    }

    @Test
    public void test10()
    {
        int result = maxBlock("XX2222BBBbbXX2222");
        assertEquals("Не верно", 4, result);
    }
}