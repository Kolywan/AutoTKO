package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_tko_11 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	// tko-11 : Добавление нового адреса контейнерной площадки

	
	public void smoke1() throws Exception {

		app.tko_11().AddProperty();


	}


}
