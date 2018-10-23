package ua.step.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Метод cheerfulCompany получает на вход строку str, в который могут
 * встречаться только символы '<' или '>'. Каждый из символов обозначает солдата
 * в шеренге: '<': солдат, стоящий лицом влево; '>' солдат, стоящий лицом
 * вправо. В процессе работы метода каждый солдат A смотрит на стоящего пред ним
 * солдата B и если он повернут не в ту сторону, в которую смотрит солдат A, он
 * поварачивается в другую сторону. Все солдаты меняют свое направление в
 * шеренге одновременно. Метод должен определить сколько поворотов понадобится
 * солдатам чтобы перестать поварачиваться. Если солдаты не могут определится c
 * положением более чем n! (где n - длина строки) перестановок, метод должен
 * вернуть -1;
 * 
 */
public class Task17
{
    public int cheerfulCompany(String str)
    {
        return -1;
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ 
     */
    
    @Test
    public void testWrongChar()
    {
        int result = cheerfulCompany("<A>");
        assertSame("Некоректный символ", -1, result);
    }

    @Test
    public void testNull()
    {
        int result = cheerfulCompany(null);
        assertSame("Не верный результат",  -1, result);
    }

    @Test
    public void testEmpty()
    {
        int result = cheerfulCompany("");
        assertSame("Не верно",  -1, result);
    }

    @Test
    public void test00()
    {
        int result = cheerfulCompany(">>>");
        assertSame("Не верно",  0, result);
    }

    @Test
    public void test01()
    {
        int result = cheerfulCompany("<<<");
        assertSame("Не верно",  0, result);
    }

    @Test
    public void test04()
    {
        int result = cheerfulCompany(">><<><");
        assertSame("Не верно", 14, result);
    }

    @Test
    public void test05()
    {
        int result = cheerfulCompany("><");
        assertSame("Не верно", 2, result);
    }

    @Test
    public void test06()
    {
        int result = cheerfulCompany(">><");
        assertSame("Не верно", 4, result);
    }

    @Test
    public void test07()
    {
        int result = cheerfulCompany("<><><><>");
        assertSame("Не верно", 12, result);
    }
}