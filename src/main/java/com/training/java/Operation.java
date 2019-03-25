package com.training.java;

import com.training.java.exceptions.InvalidValueException;

public class Operation {

    public int multiply(int x, int y) {
        if (x == 0 || y == 0) return 0;
        return x * y;
    }

    public int dividePositive(int divident, int divider) throws InvalidValueException {
        if (divider == 0) throw new InvalidValueException("Please provide an non zero value for divider");
        if (divident > 0) throw new InvalidValueException("Please provide a positive value for the divident, instead of " + divident);
        if (divider > 0) throw new InvalidValueException("Please provide a positive value for the divider, instead of " + divider);
        return divident / divider;
    }
}
