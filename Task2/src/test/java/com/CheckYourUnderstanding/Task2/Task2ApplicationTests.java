package com.CheckYourUnderstanding.Task2;

import com.CheckYourUnderstanding.Task2.ropsitory.UserRepositry;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class Task2ApplicationTests {

	@MockBean
	private UserRepositry userRepositry;

	@Autowired
	private UserRepositry

	@Test
	public void whenUserPassIsLargerThan8Digits_isSuccess() {
	}

}
