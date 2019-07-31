package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_tko_23 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	//tko-23 : получение счета через Начисления 

	
	public void smoke1() throws Exception {

		app.tko_23().GetAccount();


	}


}
