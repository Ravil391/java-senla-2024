/**
 * Есть набор предметов, задаваемый заранее, предметы могут повторяться.
 * Предмет имеет 2 параметра (обязательных, остальные добавлять на усмотрение):
 * объем (целое значение) и ценность (целое значение).
 * Предметы неделимы. Также задаётся сейф с обязательным параметром его объёма (целое значение).
 * Нужно написать программу, которая наполняет сейф набором предметов таким образом,
 * чтобы ценность этого набора была максимальной.
 */
package com.Ravil391.tasks.Number5;

import java.util.ArrayList;
import java.util.List;

public class Solution5 {
    public static void main(String[] args) {
        Safe safe = new Safe(50);
        List<Item> items = new ArrayList<>();
        items.add(new Book(2, 100, 123));
        items.add(new Book(4, 100, 222));
        items.add(new Book(7, 50, 346);
        items.add(new Book(9, 40, 521));
        items.add(new Book(15, 300, 500));

        items = safe.addItems(items);

        System.out.println("Невошедшие предметы: " + items + "\n");

        System.out.println(safe + "\n");

        System.out.println("Цена всех предметов в сейфе " + safe.getFullPrice());
    }
}
