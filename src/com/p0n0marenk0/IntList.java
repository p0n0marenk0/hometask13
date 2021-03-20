//task1
/*
Дополнить класс IntList;
https://gist.github.com/akadatsky/4aa0f9ee381c54194aa0dd54f138de7f
Необходимо создать класс аналогичный стандартному ArrayList<Integer> на базе массива.
И реализовать 5 методов:
add - добавить значеине в список
get - получить по индексу
set - заменить по индексу
size - верзнуть размер, изначально 0
toString - красиво печатет список
Логика метода add:
создаем временный массив на 1 елемент больше чем arr, копируем в него все элементы из arr,
на последнюю позицию записыаем новый елемент и заменяем arr на временный массив.
*/
package com.p0n0marenk0;

import java.util.Arrays;

public class IntList {

    private int[] array = new int[0];

    public void add(int value) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = value;
        array = newArray;
    }

    public int get(int index) {
        return array[index];
    }

    public void set(int index, int value) {
        array[index] = value;
    }

    public int size() {
        return array.length;
    }

    @Override
    public String toString() {
        String textForPrint = Arrays.toString(array);
        System.out.println(textForPrint);
        return textForPrint;
    }
}
