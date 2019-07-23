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

public class tko_9_AddRent {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_9_AddRent() {

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

	public SelenideElement menuRent() {
		return $(By.xpath("//div[@class='v-captiontext' and text()='Арендаторы']")).waitUntil(visible, app.timeOut);
	}


	public SelenideElement selectObject() {
		return $(By.xpath("//tbody[@class='v-grid-body']/tr[2]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonAdd() {
		return $(By.xpath("//div[@class='v-button v-widget icon v-button-icon c-primary-action v-button-c-primary-action']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement menuAgent() {
		return $(By.xpath("//div[@class='v-filterselect-button']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement selectIP() {
		return $(By.xpath("//td[@class='gwt-MenuItem']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement textINN() {
		return $(By.xpath("//input[@class='v-textfield v-widget v-textfield-error v-textfield-error-error v-textfield-required v-required v-has-width c-empty-value']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonFind() {
		return $(By.xpath("//div[@class='v-button v-widget v-has-width']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement textFIO() {
		return $(By.xpath("//input[@class='v-textfield v-widget v-textfield-error v-textfield-error-error v-textfield-required v-required v-has-width c-empty-value']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement textFone() {
		return $(By.xpath("//input[@class='c-maskedfield v-widget c-maskedfield-error c-maskedfield-error-error c-maskedfield-required v-required v-has-width c-maskedfield-empty']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement menuObject() {
		return $(By.xpath("(//div[@class='v-filterselect-button'])[2]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement selectObject2() {
		return $(By.xpath("(//td[@class='gwt-MenuItem'])[2]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement textS() {
		return $(By.xpath("(//div[@class='c-fglayout-slot c-full-height-widget inline'])[10]/input")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonSend() {
		return $(By.xpath("(//div[@class='v-button v-widget icon v-button-icon c-primary-action v-button-c-primary-action'])[3]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonOK() {
		return $(By.xpath("(//div[@class='v-button v-widget icon v-button-icon c-primary-action v-button-c-primary-action'])[3]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement MyRequest() {
		return $(By.xpath("//table[@class='v-table-table']/tbody/tr")).waitUntil(visible, app.timeOut);
	}
	public void start() {
//Авторизоваться под пользователем 
		login().sendKeys("6783");
		sleep(1000);
		password().sendKeys("6783");
		sleep(1000);
		buttonGo().click();
		sleep(1500);
//Открывается окно Мои лицевые счета со списком контрагентов
	}
	public void selectAgent() {

//Двойным щелчком мыши заходим в контрагента (открывается окно "Карточка л/с")
		agent().doubleClick();
		sleep(1000);
//Переходим на вкладку "Арендаторы"
		menuRent().click();
		sleep(1000);

	}

	public void addRent() {
//Слева выбираем объект недвижимости
		selectObject().click();
		sleep(3000);
//Кликаем "Добавить"( появляется окно "редактор арендатора недвижимости".)
		buttonAdd().click();
		sleep(1000);
//Открываем меню тип контрагента
		menuAgent().click();
		sleep(1000);
//Указать тип контрагента
		selectIP().click();
		sleep(1000);
//Указать ИНН
		textINN().sendKeys("380100986876");
		sleep(1500);
//Кликаем "найти" 
		buttonFind().click();
		sleep(2500);
		
	}
	// Загрузка файла
	public SelenideElement file() {
		File file = new File("");
		String fileName="\\files\\NDFL.jpg";
		
		SelenideElement locator = $(By.xpath("//*[@name='files[]']")).waitUntil(exist, app.timeOut);
		locator.uploadFile(new File(file.getAbsolutePath()+fileName));
		return locator;

	}
	//Появляются доп. строки
	public void additionalFields() {
//Указываем ФИО
		textFIO().sendKeys("Журавлева Анна Николаевна");
		sleep(1000);
//Указываем телефон
		textFone().sendKeys("79965009685");
		sleep(1000);
//Открываем меню "Категория использования"
		menuObject().click();
		sleep(1500);
//Выбираем "Категория использования"
		selectObject2().click();
		sleep(1000);
//Указываем площадь
		textS().sendKeys("100");
		sleep(1000);
//Загружаем "Договор"
		file();
		sleep(1500);
//Кликаем Ок
		buttonOK().click();
		
		sleep(6000);
     }
	public void AddProperty() {
		
		app.tko_9().start();
		app.tko_9().selectAgent();
		app.tko_9().addRent();
		app.tko_9().additionalFields();


	}

}
