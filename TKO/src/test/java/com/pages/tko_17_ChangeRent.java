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

public class tko_17_ChangeRent {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_17_ChangeRent() {

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
		return $(By.xpath("//div[@class='v-table-cell-wrapper' or @class='v-captiontext']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement menuRent() {
		return $(By.xpath("//div[@class='v-captiontext' and text()='Арендаторы']")).waitUntil(visible, app.timeOut);
	}


	public SelenideElement selectObject() {
		return $(By.xpath("//tbody[@class='v-grid-body']/tr")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement selectRent() {
		return $(By.xpath("(//tbody[@class='v-grid-body'])[2]/tr")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonChange() {
		return $(By.xpath("(//div[@class='v-button v-widget icon v-button-icon'])[2]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement textFIO() {
		return $(By.xpath("//input[@class='v-textfield v-widget v-textfield-required v-required v-has-width']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement textFIO2() {
		return $(By.xpath("//input[@class='v-textfield v-widget v-textfield-required v-required v-has-width v-textfield-error v-textfield-error-error c-empty-value']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement textFone() {
		return $(By.xpath("//input[@class='c-maskedfield v-widget c-maskedfield-required v-required v-has-width']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement textFone2() {
		return $(By.xpath("//input[@class='c-maskedfield v-widget c-maskedfield-required v-required v-has-width c-maskedfield-empty']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement textS() {
		return $(By.xpath("(//div[@class='c-fglayout-slot c-full-height-widget inline'])[7]/input")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement textS2() {
		return $(By.xpath("(//div[@class='c-fglayout-slot c-full-height-widget inline'])[7]/input")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonOK() {
		return $(By.xpath("(//div[@class='v-button v-widget icon v-button-icon c-primary-action v-button-c-primary-action'])[3]")).waitUntil(visible, app.timeOut);
	}

	public void start() {
//Авторизоваться под пользователем
		login().sendKeys("6783");
		sleep(1000);
		password().sendKeys("6783");
		sleep(1000);
		buttonGo().click();
		sleep(1500);

	}
	public void selectAgent() {

//Двойным щелчком мыши заходим в контрагента (открывается окно "Карточка л/с")
		agent().doubleClick();
		sleep(1000);
	//Переходим на вкладку "Арендаторы"	
		menuRent().click();
		sleep(1000);

	}

	public void changeRent() {

//Слева выбираем объект недвижимости
		selectObject().click();
		sleep(3000);
//Справа выбираем арендатора
		selectRent().click();
		sleep(1000);
// Нажать "Изменить"(Открывается окно "Редактор арендатора недвижимости")
		buttonChange().click();
		sleep(1000);
//Очищаем поле Фио
		textFIO().clear();
		sleep(1000);
//Очищаем поле "Площадь" 
		textS().clear();
		sleep(2000);
//Вводим ФИО
		textFIO2().sendKeys("Журавлева Анна");
		sleep(1000);
//Вводим площадь
		textS2().sendKeys("60");
		sleep(1000);
//Кликаем ОК
		buttonOK().click();
		sleep(6000);
	}
	// Загрузка файла
	public SelenideElement file() {
		File file = new File("");
		String fileName="\\files\\NDFL.jpg";
		
		SelenideElement locator = $(By.xpath("//*[@name='files[]']")).waitUntil(exist, app.timeOut);
		locator.uploadFile(new File(file.getAbsolutePath()+fileName));
		return locator;

	}
	public void AddProperty() {
		
		app.tko_17().start();
		app.tko_17().selectAgent();
		app.tko_17().changeRent();
		


	}

}
