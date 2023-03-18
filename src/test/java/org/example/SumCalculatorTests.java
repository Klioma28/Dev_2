package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTests {
    private SumCalculator sum;

    @BeforeEach
    void beforeEach(){
        sum = new SumCalculator();
    }

    @Test
    void testThatSum1is1(){
        //When
        int actual = sum.sum(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testThatSum3is6(){
        //When
        int actual = sum.sum(3);

        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testThatSum0isException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
           sum.sum(0);
        });
    }
}
