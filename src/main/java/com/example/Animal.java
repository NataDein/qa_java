package com.example;

import java.util.List;

public class Animal {

    /** Метод "Получить еду" в зависимости от вида животного выводит соответствующий список еды*/
    public List<String> getFood(String animalKind) throws Exception {
        if ("Травоядное".equals(animalKind)) {
            return List.of("Трава", "Различные растения");
        } else if ("Хищник".equals(animalKind)) {
            return List.of("Животные", "Птицы", "Рыба");
        } else {
            throw new Exception("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }

    /** Метод "Получить семейство". Нужен для дальнейшего переопределения*/
    public String getFamily() {
        return "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    }
}