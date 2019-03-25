package com.training.java;

import com.training.java.exceptions.InvalidFieldnameException;

public class ComplexExercises {

    private Repository repository;
    private Operation operation;

    public ComplexExercises(Repository repository, Operation operation) {
        this.repository = repository;
        this.operation = operation;
    }

    public int multiplyFromRepo(String field1, String field2, String resultField) throws InvalidFieldnameException {
        if (field1 == null || field1.trim().isEmpty())
            throw new InvalidFieldnameException("The name of the product 1 cannot be empty");
        if (field2 == null || field2.trim().isEmpty())
            throw new InvalidFieldnameException("The name of the product 2 cannot be empty");
        if (resultField == null || resultField.trim().isEmpty())
            throw new InvalidFieldnameException("The name of the result cannot be empty");
        int fieldValue1 = repository.getIntField(field1);
        int fieldValue2 = repository.getIntField(field2);
        int result = operation.multiply(fieldValue1, fieldValue2);
        repository.storeIntField(resultField, result);
        return result;
    }
}
