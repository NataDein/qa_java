package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class TestAnimalWithParametersWithPositiveData {
    private final String ANIMAL_KIND;
    private List<String> food;

    public TestAnimalWithParametersWithPositiveData(String ANIMAL_KIND, List<String> food) {
        this.ANIMAL_KIND=ANIMAL_KIND;
        this.food = food;
    }
    @Parameterized.Parameters
    public static Object[][] getType() {
        return new Object[][] {
                {"Хищник", Arrays.asList("Животные", "Птицы", "Рыба")},
                {"Травоядное", Arrays.asList("Трава", "Различные растения")},
        };

    }

    @Test
    public void getFoodWithParametersReturnsRightList() throws Exception {
        Animal animal = new Animal();
            Assert.assertEquals("Неверно определены варианты пищи",food,animal.getFood(ANIMAL_KIND));
            System.out.println("Для вида \"" + ANIMAL_KIND + "\" верно определены варианты пищи");
    }
}