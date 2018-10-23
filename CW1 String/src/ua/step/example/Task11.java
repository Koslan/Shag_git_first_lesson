package ua.step.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Метод endOther должен возвращать true, если строка str2 содержится в конце
 * строки str1 или наоборот, игнорируя разницу в верхнем / нижнем регистре
 * (другими словами, вычисление не должно быть «чувствительным к регистру»).
 *
 */
public class Task11
{
    public boolean endOther(String str1, String str2)
    {
        return false;
    }
    
    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ 
     */
    
    @Test
    public void test01()
    {
        boolean result = endOther("Hiabc", "abc");
        assertTrue("Не верно", result);
    }

    @Test
    public void test02()
    {
        boolean result = endOther("AbC", "HiaBc");
        assertTrue("Не верно", result);
    }

    @Test
    public void test03()
    {
        boolean result = endOther("abc", "abXabc");
        assertTrue("Не верно", result);
    }

    @Test
    public void test04()
    {
        boolean result = endOther("Hiabc", "bc");
        assertTrue("Не верно", result);
    }

    @Test
    public void test05()
    {
        boolean result = endOther("abc", "abc");
        assertTrue("Не верно", result);
    }

    @Test
    public void test06()
    {
        boolean result = endOther("xyz", "12xyz");
        assertTrue("Не верно", result);
    }

    @Test
    public void test07()
    {
        boolean result = endOther("Z", "12xz");
        assertTrue("Не верно", result);
    }

    @Test
    public void test08()
    {
        boolean result = endOther("12", "12");
        assertTrue("Не верно", result);
    }

    @Test
    public void test09()
    {
        boolean result = endOther("Hiabc", "abcd");
        assertFalse("Не верно", result);
    }

    @Test
    public void test10()
    {
        boolean result = endOther("Hiabcx", "bc");
        assertFalse("Не верно", result);
    }

    @Test
    public void test11()
    {
        boolean result = endOther("yz", "12xz");
        assertFalse("Не верно", result);
    }

    @Test
    public void test12()
    {
        boolean result = endOther("abcXYZ", "abcDEF");
        assertFalse("Не верно", result);
    }

    @Test
    public void test13()
    {
        boolean result = endOther("ab", "ab12");
        assertFalse("Не верно", result);
    }
}