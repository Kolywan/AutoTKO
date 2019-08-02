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

public class tko_10_ContainerAddress {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_10_ContainerAddress() {

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

	public SelenideElement menuContainer() {
		return $(By.xpath("//div[@class='v-captiontext' and text()='Контейнерные площадки']")).waitUntil(visible, app.timeOut);
	}


	public SelenideElement selectObject() {
		return $(By.xpath("//div[@class='v-table-cell-wrapper']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonAdd() {
		return $(By.xpath("//div[@class='v-button v-widget primary v-button-primary icon v-button-icon']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement textAddress() {
		return $(By.xpath("//input[@class='v-textfield v-widget v-has-width v-textfield-prompt']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonFind() {
		return $(By.xpath("(//div[@class='v-button v-widget icon v-button-icon'])[3]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonSelect() {
		return $(By.xpath("//div[@class='v-slot v-slot-c-window-action-button v-slot-icon v-slot-c-primary-action']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonOK() {
		return $(By.xpath("(//div[@class='v-slot v-slot-icon v-slot-c-primary-action'])[2]")).waitUntil(visible, app.timeOut);
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

	public SelenideElement Container() {
		return $(By.xpath("//div[text()='Контейнерные площадки']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement selectRequest() {
		return $(By.xpath("//table[@class='v-table-table']//tr/td[3]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonApprove() {
		return $(By.xpath("//div[@class='v-button v-widget friendly v-button-friendly icon v-button-icon']")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement textBoxComment() {
		return $(By.xpath("//div[@class='c-resizabletextarea-wrapper v-widget v-has-width v-has-height']/textarea")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement buttonOkComment() {
		return $(By.xpath("//div[@class='v-csslayout v-layout v-widget c-flowlayout v-csslayout-c-flowlayout v-has-width v-csslayout-spacing']/div")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement buttonOkRequest() {
		return $(By.xpath("//div[@class='v-button v-widget icon v-button-icon c-primary-action v-button-c-primary-action']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement menuAccepted() {
		return $(By.xpath("//div[text()='Принято']")).waitUntil(visible, app.timeOut);
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
//Переходим на вкладку " Контейнерные площадки"
		menuContainer().click();
		sleep(1000);
//Слева выбираем объект недвижимости 
		selectObject().click();
		sleep(1000);

	}

	public void editAgent() {

//Кликаем "Добавить" (Открывается окно "контейнерные площадки" со списком конт. площадок)
		buttonAdd().click();
		sleep(1000);
//В строке адрес указываем адрес объекта недвижимости к которому прикреплена контейнерная площадка
		textAddress().sendKeys("г Иркутск, ул Карла Либкнехта, д 107-а");
		sleep(1500);
//кликаем " Выбрать ближайший "(Система производит поиск)
		buttonFind().click();
		sleep(2500);
//кликаем " Выбрать” (Появляется окно “Редактор контейнерной площадки”)
		buttonSelect().click();
		sleep(1000);
//Кликаем “ОК” (всплывает информация что,  запись была отправлена на обработку)
		buttonOK().click();
		sleep(2500);
//Переходим на вкладку "Мои заявки" (Отображаются заявки, отправленные на обработку)
		menuMyRequest().click();
		sleep(1500);
//Выбираем заявку, отправленную на обработку 
		MyRequest().click();
		sleep(5500);
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
		//Кликаем раздел "Контейнерные площадки"(Открываются заявки на изменение)
				Container().click();
				sleep(8000);
		//Кликаем по заявке два раза (Открывается окно заявка на изменение)
				selectRequest().doubleClick();
				sleep(5000);
		//Кликаем “Согласовать” (Всплывает окно "комментарий")
				buttonApprove().click();
				sleep(3000);
		//Вписываем комментарий 
				textBoxComment().sendKeys("Согласованно");
				sleep(3000);
		//Кликаем “Ок” (Открыто окно “Заявка на изменение”)
				buttonOkComment().click();
				sleep(1000);
		//Кликаем “Ок” (Открывается окно “Заявки на изменение”)
				buttonOkRequest().doubleClick();
				sleep(5000);
		//Перейти в раздел "Принято"
				menuAccepted().click();
				sleep(8000);
		//Открываем заявку
//				choiceRuquest().doubleClick();
//				sleep(5000);
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
	// Загрузка файла
	public SelenideElement file() {
		File file = new File("");
		String fileName="\\files\\NDFL.jpg";
		
		SelenideElement locator = $(By.xpath("//*[@name='files[]']")).waitUntil(exist, app.timeOut);
		locator.uploadFile(new File(file.getAbsolutePath()+fileName));
		return locator;

	}

	public void AddProperty() {
		
		app.tko_10().start();
		app.tko_10().selectAgent();
		app.tko_10().editAgent();
		app.tko_10().startAdmin();
		app.tko_10().request();
		app.tko_10().startUser2();



	}

}
