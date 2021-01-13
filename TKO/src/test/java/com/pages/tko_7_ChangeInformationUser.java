package com.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class tko_7_ChangeInformationUser {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_7_ChangeInformationUser() {

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
	public SelenideElement buttonChange() {
		return $(By.xpath("(//div[@class='v-button v-widget icon v-button-icon'])[3]")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement menuObject() {
		return $(By.xpath("//div[@class='v-filterselect-button']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement selectObject() {
		return $(By.xpath("(//td[@class='gwt-MenuItem'])[5]")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonSend() {
		return $(By.xpath("//span[text()='OK']/../..")).waitUntil(visible, app.timeOut);
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
	
	




	public void startUser() {

		//Авторизоваться под пользователем
				login().sendKeys("6783");
				
				password().sendKeys("6783");
				
				buttonGo().click();
				
			}
			public void selectAgent() {

		//Двойным щелчком мыши заходим в контрагента (Открывается окно "Карточка л/с")
				agent().doubleClick();
				
		//Переходим на вкладку "Объекты недвижимости"
				menuProperty().click();
				
		//Выбираем объект недвижимости, который ранее был согласован (Фон заявки окрашен, в белый цвет)
				selectProperty().click();
				
		//Кликаем “Изменить сведения” (Всплывает окно "редактор контрагент-объект недвижимости")
				buttonChange().click();
				
			}

			public void editAgent() {
		//Открываем меню объект недвижимости
				menuObject().click();
				
		//Выбираем объект недвижимости
				selectObject().click();
				


			}

			public void loadFile() {

				//Кликаем “Отправить на проверку” (Всплывает информация: Запись была отправлена на обработку)
						buttonSend().click();
						
				//Переходим на вкладку "Мои заявки" (Отображаются заявки, отправленные на обработку)
						menuMyRequest().click();
				//Выбираем заявку, отправленную на обработку
						MyRequest().click();
						sleep(2000);

				     }

	public void ChangeInformationUser() {
		
		app.tko_7().startUser();
		app.tko_7().selectAgent();
		app.tko_7().editAgent();
		app.tko_7().loadFile();

		
		


	}

}
