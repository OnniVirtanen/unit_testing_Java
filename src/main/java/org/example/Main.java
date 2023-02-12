package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5,2,6,9,31,15,12,0,31,3};

        System.out.printf("maxInt: %d%n", maxInt(numbers));
        System.out.printf("sumArray: %d%n", sumArray(numbers));
        System.out.printf("zerosInArray: %d%n", zerosInArray(numbers));
        System.out.printf("anyZerosInArray: %b%n", anyZerosInArray(numbers));
        System.out.printf("containTwoEqualInt: %b%n", containTwoEqualInt(numbers));
    }

    public static int maxInt(int[] array) {
        int largestNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largestNumber)
                largestNumber = array[i];
        }
        return largestNumber;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int zerosInArray(int[] array) {
        int numOfZeros = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) numOfZeros++;
        }
        return numOfZeros;
    }

    public static boolean anyZerosInArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean containTwoEqualInt(int[] array) {
        boolean sameItem = false;
        outerLoop:
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        sameItem = true;
                        break outerLoop;
                    }
                }
            }
        return sameItem;
    }
}