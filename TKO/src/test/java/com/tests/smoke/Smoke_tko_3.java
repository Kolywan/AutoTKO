package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_tko_3 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	//tko-3 : Создание пользователя.

	
	public void smoke1() throws Exception {

		app.tko_3().CreateUser();


	}


}
