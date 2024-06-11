package com.example;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import java.util.Random;


public class TestFeline {

    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals("Полученные варианты пищи не соответствуют ожидаемым", expected, actual);
        System.out.println("При вызове метода eatMeat успешно отработал метод getFood и вернул нужные значения");
    }

   @Test
    public void getFamily() {
        Feline feline = new Feline();
        String expectedFelineFamily = "Кошачьи";
        String actualFelineFamily = feline.getFamily();
        assertEquals("Полученное значение семейства не соответствует ожидаемому", expectedFelineFamily, actualFelineFamily);
        System.out.println("При вызове метода getFamily получено верное значение семейства: " + actualFelineFamily);
    }

    @Test
    public void getKittensWithRandomValue() {
        Feline feline = new Feline();
        Random random = new Random();
        int expected = random.nextInt(100);;
        int actual = feline.getKittens(expected);

        assertEquals("Полученное количество котят не соответствует ожидаемому", expected, actual);
        System.out.println("Полученное количество котят соответствует ожидаемому: " + actual);
    }
}