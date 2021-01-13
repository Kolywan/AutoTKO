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

public class tko_14_RejectRequest {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_14_RejectRequest() {

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
		return $(By.xpath("//span[text()='OK']/../..")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement menuMyRequest() {
		return $(By.xpath("//div[@class='v-captiontext' and text()='Мои заявки']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonUpdate() {
		return $(By.xpath("//div[@class='v-button v-widget icon v-button-icon']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement MyRequest() {
		return $(By.xpath("//table[@class='v-table-table']/tbody/tr")).waitUntil(visible, app.timeOut);
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
	public SelenideElement buttonReject() {
		return $(By.xpath("(//div[@class='v-slot v-slot-icon'])[3]")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement textBoxComment() {
		return $(By.xpath("//div[@class='c-resizabletextarea-wrapper v-widget c-resizabletextarea-wrapper-error c-resizabletextarea-wrapper-error-error c-resizabletextarea-wrapper-required v-required v-has-width v-has-height']/textarea")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement buttonOkComment() {
		return $(By.xpath("//div[@class='v-csslayout v-layout v-widget c-flowlayout v-csslayout-c-flowlayout v-has-width v-csslayout-spacing']/div")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement buttonOkRequest() {
		return $(By.xpath("//div[@class='v-button v-widget icon v-button-icon c-primary-action v-button-c-primary-action']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement menuReject() {
		return $(By.xpath("//div[text()='Отклонено']")).waitUntil(visible, app.timeOut);
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
	public SelenideElement etap() {
		return $(By.xpath("(//td[@class='v-table-cell-content'])[3]/div")).waitUntil(visible, app.timeOut);
	}

	public void getKadastrNumber() {
// Авторизация под администратором
		login().sendKeys("testadmin");
		sleep(1000);
		password().sendKeys("123");
		sleep(1000);
		buttonGo().click();
		sleep(1500);
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
		sleep(1000);
		password().sendKeys("6783");
		sleep(1000);
		buttonGo().click();
		sleep(1500);

//Двойным щелчком мыши заходим в контрагента (Открывается окно "Карточка л/с")
		agent().doubleClick();
		sleep(1000);
//Переходим на вкладку "Объекты недвижимости"
		menuProperty().click();
		sleep(1000);
//Кликаем "Добавить" (Появляется форма "Редактор контрагент-объект недвижимости")
		buttonAdd().click();
		sleep(1000);
//Разворачиваем окно на весь экран
		boxMax().click();
		sleep(1000);
		
//Указываем кадастровый номер
		System.out.println(Num);
		TextBoxKadasNumber().sendKeys(Num);
		sleep(1000);
//Кликаем "Найти"(Появляются доп. поля)
		buttonFind().click();
		sleep(1000);
//Открываем меню “Категория объекта” 
		menuObject().click();
		sleep(1000);
//Выбираем “Категория объекта” 
		Random r = new Random();
		int Low = 1;
		int High = 10;
		int Result = r.nextInt(High-Low) + Low;
		
		$(By.xpath("(//td[@class='gwt-MenuItem'])["+Result+"]")).click();
		sleep(1000);
	
		
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
	
	public String et() {
		String etapText = etap().getText();
		System.out.println(etapText);
//		etap().shouldNotHave(text("Верификация"));
//		etap().shouldNotHave(text(etapText),text("Верификация"));
//		etap().shouldNot(text(etapText),text("Верификация"));
		return etapText;
	}
	
	public void startAdmin() {
		String res=et();
//Выходим из учетной записи пользователя (Открывается страница авторизации)
		exit().click();
		sleep(5000);
//Авторизация под администратором 
		login().sendKeys("testadmin");
		sleep(1000);
		password().sendKeys("123");
		sleep(1000);
		buttonGo().click();
		sleep(1500);
//Перейти на вкладку "заявки на изменение"
		requestСhange().click();
		sleep(10000);
//Кликаем раздел того этапа, система которого присвоила заявке ранее (Открываются заявки на изменение)
		
		System.out.println("2 ="+res);
		
		$(By.xpath("//div[text()='"+res+"']")).click();
		
		
		
		sleep(8000);
//Кликаем по заявке два раза (Открывается окно заявка на изменение)
		selectRequest().doubleClick();
		sleep(5000);
//Кликаем “Отказать” (Всплывает окно "комментарий")
		buttonReject().click();
		sleep(3000);
//Вписываем комментарий (Не соответствует действительности)
		textBoxComment().sendKeys("Не соответствует действительности");
		sleep(3000);
//Кликаем “Ок” (Открыто окно “Заявка на изменение”)
		buttonOkComment().sendKeys(Keys.ENTER);
		sleep(1000);
//Кликаем “Ок” (Открывается окно “Заявки на изменение”)
		buttonOkRequest().doubleClick();
		sleep(5000);
////Перейти в раздел "Отклонено"
//		menuReject().click();
//		sleep(9000);
////Открываем заявку 
//		choiceRuquest().doubleClick();
//		sleep(5000);
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
	public void RejectRequest() {
		
		app.tko_14().getKadastrNumber();
		app.tko_14().KadasN();
		app.tko_14().startUser();
		app.tko_14().loadFile();
		app.tko_14().startAdmin();
		app.tko_14().startUser2();
		
		


	}

}
