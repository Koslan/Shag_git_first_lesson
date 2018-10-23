package ua.step.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Метод makeOutWord принемает на вход две строки. Длина строки out всегда 4
 * символа, например «<<>>», верните новую строку, в которой слово находится в
 * середине строки out, например. «<<слово>>».
 * Если длина строки out отлична от четырех  метод должен вернуть null. 
 * Подсказка: вы можете использовать метод insert из класса StringBuilder. 
 * 
 */
public class Task02
{
    public String makeOutWord(String out, String word)
    {
        return null;
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ
     */

    @Test
    public void test00()
    {
        String result = makeOutWord("<>", "Yay");
        assertNull(result);
    }

    @Test
    public void test01()
    {
        String result = makeOutWord("", "Yay");
        assertNull(result);
    }

    @Test
    public void test02()
    {
        String result = makeOutWord(null, "Yay");
        assertNull(result);
    }

    @Test
    public void test03()
    {
        String result = makeOutWord("<<>>", "");
        assertEquals("<<>>", result);
    }

    @Test
    public void test04()
    {
        String result = makeOutWord("<<>>", null);
        assertEquals("<<>>", result);
    }

    @Test
    public void test05()
    {
        String result = makeOutWord("<<>>", "Yay");
        assertEquals("<<Yay>>", result);
    }

    @Test
    public void test06()
    {
        String result = makeOutWord("<<>>", "WooHoo");
        assertEquals("<<WooHoo>>", result);
    }

    @Test
    public void test07()
    {
        String result = makeOutWord("[[]]", "word");
        assertEquals("[[word]]", result);
    }

    @Test
    public void test08()
    {
        String result = makeOutWord("HHoo", "Hello");
        assertEquals("HHHellooo", result);
    }
}