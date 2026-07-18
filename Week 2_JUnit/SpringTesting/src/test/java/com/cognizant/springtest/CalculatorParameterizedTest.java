package com.cognizant.springtest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorParameterizedTest {

    CalculatorService service = new CalculatorService();

    @ParameterizedTest
    @CsvSource({
            "1,2,3",
            "10,20,30",
            "5,5,10",
            "100,200,300"
    })

    void testAdd(int a, int b, int result) {

        assertEquals(result, service.add(a, b));

    }
}