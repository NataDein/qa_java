package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestLionWithParametersPositiveData {

    private Feline feline;
    private final String SEX;
    private final boolean EXPECTED_HAS_MANE;

    public TestLionWithParametersPositiveData(Feline feline, String sex, boolean hasMane) {
        this.feline = feline;
        this.SEX = sex;
        this.EXPECTED_HAS_MANE = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getParameters() {
        return new Object[][] {
                {new Feline(), "Самец", true},
                {new Feline(), "Самка", false},
        };
    }

    @Test
    public void doesHaveManeWithPositiveData() throws Exception {
        Lion lion = new Lion(feline, SEX);
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals("Возвращено неверное значение переменной hasMane", EXPECTED_HAS_MANE,actualHasMane);
        System.out.println("Возвращено ожидаемое значение переменной hasMane");
    }
}