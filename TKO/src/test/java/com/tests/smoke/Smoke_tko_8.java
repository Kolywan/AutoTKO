package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_tko_8 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	//  tko-8 : Заявка на исключение объекта недвижимости

	
	public void smoke1() throws Exception {
		app.tko_96().addONWithoutCheckingAdmin();
		app.tko_8().RequestDeleteON();


	}


}
