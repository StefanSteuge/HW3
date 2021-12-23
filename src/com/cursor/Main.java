package com.cursor;

public class Main {

    public static void main(String[] args) {

        int[] arrayGeneral = new int[25];
        ArraysMethods array = new ArraysMethods(arrayGeneral);
        array.even();
        array.random();
        array.average();
        array.sum3();
        array.sumEven();
        array.sort();
        array.min();
        array.max();
        array.evenInx();
        array.symbol();

    }
}
