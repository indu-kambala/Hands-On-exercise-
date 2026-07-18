package com.cognizant.springtest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceExceptionTest {

    @Test
    void testException() {

        UserService service = new UserService();

        assertThrows(Exception.class, () -> {
            throw new Exception("User not found");
        });

    }
}