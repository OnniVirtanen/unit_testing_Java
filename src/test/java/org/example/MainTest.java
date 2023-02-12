package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    int[] numbers = {5,2,6,9,31,15,12,0,31,3};
    int[] numbers2 = {7,2,9,41,55,42,1,5,100,103,24,0,0};
    int[] numbers3 = {100, 20, 40};
    int[] numbers4 = {3,2,1,0};

    @Test
    void maxInt() {
        assertAll(() -> assertEquals(31, Main.maxInt(numbers)),
                () -> assertEquals(103, Main.maxInt(numbers2)),
                () -> assertEquals(100, Main.maxInt(numbers3)),
                () -> assertEquals(3, Main.maxInt(numbers4)));
    }

    @Test
    void sumArray() {
        assertAll(() -> assertEquals(114, Main.sumArray(numbers)),
                () -> assertEquals(389, Main.sumArray(numbers2)),
                () -> assertEquals(160, Main.sumArray(numbers3)),
                () -> assertEquals(6, Main.sumArray(numbers4)));
    }

    @Test
    void zerosInArray() {
        assertAll(() -> assertEquals(1, Main.zerosInArray(numbers)),
                () -> assertEquals(2, Main.zerosInArray(numbers2)),
                () -> assertEquals(0, Main.zerosInArray(numbers3)),
                () -> assertEquals(1, Main.zerosInArray(numbers4)));
    }

    @Test
    void anyZerosInArray() {
        assertAll(() -> assertEquals(true, Main.anyZerosInArray(numbers)),
                () -> assertEquals(true, Main.anyZerosInArray(numbers2)),
                () -> assertEquals(false, Main.anyZerosInArray(numbers3)),
                () -> assertEquals(true, Main.anyZerosInArray(numbers4)));
    }

    @Test
    void containTwoEqualInt() {
        assertAll(() -> assertEquals(true, Main.containTwoEqualInt(numbers)),
                () -> assertEquals(true, Main.containTwoEqualInt(numbers2)),
                () -> assertEquals(false, Main.containTwoEqualInt(numbers3)),
                () -> assertEquals(false, Main.containTwoEqualInt(numbers4)));
    }
}