package com.main.appmanager;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

import java.io.File;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.base.common.Logs;
import com.codeborne.selenide.Configuration;
import com.data.Data;
import com.data.DelEmails;
import com.data.GetEmail;
import com.pages.tko_10_ContainerAddress;
import com.pages.tko_11_NewContainerAddress;
import com.pages.tko_12_DeleteContainerAddress;
import com.pages.tko_13_ApproveRequest;
import com.pages.tko_14_RejectRequest;
import com.pages.tko_15_KadasNumber;
import com.pages.tko_16_ChangeInformation;
import com.pages.tko_17_ChangeRent;
import com.pages.tko_18_PNOOLR;
import com.pages.tko_19_AddPNOOLR;
import com.pages.tko_1_CreateAgent;
import com.pages.tko_20_DeleteON;
import com.pages.tko_21_RejectInformation;
import com.pages.tko_22_RejectProperty;
import com.pages.tko_23_GetAccount;
import com.pages.tko_24_Account;
import com.pages.tko_25_SendAllMassage;
import com.pages.tko_26_SendSomeMassage;
import com.pages.tko_27_SendEmail;
import com.pages.tko_28_ApproveContract;
import com.pages.tko_99_UserAndAgentPNOOLR;
import com.pages.tko_2_UserAndAgent;
import com.pages.tko_30_AccountRent;
import com.pages.tko_31_ExportApplication;
import com.pages.tko_33_AddOnNON;
import com.pages.tko_3_CreateUser;
import com.pages.tko_4_AddDocument;
import com.pages.tko_5_AddProperty;
import com.pages.tko_6_AddPropertyRent;
import com.pages.tko_7_ChangeInformationUser;
import com.pages.tko_8_RequestDeleteON;
import com.pages.tko_95_DeleteON;
import com.pages.tko_96_addONWithoutCheckingAdmin;
import com.pages.tko_97_addONWithoutChecking;
import com.pages.tko_98_DeleteAgent;
import com.pages.tko_9_AddRent;

public class ApplicationManager {

	public int timeOut = 5000;
   	
	public int tt= 5000;
	
	protected static Logs logs;
	// ##########################
	protected Data data;
	// ##########################
	// Pages
	protected tko_99_UserAndAgentPNOOLR tko_99;
	protected tko_98_DeleteAgent tko_98;
	protected tko_97_addONWithoutChecking tko_97;
	protected tko_96_addONWithoutCheckingAdmin tko_96;
	protected tko_95_DeleteON tko_95;
	protected tko_1_CreateAgent tko_1;
	protected tko_2_UserAndAgent tko_2;
	protected tko_3_CreateUser tko_3;
	protected tko_4_AddDocument tko_4;
	protected tko_5_AddProperty tko_5;
	protected tko_6_AddPropertyRent tko_6;
	protected tko_7_ChangeInformationUser tko_7;
	protected tko_8_RequestDeleteON tko_8;
	protected tko_9_AddRent tko_9;
	protected tko_10_ContainerAddress tko_10;
	protected tko_11_NewContainerAddress tko_11;
	protected tko_12_DeleteContainerAddress tko_12;
	protected tko_13_ApproveRequest tko_13;
	protected tko_14_RejectRequest tko_14;
	protected tko_15_KadasNumber tko_15;
	protected tko_16_ChangeInformation tko_16;
	protected tko_17_ChangeRent tko_17;
	protected tko_18_PNOOLR tko_18;
	protected tko_19_AddPNOOLR tko_19;
	protected tko_20_DeleteON tko_20;
	protected tko_21_RejectInformation tko_21;
	protected tko_22_RejectProperty tko_22;
	protected tko_23_GetAccount tko_23;	
	protected tko_24_Account tko_24;
	protected tko_25_SendAllMassage tko_25;
	protected tko_26_SendSomeMassage tko_26;
	protected tko_27_SendEmail tko_27;
	protected tko_28_ApproveContract tko_28;
	protected tko_30_AccountRent tko_30;
	protected tko_31_ExportApplication tko_31;
	protected tko_33_AddOnNON tko_33;
	protected DelEmails deleteMails;
	protected GetEmail getEmail;


	// ##########################

	public static ApplicationManager app;

	public static ApplicationManager getInstance(String url, String platform) throws Exception {
		app = new ApplicationManager();
		File DriverPath = new File("");

		System.setProperty("webdriver.chrome.driver", DriverPath.getAbsolutePath() + "\\drivers\\chromedriver.exe");

		System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tT %4$s %5$s%6$s%n");
		// LoggingPreferences logs = new LoggingPreferences();
		// logs.enable(LogType.BROWSER, Level.ALL);
		// logs.enable(LogType.CLIENT, Level.ALL);
		// logs.enable(LogType.DRIVER, Level.ALL);
		// logs.enable(LogType.PERFORMANCE, Level.ALL);
		// logs.enable(LogType.PROFILER, Level.ALL);
		// logs.enable(LogType.SERVER, Level.ALL);
		// ChromeOptions options = new ChromeOptions();
		// DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		// capabilities.setCapability(CapabilityType.LOGGING_PREFS, logs);
		// options.addArguments("start-maximized");
		// capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		Configuration.startMaximized = true;
		open(url);
		return app;
	}

	public void tearDown() throws Exception {
		close();

	}

	// ##############################

	public Logs logs() {
		return logs = new Logs();
	}

	// ##############################

	public Data data() {
		return data = new Data();
	}

	// ##############################

	public DelEmails deleteMails() {
		return deleteMails = new DelEmails();
	}

	// ##############################

	public GetEmail getEmail() {
		return getEmail = new GetEmail();
	}

	// ##############################

	// ##############################

	// ##############################

	public tko_1_CreateAgent tko_1() {
		return tko_1 = new tko_1_CreateAgent();
	}
	
	// ##############################
	public tko_2_UserAndAgent tko_2() {
		return tko_2 = new tko_2_UserAndAgent();
	}
	
	// ##############################
	public tko_3_CreateUser tko_3() {
		return tko_3 = new tko_3_CreateUser();
	}
	
	// ##############################
	public tko_4_AddDocument tko_4() {
		return tko_4 = new tko_4_AddDocument();
	}
	// ##############################
	
	public tko_5_AddProperty tko_5() {
		return tko_5 = new tko_5_AddProperty();
	}
	// ##############################
	
	public tko_6_AddPropertyRent tko_6() {
		return tko_6 = new tko_6_AddPropertyRent();
	}
	// ##############################
	public tko_7_ChangeInformationUser tko_7() {
		return tko_7 = new tko_7_ChangeInformationUser();
	}
	// ##############################
		public tko_8_RequestDeleteON tko_8() {
		return tko_8 = new tko_8_RequestDeleteON();
	}
	// ##############################
	public tko_9_AddRent tko_9() {
		return tko_9 = new tko_9_AddRent();
	}
	// ##############################
	public tko_10_ContainerAddress tko_10() {
		return tko_10 = new tko_10_ContainerAddress();
	}
	// ##############################

	public tko_11_NewContainerAddress tko_11() {
		return tko_11 = new tko_11_NewContainerAddress();
	}	
	// ##############################

	public tko_12_DeleteContainerAddress tko_12() {
		return tko_12 = new tko_12_DeleteContainerAddress();
	}
	// ##############################
		public tko_13_ApproveRequest tko_13() {
		return tko_13 = new tko_13_ApproveRequest();
	}
	// ##############################
		public tko_14_RejectRequest tko_14() {
		return tko_14 = new tko_14_RejectRequest();
	}
		// ##############################
		public tko_15_KadasNumber tko_15() {
		return tko_15 = new tko_15_KadasNumber();
	}
	
	// ##############################
	public tko_16_ChangeInformation tko_16() {
		return tko_16 = new tko_16_ChangeInformation();
	}
	// ##############################
	public tko_17_ChangeRent tko_17() {
		return tko_17 = new tko_17_ChangeRent();
	}
	// ##############################
	public tko_18_PNOOLR tko_18() {
		return tko_18 = new tko_18_PNOOLR();
	}
	// ##############################
	public tko_19_AddPNOOLR tko_19() {
		return tko_19 = new tko_19_AddPNOOLR();
	}
	// ##############################
		public tko_20_DeleteON tko_20() {
		return tko_20 = new tko_20_DeleteON();
	}
	// ##############################
	public tko_21_RejectInformation tko_21() {
		return tko_21 = new tko_21_RejectInformation();
	}
	// ##############################
	public tko_22_RejectProperty tko_22() {
		return tko_22 = new tko_22_RejectProperty();
	}
	// ##############################
	public tko_23_GetAccount tko_23() {
		return tko_23 = new tko_23_GetAccount();
	}	
	// ##############################
	public tko_24_Account tko_24() {
		return tko_24 = new tko_24_Account();
	}
	// ##############################
	public tko_25_SendAllMassage tko_25() {
		return tko_25 = new tko_25_SendAllMassage();
	}	
	// ##############################
	public tko_26_SendSomeMassage tko_26() {
		return tko_26 = new tko_26_SendSomeMassage();
	}
	// ##############################
	public tko_27_SendEmail tko_27() {
		return tko_27 = new tko_27_SendEmail();
	}
	// ##############################
	public tko_28_ApproveContract tko_28() {
		return tko_28 = new tko_28_ApproveContract();
	}
	// ##############################
	public tko_30_AccountRent tko_30() {
		return tko_30 = new tko_30_AccountRent();
	}
	// ##############################
	public tko_31_ExportApplication tko_31() {
		return tko_31 = new tko_31_ExportApplication();
	}
	// ##############################
	public tko_95_DeleteON tko_95() {
		return tko_95 = new tko_95_DeleteON();
	}
	// ##############################
	public tko_96_addONWithoutCheckingAdmin tko_96() {
		return tko_96 = new tko_96_addONWithoutCheckingAdmin();
	}
	// ##############################
	public tko_97_addONWithoutChecking tko_97() {
		return tko_97 = new tko_97_addONWithoutChecking();
	}
	// ##############################
	public tko_98_DeleteAgent tko_98() {
		return tko_98 = new tko_98_DeleteAgent();
	}
	// ##############################
	public tko_99_UserAndAgentPNOOLR tko_99() {
		return tko_99 = new tko_99_UserAndAgentPNOOLR();
	}
	// ##############################
	public tko_33_AddOnNON tko_33() {
		return tko_33 = new tko_33_AddOnNON();
	}
	// ##############################
	public void switchLoging() throws SecurityException, IOException {
		// set logger Level for RemoteWebDriver
		Logger logger = Logger.getLogger(RemoteWebDriver.class.getName());
		logger.setLevel(Level.ALL);
		// delete all Handlers
		for (Handler handler : logger.getHandlers()) {
			logger.removeHandler(handler);
		}
		// create Console Handler and define level ALL
		ConsoleHandler console = new ConsoleHandler();
		console.setLevel(Level.INFO);
		logger.addHandler(console);
		// create File Handler and define level ALL
		File log = new File("log.txt");
		FileHandler file = new FileHandler(log.getAbsolutePath());
		file.setLevel(Level.ALL);
		file.setFormatter(new SimpleFormatter());
		logger.addHandler(file);
	}

}
