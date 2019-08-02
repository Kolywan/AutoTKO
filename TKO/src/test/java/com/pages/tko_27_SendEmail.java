package com.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class tko_27_SendEmail {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_27_SendEmail() {

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

	public SelenideElement email() {
		return $(By.xpath(
				"//div[@class='v-menubar-submenu v-widget c-main-menu v-menubar-submenu-c-main-menu v-has-width']//span[text()='Рассылка Email']"))
						.waitUntil(visible, app.timeOut);
	}

	public SelenideElement textBoxTeam() {
		return $(By.xpath("//input[@class='v-textfield v-widget v-textfield-error v-textfield-error-error v-textfield-required v-required v-has-width c-empty-value']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement textBoxToWhom() {
		return $(By.xpath("//input[@class='v-textfield v-widget v-has-width c-empty-value']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement textBoxMassage() {
		return $(By.xpath("//iframe[@class='gwt-RichTextArea']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonSend() {
		return $(By.xpath("//span[text()='Отправить']/../..")).waitUntil(visible, app.timeOut);
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

	public void Email() {

//Зайти в "Приложение" 
		menuApp().click();
		sleep(1000);
//Выбрать "Рассылка Email" (Открыто окно "отправить Email")
		email().click();
		sleep(1000);
//Заполнить поля:"Тема"
		textBoxTeam().sendKeys("Оплата");
		sleep(1000);
//Заполнить поля:"Кому"
		textBoxToWhom().sendKeys("d-150788@mail.ru");
		sleep(1000);
//Заполнить поля:"Сообщение"
		textBoxMassage().sendKeys("Важное");
//Нажимаем кнопку "Отправить"
		buttonSend().click();
		sleep(10000);
	}

	public void SendEmail() {

		app.tko_27().start();
		app.tko_27().Email();

	}

}
