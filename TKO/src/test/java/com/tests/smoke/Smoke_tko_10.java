package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_tko_10 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	// tko-10 : Добавление контейнерной площадки

	
	public void smoke1() throws Exception {
		app.tko_96().addONWithoutCheckingAdmin();
		app.tko_10().AddProperty();


	}


}
