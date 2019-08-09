package com.bae.rest;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.service.CoreService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoreControllerTest {
	@InjectMocks
	CoreController controller;

	@Mock
	CoreService service;

}
