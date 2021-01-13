package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_tko_37 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	//Добавление ОН c несколькими категориями объекта без проверки админом

	
	public void smoke1() throws Exception {

		app.tko_37().addONMultAdmin();


	}


}
