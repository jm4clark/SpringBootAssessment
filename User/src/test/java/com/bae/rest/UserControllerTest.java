package com.bae.rest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.persistence.domain.User;
import com.bae.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
	@InjectMocks
	UserController controller;

	@Mock
	UserService service;

	private static final User MOCK_USER_1 = new User("James", 1337);
	private static final User MOCK_USER_2 = new User("Harry", 777);

	@Test
	public void getAllUsersTest() {
		List<User> MOCK_LIST = new ArrayList<>();
		MOCK_LIST.add(MOCK_USER_1);
		MOCK_LIST.add(MOCK_USER_2);

		Mockito.when(service.getAllUsers()).thenReturn(MOCK_LIST);
		assertEquals(MOCK_LIST, controller.getAllUsers());
		Mockito.verify(service).getAllUsers();
	}

	@Test
	public void getByIdTest() {
		List<User> MOCK_LIST = new ArrayList<>();
		MOCK_LIST.add(MOCK_USER_1);
		MOCK_LIST.add(MOCK_USER_2);

		Mockito.when(service.getById(MOCK_USER_1.getId())).thenReturn(MOCK_USER_1);
	}
}
