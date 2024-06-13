package com.example;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {


    @Test
    public void getSoundReturnsMeow() {
        Cat cat = new Cat();
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals("Полученный звук не соответствует ожидаемому", expected, actual);
        System.out.println("При вызове метода getSound получен ожидаемый звук: " + expected);
    }

    @Mock
    private Feline feline;

    @Test
    public void getFoodReturnsKindOfMeet() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expected);
        List<String> actual = cat.getFood();
        assertEquals("Полученные варианты пищи не соответствуют ожидаемым", expected, actual);
        System.out.println("При вызове метода getFood успешно вызван метод eatMeat");

    }
}