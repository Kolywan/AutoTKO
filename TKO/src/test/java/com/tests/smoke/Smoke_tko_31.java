package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_tko_31 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	//tko-31 : Заявка на вывоз ТКО

	
	public void smoke1() throws Exception {

		app.tko_31().ExportApplication();


	}


}
