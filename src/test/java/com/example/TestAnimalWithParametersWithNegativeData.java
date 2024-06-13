package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestAnimalWithParametersWithNegativeData {
    private final String ANIMAL_KIND;

    public TestAnimalWithParametersWithNegativeData(String ANIMAL_KIND) {
        this.ANIMAL_KIND=ANIMAL_KIND;

    }
    @Parameterized.Parameters
    public static Object[][] getType() {
        return new Object[][] {
                {"Всеядное"},
                {"Predator"}
        };

    }


    @Test
    public void getFoodWithNegativeDataThrowsException() throws Exception {

        try {
            Animal animal = new Animal();
            animal.getFood(ANIMAL_KIND);
        }
        catch (Exception exception) {

            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
            System.out.println("При вводе некорректного вида животного получен exception с верным текстом сообщения");
        }
    }
}