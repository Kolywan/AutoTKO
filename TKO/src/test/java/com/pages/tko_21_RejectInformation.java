package com.pages;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class tko_21_RejectInformation {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_21_RejectInformation() {

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
		return $(By.xpath("//table[@class='v-table-table']/tbody/tr")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement menuProperty() {
		return $(By.xpath("//div[@class='v-captiontext' and text()='Объекты недвижимости']")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement selectProperty() {
		return $(By.xpath("//tr[@class='v-grid-row v-grid-row-has-data v-grid-row-focused' or @class='v-grid-row v-grid-row-has-data']/td[6]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonChange() {
		return $(By.xpath("(//div[@class='v-button v-widget icon v-button-icon'])[3]")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement menuObject() {
		return $(By.xpath("//div[@class='v-filterselect-button']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement selectObject() {
		return $(By.xpath("(//td[@class='gwt-MenuItem'])[5]")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonSend() {
		return $(By.xpath("(//div[@class='v-button v-widget icon v-button-icon c-primary-action v-button-c-primary-action'])[3]")).waitUntil(visible, app.timeOut);
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
		return $(By.xpath("//div[text()='Особый случай']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement selectRequest() {
		return $(By.xpath("//table[@class='v-table-table']//tr/td[3]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonRefuse() {
		return $(By.xpath("(//div[@class='v-button v-widget icon v-button-icon'])[2]")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement textBoxComment() {
		return $(By.xpath("//div[@class='c-resizabletextarea-wrapper v-widget c-resizabletextarea-wrapper-error c-resizabletextarea-wrapper-error-error c-resizabletextarea-wrapper-required v-required v-has-width v-has-height']/textarea")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement buttonOkComment() {
		return $(By.xpath("//div[@class='v-csslayout v-layout v-widget c-flowlayout v-csslayout-c-flowlayout v-has-width v-csslayout-spacing']/div")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement buttonOkRequest() {
		return $(By.xpath("//div[@class='v-button v-widget icon v-button-icon c-primary-action v-button-c-primary-action']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement menuRejected() {
		return $(By.xpath("//div[text()='Отклонено']")).waitUntil(visible, app.timeOut);
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
//Переходим на вкладку "Объекты недвижимости"
		menuProperty().click();
		sleep(1000);
//Выбираем объект недвижимости, который ранее был согласован (Фон заявки окрашен, в белый цвет)
		selectProperty().click();
		sleep(1000);
//Кликаем “Изменить сведения” (Всплывает окно "редактор контрагент-объект недвижимости")
		buttonChange().click();
		sleep(1000);
	}

	public void editAgent() {
//Открываем меню объект недвижимости
		menuObject().click();
		sleep(1000);
//Выбираем объект недвижимости
		selectObject().click();
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
	public void loadFile() {

//Кликаем “Отправить на проверку” (Всплывает информация: Запись была отправлена на обработку)
		buttonSend().click();
		sleep(1500);
//Переходим на вкладку "Мои заявки" (Отображаются заявки, отправленные на обработку)
		menuMyRequest().click();
//Выбираем заявку, отправленную на обработку
		MyRequest().click();
		sleep(6000);
//Выходим из учетной записи пользователя (Открывается страница авторизации)
		exit().click();
		sleep(5000);
     }
	
	public void startAdmin() {

//Авторизация под администратором
		login().sendKeys("testadmin");
		sleep(1000);
		password().sendKeys("1");
		sleep(1000);
		buttonGo().click();
		sleep(1500);

	}
	public void request() {

//Перейти на вкладку "заявки на изменение"
		requestСhange().click();
		sleep(7000);
//Кликаем раздел "Особый случай"(Открываются заявки на изменение)
		CheckingOfUnits().click();
		sleep(8000);
//Кликаем по заявке два раза (Открывается окно заявка на изменение)
		selectRequest().doubleClick();
		sleep(5000);
//Кликаем “Отказать” (Всплывает окно "комментарий")
		buttonRefuse().click();
		sleep(5000);
//Вписываем комментарий 
		textBoxComment().sendKeys("Изменение не возможно");
		sleep(3000);
//Кликаем “Ок” (Открыто окно “Заявка на изменение”)
		buttonOkComment().click();
		sleep(1000);
//Кликаем “Ок” (Открывается окно “Заявки на изменение”)
		buttonOkRequest().doubleClick();
		sleep(5000);
//Перейти в раздел "Отклонено"
		menuRejected().click();
		sleep(5000);
//Открываем заявку
		choiceRuquest().doubleClick();
		sleep(5000);
//Выходим из учетной записи администратора (Открывается страница авторизации)	
		exit().click();
		sleep(5000);
	}
	public void startUser2() {

//Авторизоваться под пользователем 
		login().sendKeys("6783");
		sleep(1000);
		password().sendKeys("6783");
		sleep(1000);
		buttonGo().click();
		sleep(1500);
//Двойным щелчком мыши заходим в контрагента (Открывается окно "Карточка л/с")
		agent().doubleClick();
		sleep(1000);
//Переходим на вкладку "Мои заявки" (Отображаются заявки)
		menuMyRequest().click();
//Кликаем по заявке
		MyRequest().click();
		sleep(6000);

	}
	public void RejectInformation() {
		
		app.tko_21().startUser();
		app.tko_21().selectAgent();
		app.tko_21().editAgent();
		app.tko_21().loadFile();
		app.tko_21().startAdmin();
		app.tko_21().request();
		app.tko_21().startUser2();
		
		


	}

}
