package com.training.java;

import com.training.java.exceptions.InvalidFieldnameException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ComplexExercisesTest {

    @Mock
    private Repository repo;
    @Mock
    private Operation operation;
    @InjectMocks
    private ComplexExercises complexExercises;

    @Test
    public void testMultipleFromRepo_WhenRepoFindsBothValues_AndMultiplyReturnsValue_AndStoreIsSuccessful_ShouldReturnResultFromMultiply() throws InvalidFieldnameException {
        when(repo.getIntField(any(String.class))).thenReturn(1);
        when(operation.multiply(1, 1)).thenReturn(4);
        doNothing().when(repo).storeIntField("result", 4);

        int result = complexExercises.multiplyFromRepo("field1", "field2", "result");
        assertEquals(4, result);

        verify(repo, times(2)).getIntField(any(String.class));

    }
}
