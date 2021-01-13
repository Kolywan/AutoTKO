package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_tko_96 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	//Добавление ОН без проверки админом

	
	public void smoke1() throws Exception {

		app.tko_96().addONWithoutCheckingAdmin();


	}


}
