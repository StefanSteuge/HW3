package com.cursor;

import java.util.Arrays;
import java.util.Random;

public class ArraysMethods {
    public int[] array;

    public ArraysMethods(int[] array) {
        this.array = array;
    }

    public void even() {
        System.out.println("1. Заповнити масив тільки парними числами:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (i * 2);
            System.out.print(array[i] + " ");
        }
    }

    public void random() {
        System.out.println("\n" + "2. Заповнити масив рандомними числами:");
        Random random = new Random();
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = random.nextInt(85);
            System.out.print(array[i] + " ");
        }
    }

    public void average() {
        System.out.println("\n" + "3. Вивести середнє значення масиву:");
        int average = 0;
        for (int value : array) {
            average = average + value;
        }
        System.out.print("Average: " + average / array.length);
    }

    public void sum3() {
        System.out.println("\n" + "4. Вивести суму всіх значень кратних 3:");
        int sum3 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 3 == 0) {
                sum3 += i;
            }
        }
        System.out.print(sum3);
    }

    public void sumEven() {
        System.out.println("\n" + "5. Вивести значення всіх парних індексів масиву:");
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
    }

    public void sort() {
        System.out.println("\n" + "6. Просортувати масив в порядку зростання:");
        for (int k : array) {
            Arrays.sort(array);
            System.out.print(k + " ");
        }
    }

    public void min() {
        System.out.println("\n" + "7. Вивести найменше значення в масиві:");
        int min = array[0];
        for (int j : array) {
            if (min > j) min = j;
        }
        System.out.print(min);
    }

    public void max() {
        System.out.println("\n" + "8. Вивести найбільше значення масиву:");
        int max = array[0];
        for (int j : array) {
            if (max < j) max = j;
        }
        System.out.print(max);
    }

    public void evenInx() {
        System.out.println("\n" + "9. Вивести суму значень всіх парних індексів:");
        int sumEven = 0;
        for (int i = 0; i < array.length; i += 2) {
            sumEven += array[i];
        }
        System.out.print(sumEven);
    }

    public void symbol() {
        System.out.println("\n" + "10. Вивести перших 20 символів з таблиці ASCI:");
        for (char c = 32; c < 52; c++) {
            System.out.print(c + " ");
        }
    }
}
