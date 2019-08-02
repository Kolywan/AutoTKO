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

public class tko_28_ApproveContract {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_28_ApproveContract() {

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
		return $(By.xpath("//table[@class='v-table-table']/tbody/tr[2]")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement menuContract() {
		return $(By.xpath("//div[@class='v-captiontext' and text()='Договоры']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonAddAgreement() {
		return $(By.xpath("//span[text()='Сформировать доп.согл.']/../..")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonAgree() {
		return $(By.xpath("//span[text()='Согласен']/../..")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement menuAccount() {
		return $(By.xpath("//div[text()='Счета']")).waitUntil(visible, app.timeOut);
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
//Переходим на вкладку "Договоры"
		menuContract().click();
		sleep(1000);
//Кликаем "Сформировать доп. соглашение"(всплывает окно “выполняется операция” далее открывается окно "Просмотр договора" в нем отображается документ "Доп. соглашение")
		buttonAddAgreement().click();
		sleep(7000);
//Нажать “Согласен” (На вкладке "Договоры" появляется доп. соглашение)
		buttonAgree().click();
		sleep(3000);
//Переходим на вкладку " Счета" (появляется запись о счетах)
		menuAccount().click();
		sleep(3000);
	}

	public void ApproveContract() {
		
		app.tko_28().start();
		app.tko_28().selectAgent();



	}

}
