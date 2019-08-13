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

public class tko_4_AddDocument {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_4_AddDocument() {

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

	public SelenideElement menuDocument() {
		return $(By.xpath("//div[text()='Документы']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonCreate() {
		return $(By.xpath("//div[@class='v-button v-widget icon v-button-icon c-primary-action v-button-c-primary-action']")).waitUntil(visible, app.timeOut);
	}

	
	public SelenideElement TextNameDocument() {
		return $(By.xpath("//div[@class='c-fglayout-slot c-full-height-widget inline']/input")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement loadFile() {
		return $(By.xpath("//div[@class='c-fileupload v-widget']/input")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement buttonOK() {
		return $(By.xpath("(//div[@class='v-button v-widget icon v-button-icon c-primary-action v-button-c-primary-action'])[3]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonSave() {
		return $(By.xpath("(//div[@class='v-button v-widget icon v-button-icon c-primary-action v-button-c-primary-action'])[2]")).waitUntil(visible, app.timeOut);
	}

	
	public void start() {
// Авторизоваться под пользователем 
		login().sendKeys("6783");
		sleep(1000);
		password().sendKeys("6783");
		sleep(1000);
		buttonGo().click();
		sleep(1500);

	}
	
	
	
	// Загрузка файла
		public SelenideElement file() {
			File file = new File("");
			String fileName="\\files\\NDFL.jpg";
			
			SelenideElement locator = $(By.xpath("//*[@name='files[]']")).waitUntil(exist, app.timeOut);
			locator.uploadFile(new File(file.getAbsolutePath()+fileName));
			return locator;
	
		}
	
	
	public void selectAgent() {

//Двойным щелчком мыши заходим в контрагента 
		agent().doubleClick();
		sleep(1000);
	}
	public void addDocument() {
//В разделе "основное" выбираем документы
		menuDocument().click();
		sleep(1000);
//Кликаем “создать” (Открывается окно "Редактор документа")
		buttonCreate().click();
		sleep(5000);
//Указываем название документа
		TextNameDocument().sendKeys("Договор аренды");
		sleep(1000);
//Загружаем документ 
		file();
		sleep(1500);
//Кликаем ОК
		buttonOK().click();
		sleep(1500);
//Кликаем "Сохранить"
		buttonSave().click();
		sleep(4500);
	}


	
	public void AddProperty() {
		
		app.tko_4().start();
		app.tko_4().selectAgent();
		app.tko_4().addDocument();



	}

}
