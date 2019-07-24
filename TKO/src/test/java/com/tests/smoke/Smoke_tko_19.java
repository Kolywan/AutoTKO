package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_tko_19 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	// tko-16 : Принятие заявки на изменение сведений объекта недвижимости

	
	public void smoke1() throws Exception {

		app.tko_19().AddPNOOLR();


	}


}
