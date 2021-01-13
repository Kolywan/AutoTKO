package com.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class tko_98_DeleteAgent {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_98_DeleteAgent() {

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
		return $(By.xpath("//div[@class='v-table-cell-wrapper' or @class='v-captiontext']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement textNameAccount() {
		return $(By.xpath("//div[text()='Лицевой счет']/../../div[3]/div")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement exit() {
		return $(By.xpath("//div[@class='v-button v-widget c-logout-button v-button-c-logout-button icon v-button-icon v-button-empty-caption']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement maximizebox() {
		return $(By.xpath("//div[@class='v-window-maximizebox']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement searchAccount() {
		return $(By.xpath("//span[text()='Лицевой счет']/..")).waitUntil(visible,
				app.timeOut);
	}
	
	public SelenideElement buttonDeleteUser() {
		return $(By.xpath("//div[@class='c-pickerfield-layout v-layout v-widget v-has-width']/div[2]")).waitUntil(visible, app.timeOut);
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
// Авторизоваться под пользователем
		login().sendKeys("6783");
		
		password().sendKeys("6783");
		
		buttonGo().click();
		
// Двойным щелчком мыши заходим в контрагента (Открывается окно "Карточка л/с")
		agent().doubleClick();
		sleep(1000);

// Сохраняем данные лицевого счета
		String account = textNameAccount().getText();
		System.out.println(account);
		// Выходим из учетной записи пользователя (Открывается страница авторизации)
		exit().click();
		

// Авторизация под администратором
		login().sendKeys("d-150788@mail.ru");
		
		password().sendKeys("123456789");
		
		buttonGo().click();
		sleep(1000);

//Зайти в "Приложение" 
		menuApp().click();
		sleep(1000);
//Выбрать "Клиенты" 
		menuClient().click();
		sleep(1000);
//Выбрать "Контрагенты" 
		menuAgent().click();
		sleep(8000);
// Кликаем "Добавить условие поиска"
		searchCondition().click();
		sleep(1000);
// разворачиваем окно на весь экран
		maximizebox().click();
		sleep(1000);
		$(By.xpath("//input[@class='v-textfield v-widget v-has-width c-empty-value']")).sendKeys("Лицевой счет");
// Из предложенного списка двойным щелчком мыши выбираем "Лицевой счет"
		
		searchAccount().click();
		sleep(1000);
		searchAccount().doubleClick();
		sleep(1000);
// Вписываем условие поиска(Лицевой счет который был ранее сохранен)
		searchText().sendKeys(account);
		sleep(1000);
// Нажимаем кнопку "Поиск"
		searchButton().click();
		sleep(1000);
// Выбираем контрагента из списка двойным щелчком мыши
		$(By.xpath("//div[text()='"+ account +"']")).doubleClick();
		

//С правой стороны карточки л/с нажимем на меню "Пользователь"
		buttonDeleteUser().click();
		sleep(1000);
// Нажимаем кнопку "OK"
		buttonOk().click();
		
	}
	public void DeleteAgent() {
		
		app.tko_98().start();


	}

}
