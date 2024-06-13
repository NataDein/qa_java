package com.example;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

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


    @Test
    public void lionConstructorWithNegativeDataThrowsException() throws Exception {

        try {
            Lion lion = new Lion(feline, SEX);
        }
        catch (Exception exception) {

            assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
            System.out.println("При вводе некорректного пола получен exception с верным текстом сообщения");
        }
    }

}