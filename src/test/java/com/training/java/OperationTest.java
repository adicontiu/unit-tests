package com.training.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationTest {

    @Test
    public void testMultiply_WhenXIsZero_ShouldReturnZero() {
        assertEquals(0, new Operation().multiply(0, 12));
    }
}
