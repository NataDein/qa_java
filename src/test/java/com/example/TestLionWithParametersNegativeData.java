package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestLionWithParametersNegativeData {

    private Feline feline;
    private final String SEX;

    public TestLionWithParametersNegativeData(Feline feline, String sex) {
        this.feline = feline;
        this.SEX = sex;
    }

    @Parameterized.Parameters
    public static Object[][] getParameters() {
        return new Object[][] {
                {new Feline(), "Не определен"},
                {new Feline(), "Средний"},
        };
    }


    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    @Test
    public void LionConstructorWithNegativeDataThrowsException() throws Exception {

        System.out.println("Если тест пройден, значит при вводе некорректного пола получен exception с верным текстом сообщения");

        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Используйте допустимые значения пола животного - самец или самка");
        Lion lion = new Lion(feline, SEX);
    }

}