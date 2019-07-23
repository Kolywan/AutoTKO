package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_tko_13 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	// tko-13 : Принятие заявки на недвижимость

	
	public void smoke1() throws Exception {

		app.tko_13().ApproveRequest();


	}


}
