package ua.step.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Метод countYZ должен возрашать количество слов, заканчивающихся на «y» или «z» в строке str,
 * Например «y» в «havy» и «z» в «fez» считается как одно слово, но «y» в
 * «yellow» не учитывается, (нечувствительный к регистру). Считать, что y или z
 * находятся в конце слова, если после него не следуют другие буквы из алфавита.
 *
 */
public class Task14
{
    public int countYZ(String str)
    {
        return 0;
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ 
     */
    
    @Test
    public void test00()
    {
        int result = countYZ("");
        assertEquals("Не верно", 0, result);
    }

    @Test
    public void test01()
    {
        int result = countYZ("fez day");
        assertEquals("Не верно", 2, result);
    }

    @Test
    public void test02()
    {
        int result = countYZ("day fez ");
        assertEquals("Не верно", 2, result);
    }

    @Test
    public void test03()
    {
        int result = countYZ("day fyyyz  ");
        assertEquals("Не верно", 2, result);
    }

    @Test
    public void test04()
    {
        int result = countYZ("day yak");
        assertEquals("Не верно", 1, result);
    }

    @Test
    public void test05()
    {
        int result = countYZ("day:yak");
        assertEquals("Не верно", 1, result);
    }

    @Test
    public void test06()
    {
        int result = countYZ("!!day--yaz!!");
        assertEquals("Не верно", 2, result);
    }

    @Test
    public void test07()
    {
        int result = countYZ("yak zak");
        assertEquals("Не верно",  0, result);
    }

    @Test
    public void test08()
    {
        int result = countYZ("DAY abc XYZ");
        assertEquals("Не верно", 2, result);
    }

    @Test
    public void test09()
    {
        int result = countYZ("aaz yyz my");
        assertEquals("Не верно", 3, result);
    }

    @Test
    public void test10()
    {
        int result = countYZ("y2bz");
        assertEquals("Не верно", 2, result);
    }

    @Test
    public void test11()
    {
        int result = countYZ("zxyx");
        assertEquals("Не верно", 0, result);
    }
}