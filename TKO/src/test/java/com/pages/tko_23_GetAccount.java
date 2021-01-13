package com.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class tko_23_GetAccount {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_23_GetAccount() {

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

	public SelenideElement menuСustomer() {
		return $(By.xpath("//div[@class='v-menubar-submenu v-widget c-main-menu v-menubar-submenu-c-main-menu v-has-width']/span")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement personalAccounts() {
		return $(By.xpath("//div[@class='v-menubar-submenu v-widget c-main-menu v-menubar-submenu-c-main-menu v-has-width v-menubar-submenu-has-icons']/span[2]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement agent() {
		return $(By.xpath("//div[text()='ИП Жданова Елена Васильевна']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement accounts() {
		return $(By.xpath("//div[text()='Счета']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement selectDate() {
		return $(By.xpath("//div[@class='c-grouptable-group-cell-expander']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement textAccount() {
		return $(By.xpath("//tr[@class='v-table-row-odd']/td[3]/div")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement menuAccrual() {
		return $(By.xpath("//div[@class='v-menubar-submenu v-widget c-main-menu v-menubar-submenu-c-main-menu v-has-width v-menubar-submenu-has-icons']/span[3]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement searchCondition() {
		return $(By.xpath("//div[@class='v-slot v-slot-link v-align-middle']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement searchAccount() {
		return $(By.xpath("//div[@class='v-tree-node-caption']//span[text()='Наименование']")).waitUntil(visible, app.timeOut);
	}	
	public SelenideElement searchAccount2() {
		return $(By.xpath("//div[@class='v-tree-node-caption']//span[text()='Номер счета']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement searchText() {
		return $(By.xpath("//div[@class='v-slot v-slot-param-field']/input")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement searchButton() {
		return $(By.xpath("//div[@class='v-button v-widget filter-search-button v-button-filter-search-button icon v-button-icon']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement select() {
		return $(By.xpath("//table[@class='v-table-table']//tr/td[4]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonExcel() {
		return $(By.xpath("//span[text()='Excel']/../..")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement maximizebox() {
		return $(By.xpath("//div[@class='v-window-maximizebox']")).waitUntil(visible, app.timeOut);
	}	
	public SelenideElement selectAllLine() {
		return $(By.xpath("//span[text()='Все строки']/../..")).waitUntil(visible, app.timeOut);
	}
	public void start() {
// Авторизация под администратором
		login().sendKeys("d-150788@mail.ru");
		sleep(1000);
		password().sendKeys("123456789");
		sleep(1000);
		buttonGo().click();
		sleep(1500);

	}
	public void selectAgent() {

//Зайти в "Приложение" 
		menuApp().click();
		sleep(1000);
//перейти "Клиенты" 
		menuСustomer().click();
		sleep(1000);
//Выбрать "Лицевые счета" 
		personalAccounts().click();
		sleep(5000);
//Кликаем "Добавить условие поиска"
		searchCondition().click();
		sleep(1000);
//разворачиваем окно на весь экран
		maximizebox().click();
		sleep(1000);
//Из предложенного списка двойным щелчком мыши выбираем "Наименование"
		searchAccount().doubleClick();
		sleep(1000);
//Вписываем условие поиска, контрагента с имеющимися ОН
		searchText().sendKeys("ИП Жданова Елена Васильевна");
		sleep(1000);
//Нажимаем кнопку "Поиск"
		searchButton().click();
		sleep(4000);

//Выбираем контрагента из списка двойным щелчком мыши
		agent().doubleClick();
		sleep(1000);
//Открыть вкладку счета
		accounts().click();
		sleep(1000);		
//Переходим в меню периода, за которое хотим получить счет(Раскрывается дополнительное меню с данными за этот период)
		selectDate().click();
		sleep(1000);
//Сохраняем значение счета
		String textAcc = textAccount().getText(); 
		System.out.println(textAcc);

//Открываем меню "Приложение" 
		menuApp().click();
		sleep(1000);
//перейти "Клиенты" 
		menuСustomer().click();
		sleep(1000);
//перейти "Начисления"		
		menuAccrual().click();
		sleep(1000);
//Добавляем условие поиска
		searchCondition().click();
		sleep(1000);
//Из предложенного списка двойным щелчком мыши выбираем "Номер счета"
		searchAccount2().doubleClick();
		sleep(1000);
//Вписываем условие поиска
		searchText().sendKeys(textAcc);
		sleep(1000);
//Нажимаем кнопку "Поиск"
		searchButton().click();
		sleep(4000);
//Нажимаем на "Excel"(Появляется окно "Подтверждение")
		buttonExcel().click();
		sleep(4000);
//// Кликаем "Все строки" (Скачивается Excel файл)
//		selectAllLine().click();
//		sleep(2000);
		
	}


	public void GetAccount() {
		
		app.tko_23().start();
		app.tko_23().selectAgent();

	

	}

}
