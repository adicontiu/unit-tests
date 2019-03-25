package com.training.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationMultiplyTest {

    @Test
    public void testMultiply_WhenProductOneIsZero_ShouldReturnZero() {
        assertEquals(0, new Operation().multiply(0, 12));
    }

    @Test
    public void testMultiply_WhenProductTwoIsZero_ShouldReturnZero() {
        assertEquals(0, new Operation().multiply(12, 0));
    }

    @Test
    public void testMultiply_WhenBothProductsArePositive_ShouldReturnCorrectResult() {
        assertEquals(144, new Operation().multiply(12, 12));
    }

    @Test
    public void testMultiply_WhenBothProductsAreNegative_ShouldReturnZero() {
        assertEquals(144, new Operation().multiply(-12, -12));
    }

}
