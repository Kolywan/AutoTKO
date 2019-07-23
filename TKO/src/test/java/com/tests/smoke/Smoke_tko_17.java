package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_tko_17 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	// tko-17 : Внесение изменений об арендаторе 

	
	public void smoke1() throws Exception {

		app.tko_17().AddProperty();


	}


}
