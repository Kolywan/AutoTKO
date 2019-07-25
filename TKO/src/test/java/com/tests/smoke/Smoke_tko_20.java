package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_tko_20 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	// tko-20 : Принятие заявки на исключение объекта недвижимости

	
	public void smoke1() throws Exception {

		app.tko_20().DeleteON();


	}


}
