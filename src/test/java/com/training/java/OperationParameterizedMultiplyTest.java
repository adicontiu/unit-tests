package com.training.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class OperationParameterizedMultiplyTest {

    @Parameterized.Parameter(0)
    public int result;

    @Parameterized.Parameter(1)
    public int product1;

    @Parameterized.Parameter(2)
    public int product2;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{0, 0, 12},
                {0, 12, 0}};
        return Arrays.asList(data);
    }

    @Test
    public void testMultiply() {
        assertEquals(result, new Operation().multiply(product1, product2));
    }
}
