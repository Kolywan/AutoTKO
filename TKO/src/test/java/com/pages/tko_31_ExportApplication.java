package com.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class tko_31_ExportApplication {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_31_ExportApplication() {

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

	public SelenideElement menuContainer() {
		return $(By.xpath("//div[@class='v-captiontext' and text()='Контейнерные площадки']")).waitUntil(visible, app.timeOut);
	}


	public SelenideElement buttonRequest() {
		return $(By.xpath("//span[text()='Подать заявку на вывоз ТКО']/../..")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement menuKP() {
		return $(By.xpath("//div[@class='v-filterselect-button']")).waitUntil(visible, app.timeOut);
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
	public SelenideElement buttonUpdate() {
		return $(By.xpath("//div[@class='v-button v-widget icon v-button-icon']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement etap() {
		return $(By.xpath("(//td[@class='v-table-cell-content'])[3]/div")).waitUntil(visible, app.timeOut);
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
//Кликаем "Подать заявку на вывоз"
		buttonRequest().click();
		sleep(1000);

	}

	public void editAgent() {

//Открываем меню "Контейнерные площадки"
		menuKP().click();
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
// Переходим на вкладку "Мои заявки" (Отображаются заявки, отправленные на обработку)
		menuMyRequest().click();
		sleep(3000);
		buttonUpdate().click();
		sleep(1500);
		buttonUpdate().click();
		sleep(1500);
		buttonUpdate().click();
		sleep(2500);
	}

	public String et() {
		String etapText = etap().getText();
		System.out.println(etapText);
		return etapText;
	}

	public void startAdmin() {
		String res = et();
// Выходим из учетной записи пользователя (Открывается страница авторизации)
		exit().click();
		sleep(5000);
// Авторизация под администратором
		login().sendKeys("testadmin");
		sleep(1000);
		password().sendKeys("123");
		sleep(1000);
		buttonGo().click();
		sleep(1500);
// Перейти на вкладку "заявки на изменение"
		requestСhange().click();
		sleep(10000);
// Кликаем раздел того этапа, система которого присвоила заявке ранее (Открываются заявки на изменение)

		System.out.println("2 =" + res);

		$(By.xpath("//div[text()='" + res + "']")).click();

		sleep(8000);
// Кликаем по заявке два раза (Открывается окно заявка на изменение)
		selectRequest().doubleClick();
		sleep(5000);
// Кликаем “Согласовать” (Всплывает окно "комментарий")
		buttonApprove().click();
		sleep(3000);
// Вписываем комментарий (Согласованно)
		textBoxComment().sendKeys("Согласованно");
		sleep(3000);
		textBoxComment().sendKeys(Keys.TAB);
		sleep(1000);
// Кликаем “Ок” (Открыто окно “Заявка на изменение”)
		buttonOkComment().sendKeys(Keys.ENTER);
		sleep(1000);
// Кликаем “Ок” (Открывается окно “Заявки на изменение”)
		buttonOkRequest().doubleClick();
		sleep(10000);
// Перейти в раздел "Принято"
		menuAccepted().click();
		sleep(8000);
// Двойным щелчком открываем заявку
		choiceRuquest().doubleClick();
		sleep(5000);
// Выходим из учетной записи администратора (Открывается страница авторизации)
		exit().click();
		sleep(5000);
	}

	public void startUser2() {
// Авторизоваться под пользователем
		login().sendKeys("6783");
		sleep(1000);
		password().sendKeys("6783");
		sleep(1000);
		buttonGo().click();
		sleep(1500);
// Двойным щелчком мыши заходим в контрагента (Открывается окно "Карточка л/с")
		agent().doubleClick();
		sleep(1000);
// Переходим на вкладку "Мои заявки" (Отображаются заявки)
		menuMyRequest().click();
// Кликаем на заявку
//			MyRequest().click();
		sleep(6000);
	}

	public void ExportApplication() {
		
		app.tko_31().start();
		app.tko_31().selectAgent();
		app.tko_31().editAgent();
//		app.tko_10().startAdmin();
//		app.tko_10().startUser2();



	}

}
