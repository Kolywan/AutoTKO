package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_tko_14 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	// tko-14 : Отклонение заявки на недвижимость

	
	public void smoke1() throws Exception {

		app.tko_14().RejectRequest();


	}


}
