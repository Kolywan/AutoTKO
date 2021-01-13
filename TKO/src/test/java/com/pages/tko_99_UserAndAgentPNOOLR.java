package com.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;
import com.teamdev.jxcapture.demo.image.Actions;

public class tko_99_UserAndAgentPNOOLR {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_99_UserAndAgentPNOOLR() {

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

	public SelenideElement menuApp() {
		return $(By.xpath("//div[@class='v-menubar v-widget c-main-menu v-menubar-c-main-menu v-has-width']/span[3]")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement menuClient() {
		return $(By.xpath("//div[@class='v-menubar-submenu v-widget c-main-menu v-menubar-submenu-c-main-menu v-has-width']/span[1]")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement menuAgent() {
		return $(By.xpath("//div[@class='v-menubar-submenu v-widget c-main-menu v-menubar-submenu-c-main-menu v-has-width v-menubar-submenu-has-icons']/span[1]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement agent() {
		return $(By.xpath("//table[@class='v-table-table']/tbody/tr[15]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement checkBoxPNOOLR() {
	
		return $(By.xpath("//div[text()='Есть ПНООЛР']/../../span/input")).waitUntil(visible, app.timeOut);
		
	}
	public SelenideElement menuUser() {
		return $(By.xpath("//div[@class='c-pickerfield-layout v-layout v-widget v-has-width']/div")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement searchCondition() {
		return $(By.xpath("//div[@class='v-slot v-slot-link v-align-middle']")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement searchLogin() {
		return $(By.xpath("//div[@class='v-tree-node-caption']//span[text()='Логин']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement searchText() {
		return $(By.xpath("//div[@class='v-slot v-slot-param-field']/input")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement searchButton() {
		return $(By.xpath("//div[@class='v-button v-widget filter-search-button v-button-filter-search-button icon v-button-icon']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement user() {
		return $(By.xpath("//div[@class='v-table-cell-wrapper' and text()='6783']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonOk() {
		return $(By.xpath("//div[@class='v-button v-widget icon v-button-icon c-primary-action v-button-c-primary-action']")).waitUntil(visible, app.timeOut);
	}
	
	
	public void start() {
// Авторизация под администратором
		sleep(1000);
		login().sendKeys("d-150788@mail.ru");
		
		password().sendKeys("123456789");
		
		buttonGo().click();
		sleep(1000);

	}
	public void selectAgent() {

//Зайти в "Приложение" 
		menuApp().click();
		sleep(3000);
//Выбрать "Клиенты" 
		menuClient().click();
		sleep(1500);
//Выбрать "Контрагенты" 
		menuAgent().click();
		sleep(5000);
//Случайным подбором происходит выбор контрагента из предложенных вариантов
				Random rend = new Random();
				int Low = 1;
				int High = 45;
				int x = rend.nextInt(High - Low) + Low;
				$(By.xpath("//table[@class='v-table-table']/tbody/tr["+ x +"]")).doubleClick();
				
		sleep(1000);
	}

	public void selectUser() {

//С правой стороны карточки л/с нажимем на меню "Пользователь"


		menuUser().click();
		sleep(1500);
//Добавляем условие поиска
		searchCondition().click();
		
//Из предложенного списка двойным щелчком мыши выбираем "Логин"
		searchLogin().doubleClick();
		
//Вписываем условие поиска
		searchText().sendKeys("6783");
		
//Нажимаем кнопку "Поиск"
		searchButton().click();
		
//Двойным щелчком выбираем найденного пользователя
		user().click();
		user().doubleClick();
		
		$(By.xpath("//div[text()='Есть ПНООЛР']/../../span/input")).sendKeys(Keys.SPACE);
		
//Нажимаем кнопку "OK"
		buttonOk().click();
		sleep(1000);
	}
	public void AddUserAgentPNOOLR() {
		
		app.tko_99().start();
		app.tko_99().selectAgent();
		app.tko_99().selectUser();

	}

}
