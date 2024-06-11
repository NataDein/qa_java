package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    public final Feline feline;

    /**Конструктор создает объект и присваивает значение hasMane в зависимости от пола*/
    public Lion(Feline feline, String sex) throws Exception {
        this.feline = feline;

        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    /**Метод "Получить кол-во котят" опирается на метод из класса "Кошачьи" с вариантом "по умолчанию"*/
    public int getKittens() {
        return feline.getKittens();
    }

    /** Метод "Есть ли грива" возвращает значение переменной. Значение определяется конструктором при создании объекта*/
    public boolean doesHaveMane() {
        return hasMane;
    }

    /**Метод "Получить еду" опирается на переопределенный метод из семейства кошачьих*/
    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
