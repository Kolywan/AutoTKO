package com.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class tko_20_DeleteON {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_20_DeleteON() {

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
	
	public SelenideElement selectProperty() {
		return $(By.xpath("//tr[@class='v-grid-row v-grid-row-has-data v-grid-row-focused' or @class='v-grid-row v-grid-row-has-data' or @class='v-grid-row v-grid-row-focused v-grid-row-has-data' or @class='v-grid-row v-grid-row-stripe v-grid-row-has-data']/td[6]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonDelete() {
		return $(By.xpath("(//div[@class='v-button v-widget icon v-button-icon'])[4]")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonYes() {
		return $(By.xpath("(//div[@class='v-button v-widget icon v-button-icon'])[6]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement TextBoxComment() {
		return $(By.xpath("//div[@class='c-resizabletextarea-wrapper v-widget c-resizabletextarea-wrapper-error c-resizabletextarea-wrapper-error-error c-resizabletextarea-wrapper-required v-required v-has-width v-has-height']/textarea")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonOkCommentUser() {
		return $(By.xpath("//div[@class='v-csslayout v-layout v-widget c-flowlayout v-csslayout-c-flowlayout v-has-width v-csslayout-spacing']/div")).waitUntil(visible, app.timeOut);
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
		return $(By.xpath("//div[text()='Аренда']")).waitUntil(visible, app.timeOut);
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
	
	public SelenideElement buttonUpdate() {
		return $(By.xpath("//div[@class='v-button v-widget icon v-button-icon']")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement etap() {
		return $(By.xpath("(//td[@class='v-table-cell-content'])[3]/div")).waitUntil(visible, app.timeOut);
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
	}

	public void menuDelete() {
//Кликаем “Заявка на исключение” (Всплывает окно "Подтверждение")
		buttonDelete().click();
		sleep(1000);
//Кликаем “Да” (Открывается окно “Комментарий”)
		buttonYes().click();
		sleep(1000);
//Вписываем комментарий (Удалить)
		TextBoxComment().sendKeys("Удалить");
		sleep(1000);
//Кликаем “Отправить на проверку” (Всплывает информация: Запись была отправлена на обработку)
		buttonOkCommentUser().click();
		sleep(1500);
//Переходим на вкладку "Мои заявки" (Отображаются заявки, отправленные на обработку)
		menuMyRequest().click();
		buttonUpdate().click();
		sleep(2500);
		buttonUpdate().click();
		sleep(1500);
		String etapText = etap().getText();
		System.out.println(etapText);
//Выходим из учетной записи пользователя (Открывается страница авторизации)
		exit().click();
		sleep(5000);

//Авторизация под администратором
		login().sendKeys("d-150788@mail.ru");
		sleep(1000);
		password().sendKeys("123456789");
		sleep(1000);
		buttonGo().click();
		sleep(1500);

//Перейти на вкладку "заявки на изменение"
		requestСhange().click();
		sleep(12000);
//Кликаем раздел того этапа, система которого присвоила заявке ранее (Открываются заявки на изменение)
		System.out.println("2 ="+etapText);
		$(By.xpath("//div[text()='"+etapText+"']")).click();
		sleep(12000);
//Кликаем по заявке два раза (Открывается окно заявка на изменение)
		selectRequest().doubleClick();
		sleep(5000);
//Кликаем по заявке два раза (Открывается окно заявка на изменение)
		selectRequest().doubleClick();
		sleep(5000);
//Кликаем “Согласовать” (Всплывает окно "комментарий")
		buttonApprove().click();
		sleep(3000);
//Вписываем комментарий 
		textBoxComment().sendKeys("Изменение возможно");
		sleep(3000);
//Кликаем “Ок” (Открыто окно “Заявка на изменение”)
		buttonOkComment().click();
		sleep(1000);
//Кликаем “Ок” (Открывается окно “Заявки на изменение”)
		buttonOkRequest().doubleClick();
		sleep(5000);
//Перейти в раздел "Принято"
		menuAccepted().click();
		sleep(10000);
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
	public void DeleteON() {
		
		app.tko_20().startUser();
		app.tko_20().selectAgent();
		app.tko_20().menuDelete();
		app.tko_20().startUser2();
		
		


	}

}
