package com.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class tko_1_CreateAgent {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_1_CreateAgent() {

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

	public SelenideElement menuApp() {
		return $(By.xpath("//div[@class='v-menubar v-widget c-main-menu v-menubar-c-main-menu v-has-width']/span[3]")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement menuClient() {
		return $(By.xpath("//div[@class='v-menubar-submenu v-widget c-main-menu v-menubar-submenu-c-main-menu v-has-width']/span[1]")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement menuAgent() {
		return $(By.xpath("//div[@class='v-menubar-submenu v-widget c-main-menu v-menubar-submenu-c-main-menu v-has-width v-menubar-submenu-has-icons']/span[1]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonCreate() {
		return $(By.xpath("//div[@class='v-button v-widget icon v-button-icon c-primary-action v-button-c-primary-action']")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement menuType() {
		return $(By.xpath("//div[@class='v-filterselect-button']")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement selectType() {
		return $(By.xpath("//td[@class='gwt-MenuItem']")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement textBoxName() {
		return $(By.xpath("//div[text()='Наименование']/../../input")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement textBoxINN() {
		return $(By.xpath("//div[text()='ИНН']/../../input")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement textBoxAddress() {
		return $(By.xpath("//div[text()='Юридический адрес']/../../div/textarea")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonOk() {
		return $(By.xpath("//div[@class='v-button v-widget icon v-button-icon c-primary-action v-button-c-primary-action']")).waitUntil(visible, app.timeOut);
	}
	
	
	public void start() {
// Авторизация под администратором
		login().sendKeys("testadmin");
		sleep(1000);
		password().sendKeys("1");
		sleep(1000);
		buttonGo().click();
		sleep(1500);

	}
	public void selectAgent() {

//Зайти в "Приложение" 
		menuApp().click();
		sleep(1000);
//Выбрать "Клиенты" 
		menuClient().click();
		sleep(1000);
//Выбрать "Контрагенты" 
		menuAgent().click();
		sleep(5000);
//Кликаем “Создать” (Откроется окно "Карточка л/с")
		buttonCreate().doubleClick();
		sleep(3000);
	}

	public void selectUser() {

//Открываем меню контрагента
		menuType().click();
		sleep(1500);
//Выбираем тип “Контрагента”
		selectType().click();
		sleep(1000);
//Заполняем поле “Наименование”
		textBoxName().sendKeys("ИП СтройМАШсервис");
		sleep(1000);
//Заполняем поле “Юридический адрес”
		textBoxAddress().sendKeys("Иркутская обл, г Иркутск");
		sleep(1000);
//Заполняем поле “ИНН”
		textBoxINN().sendKeys("381909999999");
		sleep(1000);
//Нажимаем кнопку "OK"
		buttonOk().click();
		sleep(3000);
	}
	public void CreateAgent() {
		
		app.tko_1().start();
		app.tko_1().selectAgent();
		app.tko_1().selectUser();

	}

}
