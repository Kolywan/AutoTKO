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

public class tko_35_AddOnResedent {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_35_AddOnResedent() {

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
		return $(By.xpath("//div[@class='v-widget v-has-caption v-caption-on-right v-has-width']/input")).waitUntil(visible, app.timeOut);
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
		return $(By.xpath("//span[text()='OK']/../..")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement menuMyRequest() {
		return $(By.xpath("//div[@class='v-captiontext' and text()='Мои заявки']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonUpdate() {
		return $(By.xpath("//div[@class='v-button v-widget icon v-button-icon']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement etap() {
		return $(By.xpath("(//td[@class='v-table-cell-content'])[3]/div")).waitUntil(visible, app.timeOut);
	}


	public SelenideElement requestСhange() {
		return $(By.xpath("//div[@class='v-menubar v-widget c-main-menu v-menubar-c-main-menu v-has-width']/span[4]")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement CheckingOfUnits() {
		return $(By.xpath("//div[text()='Особый случай']")).waitUntil(visible, app.timeOut);
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
	
	public SelenideElement menuApp() {
		return $(By.xpath("//div[@class='v-menubar v-widget c-main-menu v-menubar-c-main-menu v-has-width']/span[3]")).waitUntil(visible, app.timeOut);
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


	public void getKadastrNumber() {
// Авторизация под администратором
		login().sendKeys("d-150788@mail.ru");

		password().sendKeys("123456789");

		buttonGo().click();
		sleep(1000);
//Зайти в "Приложение" 
		menuApp().click();
		sleep(1000);
//перейти "Объекты недвижимости" 
		menuON().click();
		sleep(1000);
//Выбрать "Объекты недвижимости" 
		ON().click();
		
		sleep(5000);
	}
//Случайно выбираем адрес из списка
//Сохраняем кадастровый номер
	public String KadasN() {
		Random random = new Random();
		int n = 10 + random.nextInt(46 - 1);
		System.out.println(n);
		String number = $(By.xpath("//table[@class='v-table-table']/tbody/tr["+n+"]/td[4]/div")).getText();

		return number;
	}

	public void startUser() {
		String Num=KadasN();
		System.out.println(Num);
//Авторизоваться под пользователем 
		exit().click();
		login().sendKeys("6783");

		password().sendKeys("6783");

		buttonGo().click();


//Двойным щелчком мыши заходим в контрагента (Открывается окно "Карточка л/с")
		agent().doubleClick();

//Переходим на вкладку "Объекты недвижимости"
		menuProperty().click();
		sleep(1000);
//Кликаем "Добавить" (Появляется форма "Редактор контрагент-объект недвижимости")
		buttonAdd().click();

//Переходим во вкладку ЖИЛЫЕ
		boxMax().click();

		
//Указываем кадастровый номер
		System.out.println(Num);
		TextBoxKadasNumber().sendKeys(Num);

//Кликаем "Найти"(Появляются доп. поля)
		buttonFind().click();

//Открываем меню “Категория объекта” 
		menuObject().click();

//Выбираем “Категория объекта” 
		Random r = new Random();
		int Low = 1;
		int High = 10;
		int Result = r.nextInt(High-Low) + Low;
		
		$(By.xpath("(//td[@class='gwt-MenuItem'])["+Result+"]")).click();

		
		
//		infoText().click();
//		sleep(1000);
//		menuUnits().sendKeys("25");
//		sleep(1000);
		
		
//Открываем меню “Тип владения” 
		menuPossessions().click();

//Выбираем “Тип владения” 
		selectPossessions().click();


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

		boxFile().doubleClick();
		sleep(1000);
		file();
		sleep(1500);
		saveFile().click();
		sleep(1500);
		unitsInDocument().sendKeys("10");
		sleep(1000);
		
//Кликаем “Отправить на проверку” (Система возвращается в окно "Карточка л/с" )
		buttonSend().click();
		sleep(1500);
//Переходим на вкладку "Мои заявки" (Отображаются заявки, отправленные на обработку)
		menuMyRequest().click();
		sleep(3000);
		buttonUpdate().click();
		sleep(1500);
		buttonUpdate().click();
		sleep(1500);
		buttonUpdate().click();
		sleep(2500);
     }
	

	
	public void startAdmin() {

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
		sleep(10000);
//Кликаем раздел того этапа, система которого присвоила заявке ранее (Открываются заявки на изменение)
		

		
		sleep(8000);
////Кликаем по заявке два раза (Открывается окно заявка на изменение)
//		selectRequest().doubleClick();
//		sleep(5000);
////Кликаем “Согласовать” (Всплывает окно "комментарий")
//		buttonApprove().click();
//		sleep(3000);
////Вписываем комментарий (Согласованно)
//		textBoxComment().sendKeys("Согласованно");
//		sleep(3000);
//		textBoxComment().sendKeys(Keys.TAB);
//		sleep(1000);
////Кликаем “Ок” (Открыто окно “Заявка на изменение”)
//		buttonOkComment().sendKeys(Keys.ENTER);
//		sleep(1000);
////Кликаем “Ок” (Открывается окно “Заявки на изменение”)
//		buttonOkRequest().doubleClick();
//		sleep(10000);
////Перейти в раздел "Принято"
//		menuAccepted().click();
//		sleep(8000);
////Двойным щелчком открываем заявку 
//		choiceRuquest().doubleClick();
//		sleep(5000);
////Выходим из учетной записи администратора (Открывается страница авторизации)
//		exit().click();
//		sleep(5000);
//	}
//	public void startUser2() {
////Авторизоваться под пользователем
//		login().sendKeys("6783");
//		sleep(1000);
//		password().sendKeys("6783");
//		sleep(1000);
//		buttonGo().click();
//		sleep(1500);
////Двойным щелчком мыши заходим в контрагента (Открывается окно "Карточка л/с")
//		agent().doubleClick();
//		sleep(1000);
////Переходим на вкладку "Мои заявки" (Отображаются заявки)
//		menuMyRequest().click();
////Кликаем на заявку
////		MyRequest().click();
//		sleep(6000);

	}
	public void addONRes() {
		app.tko_13().getKadastrNumber();
		app.tko_13().KadasN();
		app.tko_13().startUser();
//		app.tko_13().loadFile();
//		app.tko_13().startAdmin();
//		app.tko_13().startUser2();
	}

}
