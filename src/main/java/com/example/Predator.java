package com.example;

import java.util.List;

/** Интерфейс "Хищник" */
public interface Predator {

    /** Метод "Есть Мясо"*/
    List<String> eatMeat() throws Exception;

}
