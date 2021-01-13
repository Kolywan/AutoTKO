package com.pages;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class tko_96_addONWithoutCheckingAdmin {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_96_addONWithoutCheckingAdmin() {

		app = new ApplicationManager();
	}

	// Загрузка файла
	public SelenideElement file() {
		File file = new File("");
		String fileName = "\\files\\NDFL.jpg";

		SelenideElement locator = $(By.xpath("//*[@name='files[]']")).waitUntil(exist, app.timeOut);
		locator.uploadFile(new File(file.getAbsolutePath() + fileName));
		return locator;

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

	public SelenideElement close() {
		return $(By.xpath("//span[@class='v-tabsheet-caption-close']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement menuApp() {
		return $(By.xpath("//div[@class='v-menubar v-widget c-main-menu v-menubar-c-main-menu v-has-width']/span[3]"))
				.waitUntil(visible, app.timeOut);
	}

	public SelenideElement menuСustomer() {
		return $(By.xpath(
				"//div[@class='v-menubar-submenu v-widget c-main-menu v-menubar-submenu-c-main-menu v-has-width']/span"))
						.waitUntil(visible, app.timeOut);
	}

	public SelenideElement personalAccounts() {
		return $(By.xpath(
				"//div[@class='v-menubar-submenu v-widget c-main-menu v-menubar-submenu-c-main-menu v-has-width v-menubar-submenu-has-icons']/span[2]"))
						.waitUntil(visible, app.timeOut);
	}

	public SelenideElement agent() {
		return $(By.xpath("//div[@class='v-table-cell-wrapper' or @class='v-captiontext']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement menuProperty() {
		return $(By.xpath("//div[text()='Объекты недвижимости']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonAddAdmin() {
		return $(By.xpath("//span[text()='Добавить (без проверок)']/../..")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement boxMax() {
		return $(By.xpath("//div[@class='v-window-maximizebox']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement TextBoxKadasNumber() {
		return $(By.xpath("//div[@class='v-widget v-has-caption v-caption-on-right v-has-width']/input")).waitUntil(visible,
				app.timeOut);
	}

	public SelenideElement buttonFind() {
		return $(By.xpath("(//div[@class='v-button v-widget'])[2]")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement menuObject() {
		return $(By.xpath("//div[@class='v-filterselect-button']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement selectObject() {
		return $(By.xpath("//div[@class='v-filterselect-suggestmenu']//td[1]")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement infoText() {
		return $(By.xpath("//div[@class='v-Notification warning v-Notification-warning']")).waitUntil(visible,
				app.timeOut);
	}

	public SelenideElement menuUnits() {
		return $(By.xpath(
				"//input[@class='v-textfield v-widget v-textfield-error v-textfield-error-error v-textfield-required v-required v-has-width c-empty-value']"))
						.waitUntil(visible, app.timeOut);
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
		return $(By.xpath(
				"//input[@class='v-textfield v-widget v-textfield-error v-textfield-error-error v-textfield-required v-required c-empty-value']"))
						.waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonSend() {
		return $(By.xpath("//span[text()='OK']/../..")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement menuRent() {
		return $(By.xpath("//div[text()='Арендаторы']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement selectON() {
		return $(By.xpath("//tbody[@class='v-grid-body']/tr")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonAdd() {
		return $(By.xpath(
				"//span[text()='Добавить (без проверок)']/../.."))
						.waitUntil(visible, app.timeOut);
	}
	public SelenideElement menuClient() {
		return $(By.xpath("//div[@class='v-menubar-submenu v-widget c-main-menu v-menubar-submenu-c-main-menu v-has-width']/span[1]")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement menuAccount() {
		return $(By.xpath("//div[@class='v-menubar-submenu v-widget c-main-menu v-menubar-submenu-c-main-menu v-has-width v-menubar-submenu-has-icons']/span[2]")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement selectIP() {
		return $(By.xpath("//span[text()='ИП']/..")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement textINN() {
		return $(By.xpath(
				"//input[@class='v-textfield v-widget v-textfield-error v-textfield-error-error v-textfield-required v-required v-has-width c-empty-value']"))
						.waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonSave() {
		return $(By.xpath("//span[text()='Сохранить и закрыть']/../..")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement textFIO() {
		return $(By.xpath(
				"//input[@class='v-textfield v-widget v-textfield-error v-textfield-error-error v-textfield-required v-required v-has-width c-empty-value']"))
						.waitUntil(visible, app.timeOut);
	}

	public SelenideElement textFone() {
		return $(By.xpath(
				"//input[@class='c-maskedfield v-widget c-maskedfield-error c-maskedfield-error-error c-maskedfield-required v-required v-has-width c-maskedfield-empty']"))
						.waitUntil(visible, app.timeOut);
	}

	public SelenideElement menuObjectRent() {
		return $(By.xpath("//div[@class='v-filterselect-button']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement selectObject2() {
		return $(By.xpath("(//td[@class='gwt-MenuItem'])[2]")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement textS() {
		return $(By.xpath("(//div[text()='Площадь'])[2]/../../input")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement checkboxRent() {
		return $(By.xpath("//div[text()='Оплата собственником']/../../span/input")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonOK() {
		return $(By.xpath(
				"(//div[@class='v-button v-widget icon v-button-icon c-primary-action v-button-c-primary-action'])[3]"))
						.waitUntil(visible, app.timeOut);
	}

	public SelenideElement textNameAccount() {
		return $(By.xpath("//div[text()='Лицевой счет']/../../div[3]/div")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement searchCondition() {
		return $(By.xpath("//div[@class='v-slot v-slot-link v-align-middle']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement maximizebox() {
		return $(By.xpath("//div[@class='v-window-maximizebox']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement searchAccount() {
		return $(By.xpath("//div[@class='v-tree-node-children v-tree-node-children-root v-tree-node-children-last']")).waitUntil(visible,
				app.timeOut);
	}

	public SelenideElement searchText() {
		return $(By.xpath("//div[@class='v-slot v-slot-param-field']/input")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement searchButton() {
		return $(By.xpath(
				"//div[@class='v-button v-widget filter-search-button v-button-filter-search-button icon v-button-icon']"))
						.waitUntil(visible, app.timeOut);
	}

	public SelenideElement menuAccountRent() {
		return $(By.xpath("//div[text()='Счета арендаторам']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement selectRent() {
		return $(By.xpath("//td[text()='ИП Журавлева Анна Николаевна']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonLKRent() {
		return $(By.xpath("//span[text()='ЛК арендатора']/../..")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement menuContainer() {
		return $(By.xpath("//div[text()='Контейнерные площадки']")).waitUntil(visible,
				app.timeOut);
	}

	public SelenideElement selectObjectContainer() {
		return $(By.xpath("//div[@class='v-table-cell-wrapper']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonAddContainer() {
		return $(By.xpath("//div[@class='v-button v-widget primary v-button-primary icon v-button-icon']"))
				.waitUntil(visible, app.timeOut);
	}

	public SelenideElement textAddress() {
		return $(By.xpath("//input[@class='v-textfield v-widget v-has-width v-textfield-prompt']")).waitUntil(visible,
				app.timeOut);
	}

	public SelenideElement buttonFindContainer() {
		return $(By.xpath("(//div[@class='v-button v-widget icon v-button-icon'])[3]")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonSelectContainer() {
		return $(By.xpath("//div[@class='v-slot v-slot-c-window-action-button v-slot-icon v-slot-c-primary-action']"))
				.waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonExport() {
		return $(By.xpath("//div[@class='v-button v-widget borderless v-button-borderless']")).waitUntil(visible,
				app.timeOut);
	}

	public SelenideElement checkboxTuesday() {
		return $(By.xpath("(//div[@class='v-slot'])[21]//label")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement checkboxThursday() {
		return $(By.xpath("(//div[@class='v-slot'])[23]//label")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement checkboxSaturday() {
		return $(By.xpath("(//div[@class='v-slot'])[25]//label")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonOkExport() {
		return $(By.xpath("(//div[@class='v-button v-widget primary v-button-primary icon v-button-icon'])[2]"))
				.waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonOkExport2() {
		return $(By.xpath(
				"(//div[@class='v-button v-widget icon v-button-icon c-primary-action v-button-c-primary-action'])[2]"))
						.waitUntil(visible, app.timeOut);
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
	
	public SelenideElement menuKART() {
		return $(By.xpath("//div[text()='Карточка л/с']")).waitUntil(visible, app.timeOut);
	}	
		public SelenideElement period() {
		return $(By.xpath("//div[@class='c-grouptable-group-cell-expander']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement exit() {
		return $(By.xpath("//div[@class='v-button v-widget c-logout-button v-button-c-logout-button icon v-button-icon v-button-empty-caption']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonOk() {
		return $(By.xpath("//div[@class='v-button v-widget icon v-button-icon c-primary-action v-button-c-primary-action']")).waitUntil(visible, app.timeOut);
	}
	

	public SelenideElement menuON() {
		return $(By.xpath("//div[@class='v-menubar-submenu v-widget c-main-menu v-menubar-submenu-c-main-menu v-has-width']/span[2]")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement ON() {
		return $(By.xpath("//div[@class='v-menubar-submenu v-widget c-main-menu v-menubar-submenu-c-main-menu v-has-width v-menubar-submenu-has-icons']/span[1]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement N() {
		return $(By.xpath("//table[@class='v-table-table']/tbody/tr[15]/td[4]/div")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement closeMenuON() {
		return $(By.xpath("//span[@class='v-tabsheet-caption-close']")).waitUntil(visible, app.timeOut);
	}
	public void getKadastrNumber() {

// Авторизоваться под пользователем
		login().sendKeys("6783");
		
		password().sendKeys("6783");
		
		buttonGo().click();
		sleep(500);
// Двойным щелчком мыши заходим в контрагента (Открывается окно "Карточка л/с")
		agent().doubleClick();
		

// Сохраняем данные лицевого счета
		String account = textNameAccount().getText();
		System.out.println(account);
// Выходим из учетной записи пользователя (Открывается страница авторизации)
		exit().click();
		sleep(1000);
// Авторизация под администратором
		login().sendKeys("d-150788@mail.ru");
		
		password().sendKeys("123456789");
		
		buttonGo().click();
		sleep(1000);
// Зайти в "Приложение"
		menuApp().click();
		sleep(2000);
// перейти "Объекты недвижимости"
		menuON().click();
		
// Выбрать "Объекты недвижимости"
		ON().click();
		sleep(8000);
// Случайно выбираем адрес из списка
// Сохраняем кадастровый номер
		Random ran = new Random();
		int Low = 1;
		int High = 30;
		int Result = ran.nextInt(High-Low) + Low;
		String number = $(By.xpath("//table[@class='v-table-table']/tbody/tr[" + Result + "]/td[4]/div")).getText();
		System.out.println(number);
// Закрываем вкладку
		closeMenuON().click();
		
// Зайти в "Приложение"
		menuApp().click();
		sleep(2000);
// Выбрать "Клиенты"
		menuClient().click();
		sleep(1000);
// Выбрать "Лицевые счета"
		menuAccount().click();
		sleep(1000);
// Кликаем "Добавить условие поиска"
		searchCondition().click();
		
// разворачиваем окно на весь экран
		maximizebox().click();
		
		$(By.xpath("//input[@class='v-textfield v-widget v-has-width c-empty-value']")).sendKeys("Лицевой счет");
// Из предложенного списка двойным щелчком мыши выбираем "Лицевой счет"
		
		searchAccount().click();
		
		searchAccount().doubleClick();
		
// Вписываем условие поиска(Лицевой счет который был ранее сохранен)
		searchText().sendKeys(account);
		
// Нажимаем кнопку "Поиск"
		searchButton().click();
		sleep(1000);
// Выбираем контрагента из списка двойным щелчком мыши
		$(By.xpath("//div[text()='" + account + "']")).doubleClick();
		
// Двойным щелчком мыши заходим в контрагента (Открывается окно "Карточка л/с")
		agent().doubleClick();
		
// Переходим на вкладку "Объекты недвижимости"
		menuProperty().click();
		
// Кликаем "Добавить(без проверки)" (Появляется форма "Редактор контрагент-объект
// недвижимости")
		buttonAdd().click();
		
// Разворачиваем окно на весь экран
		boxMax().click();
		

// Указываем кадастровый номер
		TextBoxKadasNumber().sendKeys(number);
		
// Кликаем "Найти"(Появляются доп. поля)
		buttonFind().click();
		
// Открываем меню “Категория объекта”
		menuObject().click();
		
// Выбираем “Категория объекта”
		Random r = new Random();
		int L = 1;
		int H = 10;
		int Res = r.nextInt(H - L) + L;

		$(By.xpath("(//td[@class='gwt-MenuItem'])[" + Res + "]")).click();
		
// Открываем меню “Тип владения”
		menuPossessions().click();
		
// Выбираем “Тип владения”
		selectPossessions().click();
		
		buttonSend().click();
		sleep(500);
		buttonSave().click();
		sleep(500);
		exit().click();
		sleep(500);
			}

	public void addONWithoutCheckingAdmin() {
		app.tko_96().getKadastrNumber();




	}

}
