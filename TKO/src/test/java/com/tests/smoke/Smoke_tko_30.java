package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_tko_30 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	//tko-30 : Счета арендаторам

	
	public void smoke1() throws Exception {

		app.tko_30().AccountRent();


	}


}
