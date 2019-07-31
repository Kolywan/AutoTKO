package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_tko_99 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	//Привязка пользователя к контрагенту c ПНООЛР

	
	public void smoke1() throws Exception {

		app.tko_99().AddUserAgentPNOOLR();


	}


}
