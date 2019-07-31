package com.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class tko_26_SendSomeMassage {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_26_SendSomeMassage() {

		app = new ApplicationManager();
	}

	public SelenideElement login() {
		return $(By.xpath("//input[@placeholder='Логин']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement password() {
		return $(By.xpath("//input[@placeholder='Пароль']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonGo() {
		return $(By.xpath(
				"//div[@class='v-button v-widget c-login-submit-button v-button-c-login-submit-button icon v-button-icon']"))
						.waitUntil(visible, app.timeOut);
	}

	public SelenideElement menuApp() {
		return $(By.xpath("//div[@class='v-menubar v-widget c-main-menu v-menubar-c-main-menu v-has-width']/span[3]"))
				.waitUntil(visible, app.timeOut);
	}

	public SelenideElement spam() {
		return $(By.xpath(
				"//div[@class='v-menubar-submenu v-widget c-main-menu v-menubar-submenu-c-main-menu v-has-width']//span[text()='Рассылка уведомлений']"))
						.waitUntil(visible, app.timeOut);
	}

	public SelenideElement checkboxImportant() {
		return $(By.xpath("//div[text()='Важное']/../../span/input")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement checkboxAllUsers() {
		return $(By.xpath("//label[text()='Все пользователи']/../../span/input")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement textBoxTeam() {
		return $(By.xpath(
				"//input[@class='v-textfield v-widget v-textfield-error v-textfield-error-error v-textfield-required v-required v-has-width c-empty-value']"))
						.waitUntil(visible, app.timeOut);
	}

	public SelenideElement textBoxVisualEditor() {
		return $(By.xpath("//iframe[@class='gwt-RichTextArea']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement menuRecipients() {
		return $(By.xpath("//div[text()='Получатели']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement ButtonAdd() {
		return $(By.xpath("//span[text()='Добавить']/../..")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement menuTemplate() {
		return $(By.xpath("//div[text()='Шаблоны']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement selectTextTemplate() {
		return $(By.xpath("//span[text()='Новость о снижении нормативов ТКО']/../../..//div")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonСhoose() {
		return $(By.xpath("//span[text()='Выбрать']/../..")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonYes() {
		return $(By.xpath("//span[text()='Да']/../..")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonSend() {
		return $(By.xpath("//span[text()='Отправить']/../..")).waitUntil(visible, app.timeOut);
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
		return $(By.xpath(
				"//div[@class='v-button v-widget filter-search-button v-button-filter-search-button icon v-button-icon']"))
						.waitUntil(visible, app.timeOut);
	}

	public SelenideElement user() {
		return $(By.xpath("//div[@class='v-table-cell-wrapper' and text()='6783']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement exit() {
		return $(By.xpath("//div[@class='v-button v-widget c-logout-button v-button-c-logout-button icon v-button-icon v-button-empty-caption']")).waitUntil(visible, app.timeOut);
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
//Выбрать "Рассылка уведомлений" 
		spam().click();
		sleep(1000);
//Cтавим галочку - важное
		checkboxImportant().sendKeys(Keys.SPACE);
		sleep(1000);
//Указать тему
		textBoxTeam().sendKeys("Важное");
		sleep(1000);
	}

	public void selectUser() {

//В "Визуальном редакторе" написать сообщение
		textBoxVisualEditor().sendKeys("Важное");
		sleep(1000);
//Перейти на вкладку "Получатели"
		menuRecipients().click();
		sleep(1000);
// Убираем галочку "все пользователи"
		checkboxAllUsers().sendKeys(Keys.SPACE);
		sleep(1000);
// Кликаем "Добавить"
		ButtonAdd().click();
		sleep(1000);
// Добавляем условие поиска
		searchCondition().click();
		sleep(1000);
// Из предложенного списка двойным щелчком мыши выбираем "Логин"
		searchLogin().doubleClick();
		sleep(1000);
// Вписываем условие поиска
		searchText().sendKeys("6783");
		sleep(1000);
// Нажимаем кнопку "Поиск"
		searchButton().click();
		sleep(1000);
// Двойным щелчком выбираем найденного пользователя
		user().doubleClick();
		sleep(1000);
//Перейти на вкладку "Шаблоны"
		menuTemplate().click();
		sleep(1000);
//Выбираем шаблон
		selectTextTemplate().click();
		sleep(1000);
//Нажимаем кнопку "Выбрать"(Открывается окно подтверждения)
		buttonСhoose().click();
		sleep(1000);
//Кликаем"Да"(Переходим на вкладку детали)
		buttonYes().click();
		sleep(6000);
//Нажимаем кнопку "Отправить"
		buttonSend().click();
		sleep(10000);
////Выходим из учетной записи администратора (Открывается страница авторизации)
//		exit().click();
//		sleep(5000);
////Авторизоваться под пользователем
//		login().sendKeys("6783");
//		sleep(1000);
//		password().sendKeys("6783");
//		sleep(1000);
//		buttonGo().click();
//		sleep(7500);
	}

	public void SendSomeMassage() {

		app.tko_26().start();
		app.tko_26().selectAgent();
		app.tko_26().selectUser();

	}

}
