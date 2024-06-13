package com.example;

import java.util.List;

public class Cat {

    Predator predator;

    /** Конструктор */
    public Cat(Feline feline) {
        this.predator = feline;
    }
    public Cat () {};

    /**Метод "Вернуть звук"*/
    public String getSound() {
        return "Мяу";
    }

    /** Метод, возвращающий виды пищи. Метод обращается к переопределенному методу класса "Feline"*/
    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }

}
