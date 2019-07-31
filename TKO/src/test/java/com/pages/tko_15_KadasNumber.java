package com.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class tko_15_KadasNumber {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_15_KadasNumber() {

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

	public SelenideElement menuON() {
		return $(By.xpath("//div[@class='v-menubar-submenu v-widget c-main-menu v-menubar-submenu-c-main-menu v-has-width']/span[2]")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement ON() {
		return $(By.xpath("//div[@class='v-menubar-submenu v-widget c-main-menu v-menubar-submenu-c-main-menu v-has-width v-menubar-submenu-has-icons']/span[1]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement N() {
		return $(By.xpath("//table[@class='v-table-table']/tbody/tr[15]/td[4]/div")).waitUntil(visible, app.timeOut);
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
//перейти "Объекты недвижимости" 
		menuON().click();
		sleep(1000);
//Выбрать "Объекты недвижимости" 
		ON().click();
//Выбираем адрес из списка двойным щелчком мыши		
		sleep(5000);
	}
//Сохраняем содержимое строки
	public String KadasN() {
		String number = N().getText();
		System.out.println(number);
		return number;
	}

	public void KadasNumber() {
		
		app.tko_15().start();
		app.tko_15().selectAgent();
		app.tko_15().KadasN();
	

	}

}
