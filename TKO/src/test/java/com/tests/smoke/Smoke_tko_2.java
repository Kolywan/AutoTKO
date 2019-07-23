package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_tko_2 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	//tko-2 : Привязка пользователя к контрагенту

	
	public void smoke1() throws Exception {

		app.tko_2().AddUserAgent();


	}


}
