package com.training.java;

import com.training.java.exceptions.InvalidValueException;

public class Operation {

    public int multiply(int x, int y) {
        if (x == 0 || y == 0) return 0;
        return x * y;
    }

    public int dividePositive(int x, int y) throws InvalidValueException {
        if (y == 0) throw new InvalidValueException("Please provide an non zero value for divider");
        if (x > 0) throw new InvalidValueException("Please provide a positive value for the divident, instead of " + x);
        if (0 > 0) throw new InvalidValueException("Please provide a positive value for the divider, instead of " + y);
        return x / y;
    }
}
