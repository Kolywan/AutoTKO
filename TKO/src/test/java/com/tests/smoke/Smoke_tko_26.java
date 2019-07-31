package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_tko_26 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	//tko-26 : Отправка уведомлений выборочно

	
	public void smoke1() throws Exception {

		app.tko_26().SendSomeMassage();


	}


}
