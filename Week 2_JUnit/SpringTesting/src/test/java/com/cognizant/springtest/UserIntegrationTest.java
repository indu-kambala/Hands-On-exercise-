package com.cognizant.springtest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserIntegrationTest {

    @Autowired
    private UserService service;

    @Test
    void testSaveUser() {
        User user = new User(1L, "Indu");
        User saved = service.saveUser(user);
        assertEquals("Indu", saved.getName());
    }
}