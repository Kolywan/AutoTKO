package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_tko_18 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	// tko-18 : ПНООЛР

	
	public void smoke1() throws Exception {

		app.tko_18().PNOOLR();


	}


}
