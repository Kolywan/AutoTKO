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

public class tko_6_AddPropertyRent {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_6_AddPropertyRent() {

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

	public SelenideElement buttonAdd() {
		return $(By.xpath("//div[@class='v-button v-widget icon v-button-icon c-primary-action v-button-c-primary-action']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement boxMax() {
		return $(By.xpath("//div[@class='v-window-maximizebox']")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement TextBoxKadasNumber() {
		return $(By.xpath("//div[@class='v-widget v-has-caption v-caption-on-right']/input")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement buttonFind() {
		return $(By.xpath("(//div[@class='v-button v-widget'])[2]")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement menuObject() {
		return $(By.xpath("//div[@class='v-filterselect-button']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement selectObject() {
		return $(By.xpath("(//td[@class='gwt-MenuItem'])[4]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement infoText() {
		return $(By.xpath("//div[@class='v-Notification warning v-Notification-warning']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement menuUnits() {
		return $(By.xpath("//input[@class='v-textfield v-widget v-textfield-error v-textfield-error-error v-textfield-required v-required v-has-width c-empty-value']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement menuPossessions() {
		return $(By.xpath("(//div[@class='v-filterselect-button'])[2]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement selectPossessions() {
		return $(By.xpath("//td[@class='gwt-MenuItem gwt-MenuItem-selected']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement date() {
		return $(By.xpath("//input[@class='v-textfield v-datefield-textfield c-maskedfield-empty']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement boxFile() {
		return $(By.xpath("(//div[@class='v-grid-tablewrapper'])[2]//td[2]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement boxFile2() {
		return $(By.xpath("((//div[@class='v-grid-tablewrapper'])[2]//td[2])[2]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement selectFile() {
		return $(By.xpath("//div[@class='c-fileupload v-widget']/input")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement saveFile() {
		return $(By.xpath("//button[@class='v-grid-editor-save']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement unitsInDocument() {
		return $(By.xpath("//input[@class='v-textfield v-widget v-textfield-error v-textfield-error-error v-textfield-required v-required c-empty-value']")).waitUntil(visible, app.timeOut);
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
//Переходим на вкладку "Объекты недвижимости"
		menuProperty().click();
		sleep(1000);
//Кликаем "Добавить" (появляется форма "Редактор контрагент-объект недвижимости")
		buttonAdd().click();
		sleep(1000);
//Разворачиваем окно
		boxMax().click();
		sleep(1000);
	}

	public void AddPropertyRent() {
//Указываем кадастровый номер 
		TextBoxKadasNumber().sendKeys("38:36:000021:27104");
		sleep(4000);
//Кликаем "найти" (Появляются доп. поля)
		buttonFind().click();
		sleep(1000);
//Открываем меню “Категория объекта” 
		menuObject().click();
		sleep(1000);
//Выбираем “Категория объекта” 
		selectObject().click();
		sleep(1000);
		
//		infoText().click();
//		sleep(1000);
//		menuUnits().sendKeys("25");
//		sleep(1000);

//Открываем меню “Тип владения” 
		menuPossessions().click();
		sleep(1000);
//Выбираем “Тип владения” 
		selectPossessions().click();
		sleep(1000);
//Указываем срок действия аренды
		date().sendKeys("31122019");
		sleep(5000);
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
//Выбираем поле загрузки файлов
		boxFile().doubleClick();
		sleep(1000);
//Загружаем документ “Договор аренды”
		file();
		sleep(1500);
//Сохраняем файл
		saveFile().click();
		sleep(1500);
		
//		boxFile2().doubleClick();
//		sleep(1000);
//		file();
//		sleep(1500);
//		saveFile().click();
//		sleep(1500);
//		unitsInDocument().sendKeys("10");
//		sleep(1000);
		
//Кликаем “Отправить на проверку” (Система возвращается в окно "Карточка л/с" )
		buttonSend().click();
		sleep(1500);
//Переходим на вкладку "Мои заявки" (Отображаются заявки, отправленные на обработку)
		menuMyRequest().click();
//Выбираем заявку, отправленную на обработку 
		MyRequest().click();
		sleep(6000);
     }
	public void AddProperty() {
		
		app.tko_6().start();
		app.tko_6().selectAgent();
		app.tko_6().AddPropertyRent();
		app.tko_6().loadFile();


	}

}
