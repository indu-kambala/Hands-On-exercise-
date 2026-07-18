package com.cognizant.springtest;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Mock
    UserRepository repository;

    @InjectMocks
    UserService service;

    public UserServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetUser() {

        User user = new User(1L,"Indu");

        when(repository.findById(1L))
                .thenReturn(Optional.of(user));

        assertEquals("Indu",service.getUserById(1L).getName());

    }

}