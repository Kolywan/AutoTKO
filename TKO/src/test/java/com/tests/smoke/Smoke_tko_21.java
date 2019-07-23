package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_tko_21 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	//tko-21 : Отклонение заявки на изменение сведений объекта недвижимости

	
	public void smoke1() throws Exception {

		app.tko_21().RejectInformation();


	}


}
