package com.example;

import java.util.List;

/** Класс "Кошачьи" наследуется от "Животные" и "Хищник" */
public class Feline extends Animal implements Predator {

    /** Переопределенный метод из интерфейса "Хищник.
     * Использует метод getFood, наследованный от класса "Animal".*/
    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    /** Переопределенный метод из "Animal": просто возвращает значение*/
    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    /** Метод "Получить кол-во котят".
     * Задает значение по умолчанию: 1.
     * Метод обращается к самому себе.*/
    public int getKittens() {
        return getKittens(1);
    }

    /** Метод "Получить кол-во котят".
     * Возвращает значение, в зависимости от введенных данных*/
    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
