package com.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class tko_2_UserAndAgent {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_2_UserAndAgent() {

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
	public SelenideElement agent() {
		return $(By.xpath("//table[@class='v-table-table']/tbody/tr[15]")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement menuUser() {
		return $(By.xpath("//div[@class='c-pickerfield-layout v-layout v-widget v-has-width']/div")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement searchCondition() {
		return $(By.xpath("//div[@class='v-slot v-slot-link v-align-middle']")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement searchLogin() {
		return $(By.xpath("//div[@class='v-tree-node-caption']//span[text()='Логин']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement searchText() {
		return $(By.xpath("//div[@class='v-slot v-slot-param-field']/input")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement searchButton() {
		return $(By.xpath("//div[@class='v-button v-widget filter-search-button v-button-filter-search-button icon v-button-icon']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement user() {
		return $(By.xpath("//div[@class='v-table-cell-wrapper' and text()='6783']")).waitUntil(visible, app.timeOut);
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
//Выбрать контрагента из предложенных вариантов двойным щелчком мыши
		agent().doubleClick();
		sleep(3000);
	}

	public void selectUser() {

//С правой стороны карточки л/с нажимем на меню "Пользователь"
		menuUser().click();
		sleep(1500);
//Добавляем условие поиска
		searchCondition().click();
		sleep(1000);
//Из предложенного списка двойным щелчком мыши выбираем "Логин"
		searchLogin().doubleClick();
		sleep(1000);
//Вписываем условие поиска
		searchText().sendKeys("6783");
		sleep(1000);
//Нажимаем кнопку "Поиск"
		searchButton().click();
		sleep(1000);
//Двойным щелчком выбираем найденного пользователя
		user().doubleClick();
		sleep(1000);
//Нажимаем кнопку "OK"
		buttonOk().click();
		sleep(3000);
	}
	public void AddUserAgent() {
		
		app.tko_2().start();
		app.tko_2().selectAgent();
		app.tko_2().selectUser();

	}

}
