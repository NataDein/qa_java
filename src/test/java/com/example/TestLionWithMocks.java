package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TestLionWithMocks {

    @Mock
    private Feline feline;
    @Test
    public void getKittensCausesFelineGetKittens() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        int expected = 1;
        Mockito.when(feline.getKittens()).thenReturn(expected);
        int actual = lion.getKittens();
        Assert.assertEquals("Полученное количество котят не соответствует ожидаемому", expected, actual);
        System.out.println("При вызове метода getKittens успешно вызван метод getKittens из класса Feline");
    }

    @Test
    public void getFoodCausesFelineGetFood() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        Mockito.when(feline.getFood("Хищник")).thenReturn(expected);
        List<String> actual = lion.getFood();
        assertEquals("Полученные варианты пищи не соответствуют ожидаемым", expected, actual);
        System.out.println("При вызове метода getFood успешно вызван метод getFood из класса Feline");
    }
}