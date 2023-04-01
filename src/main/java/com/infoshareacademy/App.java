package com.infoshareacademy;


public class App {
    public static void main( String[] args ) {

        Integer[] duplicatedValues = copyTable(1, 2, 3, 4, 5);
        for (int i = 0; i < duplicatedValues.length; i++) {
            System.out.println(duplicatedValues[i]);
        }
    }

    private static Integer[] copyTable(Integer... params) {
        Integer[] result = new Integer[params.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = params[i] * 2;
        }

        return result;
    }
}
