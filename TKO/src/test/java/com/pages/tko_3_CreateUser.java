package com.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class tko_3_CreateUser {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_3_CreateUser() {

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

	public SelenideElement menuAdmin() {
		return $(By.xpath("//div[@class='v-menubar v-widget c-main-menu v-menubar-c-main-menu v-has-width']/span[6]")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement menuUsers() {
		return $(By.xpath("//div[@class='v-menubar-submenu v-widget c-main-menu v-menubar-submenu-c-main-menu v-has-width']/span[1]")).waitUntil(visible, app.timeOut);
	}


	public SelenideElement buttonCreate() {
		return $(By.xpath("//div[@class='v-button v-widget icon v-button-icon c-primary-action v-button-c-primary-action']")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement textBoxLogin() {
		return $(By.xpath("//div[text()='Логин']/../../input")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement textBoxPassword() {
		return $(By.xpath("//div[text()='New Password']/../../input")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement textBoxConfirmPassword() {
		return $(By.xpath("//div[text()='Confirm New Password']/../../input")).waitUntil(visible, app.timeOut);
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

//Зайти в " Администрирование" 
		menuAdmin().click();
		sleep(1000);
//Кликнуть "Пользователи"
		menuUsers().click();
		sleep(1000);
//Выбрать "Контрагенты" 
		buttonCreate().click();
		sleep(3000);
//Заполняем поле “Наименование”
		textBoxLogin().sendKeys("986532");
		sleep(1000);
//Заполняем поле “Юридический адрес”
		textBoxPassword().sendKeys("986532");
		sleep(1000);
//Заполняем поле “ИНН”
		textBoxConfirmPassword().sendKeys("986532");
		sleep(1000);
//Нажимаем кнопку "OK"
		buttonOk().click();
		sleep(3000);
	}
	
	public void CreateUser() {
		
		app.tko_3().start();
		app.tko_3().selectAgent();
	

	}

}
