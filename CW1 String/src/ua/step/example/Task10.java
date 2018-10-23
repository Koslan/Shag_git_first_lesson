package ua.step.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Web построен с использованием HTML-строк и тэгов, такими как «<i>Yay</i>»,
 * который отображает Yay как курсивный текст. В этом примере тег «i» создает
 * <i> и </ i>, которые окружают слово «Yay». С учетом тегов и строк слов
 * создайте строку HTML с тегами вокруг слова, например. "<I> Yay </I>". Если
 * строка c тэгом пустая или null или содержит символы '>', '<' или '/' создайте
 * строку оруженноую тэгом <error>
 */
public class Task10
{
    /***************************************************************************
     * Метод возврашает новую строку в которой word окружен тэгом tag
     *
     * @param tag
     *            название тэга
     * @param word
     *            содержимое внутри тэга
     * @return возврашает новую строку в которой word окружен тэгом tag
     */
    public String makeTags(String tag, String word)
    {
        return "";
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ 
     */
    
    @Test
    public void test00()
    {
        String result = makeTags("i", "");
        assertEquals("Не верно", "<i></i>", result);
    }

    @Test
    public void test01()
    {
        String result = makeTags("i", "Yay");
        assertEquals("Не верно", "<i>Yay</i>", result);
    }

    @Test
    public void test02()
    {
        String result = makeTags("i", "Hello");
        assertEquals("Не верно", "<i>Hello</i>", result);
    }

    @Test
    public void test03()
    {
        String result = makeTags("cite", "Yay");
        assertEquals("Не верно", "<cite>Yay</cite>", result);
    }

    @Test
    public void test04()
    {
        String result = makeTags("address", "here");
        assertEquals("Не верно", "<address>here</address>", result);
    }

    @Test
    public void test05()
    {
        String result = makeTags("body", "Heart");
        assertEquals("Не верно", "<body>Heart</body>", result);
    }

    @Test
    public void test06()
    {
        String result = makeTags("i", "i");
        assertEquals("Не верно", "<i>i</i>", result);
    }

    @Test
    public void test07()
    {
        String result = makeTags("", "i");
        assertEquals("Не верно", "<error>i</error>", result);
    }

    @Test
    public void test08()
    {
        String result = makeTags(null, "i");
        assertEquals("Не верно", "<error>i</error>", result);
    }
    @Test
    public void test09()
    {
        String result = makeTags("<", "i");
        assertEquals("Не верно", "<error>i</error>", result);
    }
    @Test
    public void test10()
    {
        String result = makeTags(">", "i");
        assertEquals("Не верно", "<error>i</error>", result);
    }
    @Test
    public void test11()
    {
        String result = makeTags("/", "i");
        assertEquals("Не верно", "<error>i</error>", result);
    }
    @Test
    public void test12()
    {
        String result = makeTags("<>", "i");
        assertEquals("Не верно", "<error>i</error>", result);
    }
    @Test
    public void test13()
    {
        String result = makeTags("</a>", "i");
        assertEquals("Не верно", "<error>i</error>", result);
    }
}