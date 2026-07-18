package com.cognizant.springtest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GlobalExceptionHandlerTest {

    @Test
    void testHandler() {

        GlobalExceptionHandler handler = new GlobalExceptionHandler();

        assertNotNull(handler);

    }
}