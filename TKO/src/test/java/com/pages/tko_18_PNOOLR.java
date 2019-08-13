package com.pages;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class tko_18_PNOOLR {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_18_PNOOLR() {

		app = new ApplicationManager();
	}


	public SelenideElement login() {
		return $(By.xpath("//input[@placeholder='Логин']")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement password() {
		return $(By.xpath("//input[@placeholder='Пароль']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonGo() {
		return $(By.xpath("//div[@class='v-button v-widget c-login-submit-button v-button-c-login-submit-button icon v-button-icon']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement agent() {
		return $(By.xpath("//div[@class='v-table-cell-wrapper' or @class='v-captiontext']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement menuPNOOLR() {
		return $(By.xpath("//div[text()='ПНООЛР']")).waitUntil(visible, app.timeOut);
	}
	

	public SelenideElement buttonСreate() {
		return $(By.xpath("//div[@class='v-button v-widget primary v-button-primary icon v-button-icon c-primary-action v-button-c-primary-action']")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement textBoxDateTo() {
		return $(By.xpath("//input[@class='v-textfield v-datefield-textfield c-maskedfield-empty']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement textBoxMassa() {
		return $(By.xpath("//input[@class='v-textfield v-widget v-has-width c-empty-value']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonEditON() {
		return $(By.xpath("//span[text()='Редактировать объекты недвижимости']/../..")).waitUntil(visible, app.timeOut);
	}


	public SelenideElement checkBox() {
		return $(By.xpath("//span[@class='v-grid-selection-checkbox']/..")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonSelect() {
		return $(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonOkPNOOLR() {
		return $(By.xpath("//span[text()='OK']/../..")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement menuMyRequest() {
		return $(By.xpath("//div[@class='v-captiontext' and text()='Мои заявки']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement MyRequest() {
		return $(By.xpath("//table[@class='v-table-table']/tbody/tr")).waitUntil(visible, app.timeOut);
	}


	public SelenideElement requestСhange() {
		return $(By.xpath("//div[@class='v-menubar v-widget c-main-menu v-menubar-c-main-menu v-has-width']/span[4]")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement CheckingOfUnits() {
		return $(By.xpath("//div[text()='ПНООЛР']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement selectRequest() {
		return $(By.xpath("//table[@class='v-table-table']//tr/td[3]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonApprove() {
		return $(By.xpath("//div[@class='v-button v-widget friendly v-button-friendly icon v-button-icon']")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement textBoxComment() {
		return $(By.xpath("//div[@class='c-resizabletextarea-wrapper v-widget v-has-width v-has-height']/textarea")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement buttonOkComment() {
		return $(By.xpath("//div[@class='v-csslayout v-layout v-widget c-flowlayout v-csslayout-c-flowlayout v-has-width v-csslayout-spacing']/div")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement buttonOkRequest() {
		return $(By.xpath("//div[@class='v-button v-widget icon v-button-icon c-primary-action v-button-c-primary-action']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement menuAccepted() {
		return $(By.xpath("//div[text()='Принято']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement choiceRuquest() {
		return $(By.xpath("(//div[@class='v-table-cell-wrapper'])[5]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement exit() {
		return $(By.xpath("//div[@class='v-button v-widget c-logout-button v-button-c-logout-button icon v-button-icon v-button-empty-caption']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonOk() {
		return $(By.xpath("//div[@class='v-button v-widget icon v-button-icon c-primary-action v-button-c-primary-action']")).waitUntil(visible, app.timeOut);
	}
	
	




	public void startUser() {

//Авторизоваться под пользователем
		login().sendKeys("6783");
		sleep(1000);
		password().sendKeys("6783");
		sleep(1000);
		buttonGo().click();
		sleep(1500);

	}
	public void selectAgent() {

//Двойным щелчком мыши заходим в контрагента (Открывается окно "Карточка л/с")
		agent().doubleClick();
		sleep(1000);
//Переходим на вкладку " ПНООЛР "
		menuPNOOLR().click();
		sleep(1000);
//Кликнуть "Создать"(Открывается окно” Редактор ПНООЛР”)
		buttonСreate().click();
		sleep(1000);
	}
	// Загрузка файла
	public SelenideElement file() {
		File file = new File("");
		String fileName="\\files\\NDFL.jpg";
		
		SelenideElement locator = $(By.xpath("//*[@name='files[]']")).waitUntil(exist, app.timeOut);
		locator.uploadFile(new File(file.getAbsolutePath()+fileName));
		return locator;

	}
	public void editPNOOLR() {
//Заполняем поле” Срок действия по”
		textBoxDateTo().sendKeys("01012020");
		sleep(1000);

//Заполняем поле “Вес отходов в год”
		textBoxMassa().sendKeys("150");
		textBoxMassa().sendKeys(Keys.ENTER);
		
//Загружаем файл
		file();		
//Кликнуть "редактировать объекты недвижимости"(Открывается окно "Объекты недвижимости контрагента")
		buttonEditON().click();
		sleep(1000);
//Ставим чек в чекбоксе адреса, который будут покрыты ПНООЛР
		checkBox().click();
		sleep(1000);
//Кликаем “Выбрать” (В окне редактор ПНООЛР появились объекты недвижимости, которые выбрали)
		buttonSelect().click();
		sleep(1000);
//Кликаем ОК (В окне "карточка л/с" на вкладке "ПНООЛР" появилась запись со статусом на проверке)
		buttonOkPNOOLR().click();
		sleep(1000);

//Переходим на вкладку "Мои заявки" (Отображаются заявки, отправленные на обработку)
		menuMyRequest().click();
//Выбираем заявку, отправленную на обработку
		MyRequest().click();
		sleep(6000);
		
}
	
	
	public void PNOOLR() {
		
		app.tko_18().startUser();
		app.tko_18().selectAgent();
		app.tko_18().editPNOOLR();

		
		


	}

}
