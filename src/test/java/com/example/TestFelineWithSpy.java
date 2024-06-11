package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestFelineWithSpy {

    @Spy
    Feline feline;
    @Test
    public void getKittensWithDefaultValue() {

        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
        System.out.println("При вызове метода getKittens без параметра был успешно вызван метод getKittens с параметром 1");
    }
}