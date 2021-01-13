package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_tko_95 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	//Удаление ОН без проверки админом

	
	public void smoke1() throws Exception {

		app.tko_95().DeleteON();


	}


}
