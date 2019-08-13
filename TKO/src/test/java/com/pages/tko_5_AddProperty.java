package com.pages;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class tko_5_AddProperty {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_5_AddProperty() {

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

	public SelenideElement menuProperty() {
		return $(By.xpath("//div[@class='v-captiontext' and text()='Объекты недвижимости']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonAdd() {
		return $(By.xpath("//span[text()='Добавить']/../..")).waitUntil(visible, app.timeOut);
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
		return $(By.xpath("//td[@class='gwt-MenuItem']")).waitUntil(visible, app.timeOut);
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
		return $(By.xpath("//td[@class='gwt-MenuItem']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement boxFile() {
		return $(By.xpath("(//div[@class='v-grid-tablewrapper'])[2]//td[2]")).waitUntil(visible, app.timeOut);
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
		return $(By.xpath("//span[text()='Отправить на проверку']/../..")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement menuMyRequest() {
		return $(By.xpath("//div[@class='v-captiontext' and text()='Мои заявки']")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement validText() {
		return $(By.xpath("(//div[@class='v-table-cell-wrapper'])[6]")).waitUntil(visible, app.timeOut);
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
//открывается окно Мои лицевые счета со списком контрагентов
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
//Разворачиваем окно на весь экран
		boxMax().click();
		sleep(1000);
	}

	public void addProperty() {
//Указываем кадастровый номер
		TextBoxKadasNumber().sendKeys("38:36:000021:27104");
		sleep(1000);
//Нажимаем "Поиск" (Появляются доп. поля)
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

//		boxFile().doubleClick();
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
		
		String nameTextEtap = validText().getText();
		System.out.println(nameTextEtap);
		Assert.assertEquals(nameTextEtap, "Верификация");
//Выбираем заявку, отправленную на обработку 
		MyRequest().click();
		sleep(6000);
     }
	
	public void AddProperty() {
		
		app.tko_5().start();
		app.tko_5().selectAgent();
		app.tko_5().addProperty();
		app.tko_5().loadFile();


	}

}
