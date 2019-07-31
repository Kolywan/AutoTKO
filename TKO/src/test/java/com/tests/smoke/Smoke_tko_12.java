package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_tko_12 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	// tko-12 : Удаление контейнерной площадки

	
	public void smoke1() throws Exception {

		app.tko_12().DeleteContainerAddress();


	}


}
