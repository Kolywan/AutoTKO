package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_tko_4 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	// tko-4 : Добавление документов на недвижимость для контрагента

	
	public void smoke1() throws Exception {

		app.tko_4().AddProperty();


	}


}
