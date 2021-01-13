package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_tko_33 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	//tko-33 : Добавление объекта недвижимости «Нежилые»

	
	public void smoke1() throws Exception {

		app.tko_33().addON();


	}


}
