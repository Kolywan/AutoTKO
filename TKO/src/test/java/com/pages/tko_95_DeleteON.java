package com.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class tko_95_DeleteON {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_95_DeleteON() {

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

	public SelenideElement menuAccount() {
		return $(By.xpath("//div[@class='v-menubar-submenu v-widget c-main-menu v-menubar-submenu-c-main-menu v-has-width v-menubar-submenu-has-icons']/span[2]")).waitUntil(visible, app.timeOut);
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
	
	public SelenideElement menuON() {
		return $(By.xpath("//div[text()='Объекты недвижимости']")).waitUntil(visible, app.timeOut);
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
	public SelenideElement selectON() {
		return $(By.xpath("//td[@class='v-grid-cell']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonDelete() {
		return $(By.xpath("//span[text()='Удалить']/../..")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonOkDelete() {
		return $(By.xpath("//span[text()='OK']/../..")).waitUntil(visible, app.timeOut);
	}
	
	public void start() {
// Авторизоваться под пользователем
		login().sendKeys("6783");
		sleep(1000);
		password().sendKeys("6783");
		sleep(1000);
		buttonGo().click();
		sleep(1500);
// Двойным щелчком мыши заходим в контрагента (Открывается окно "Карточка л/с")
		agent().doubleClick();
		sleep(1000);

// Сохраняем данные лицевого счета
		String account = textNameAccount().getText();
		System.out.println(account);
// Выходим из учетной записи пользователя (Открывается страница авторизации)
		exit().click();
		sleep(5000);

// Авторизация под администратором
		login().sendKeys("d-150788@mail.ru");
		sleep(1000);
		password().sendKeys("123456789");
		sleep(1000);
		buttonGo().click();
		sleep(1500);

//Зайти в "Приложение" 
		menuApp().click();
		sleep(1000);
//Выбрать "Клиенты" 
		menuClient().click();
		sleep(1000);
//Выбрать "Лицевые счета" 
		menuAccount().click();
		sleep(5000);
// Кликаем "Добавить условие поиска"
		searchCondition().click();
		sleep(1000);
// разворачиваем окно на весь экран
		maximizebox().click();
		sleep(1000);
		$(By.xpath("//input[@class='v-textfield v-widget v-has-width c-empty-value']")).sendKeys("Лицевой счет");
// Из предложенного списка двойным щелчком мыши выбираем "Лицевой счет"
		sleep(1000);
		searchAccount().click();
		sleep(1000);
		searchAccount().doubleClick();
		sleep(1000);
// Вписываем условие поиска(Лицевой счет который был ранее сохранен)
		searchText().sendKeys(account);
		sleep(1000);
// Нажимаем кнопку "Поиск"
		searchButton().click();
		sleep(4000);
// Выбираем контрагента из списка двойным щелчком мыши
		$(By.xpath("//div[text()='"+ account +"']")).doubleClick();
		sleep(1000);

//Открываем вкладку ОН
		menuON().click();
		sleep(1500);
// Выбираем ОН
		selectON().click();
		sleep(1000);
//Кликаем "Удалить"
		buttonDelete().click();
		sleep(1000);
		buttonOkDelete().click();
		sleep(1000);
		// Выбираем ОН
				selectON().click();
				sleep(1000);
		//Кликаем "Удалить"
				buttonDelete().click();
				sleep(1000);
				buttonOkDelete().click();
				sleep(1000);
				// Выбираем ОН
				selectON().click();
				sleep(1000);
		//Кликаем "Удалить"
				buttonDelete().click();
				sleep(1000);
				buttonOkDelete().click();
				sleep(1000);
				// Выбираем ОН
				selectON().click();
				sleep(1000);
		//Кликаем "Удалить"
				buttonDelete().click();
				sleep(1000);
				buttonOkDelete().click();
				sleep(1000);
				// Выбираем ОН
				selectON().click();
				sleep(1000);
		//Кликаем "Удалить"
				buttonDelete().click();
				sleep(1000);
				buttonOkDelete().click();
				sleep(1000);
				// Выбираем ОН
				selectON().click();
				sleep(1000);
		//Кликаем "Удалить"
				buttonDelete().click();
				sleep(1000);
				buttonOkDelete().click();
				sleep(1000);
				// Выбираем ОН
				selectON().click();
				sleep(1000);
		//Кликаем "Удалить"
				buttonDelete().click();
				sleep(1000);
				buttonOkDelete().click();
				sleep(1000);
				// Выбираем ОН
				selectON().click();
				sleep(1000);
		//Кликаем "Удалить"
				buttonDelete().click();
				sleep(1000);
				buttonOkDelete().click();
				sleep(1000);
				// Выбираем ОН
				selectON().click();
				sleep(1000);
		//Кликаем "Удалить"
				buttonDelete().click();
				sleep(1000);
				buttonOkDelete().click();
				sleep(1000);
				// Выбираем ОН
				selectON().click();
				sleep(1000);
		//Кликаем "Удалить"
				buttonDelete().click();
				sleep(1000);
				buttonOkDelete().click();
				sleep(1000);
				// Выбираем ОН
				selectON().click();
				sleep(1000);
		//Кликаем "Удалить"
				buttonDelete().click();
				sleep(1000);
				buttonOkDelete().click();
				sleep(1000);
				// Выбираем ОН
				selectON().click();
				sleep(1000);
		//Кликаем "Удалить"
				buttonDelete().click();
				sleep(1000);
				buttonOkDelete().click();
				sleep(1000);
				// Выбираем ОН
				selectON().click();
				sleep(1000);
		//Кликаем "Удалить"
				buttonDelete().click();
				sleep(1000);
				buttonOkDelete().click();
				sleep(1000);
				// Выбираем ОН
				selectON().click();
				sleep(1000);
		//Кликаем "Удалить"
				buttonDelete().click();
				sleep(1000);
				buttonOkDelete().click();
				sleep(1000);
				// Выбираем ОН
				selectON().click();
				sleep(1000);
		//Кликаем "Удалить"
				buttonDelete().click();
				sleep(1000);
				buttonOkDelete().click();
				sleep(1000);
	}
	public void DeleteON() {
		
		app.tko_95().start();


	}

}
