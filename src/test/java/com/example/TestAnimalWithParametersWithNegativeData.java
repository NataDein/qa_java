package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

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
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void getFoodWithNegativeDataThrowsException() throws Exception {
        Animal animal = new Animal();
        System.out.println("Если тест пройден, значит при вводе некорректного вида животного получен exception с верным текстом сообщения");

        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        animal.getFood(ANIMAL_KIND);
    }
}