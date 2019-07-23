package com.base.common;

import java.awt.Dimension;
import java.io.File;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import com.codeborne.selenide.testng.TextReport;
import com.main.appmanager.ApplicationManager;
import com.teamdev.jxcapture.Codec;
import com.teamdev.jxcapture.EncodingParameters;
import com.teamdev.jxcapture.VideoCapture;
import com.teamdev.jxcapture.video.Desktop;




//@Report
//@Listeners(TextReport.class)

public class BaseTest extends TestListenerAdapter {
	public ApplicationManager app;
	public VideoCapture videoCapture;

	
public void startVideo() throws Exception {
	        File file = new File("");
	    	this.videoCapture = VideoCapture.create();	        
	        this.videoCapture.setVideoSource(new Desktop());
	        java.util.List<Codec> videoCodecs = videoCapture.getVideoCodecs();
	        Codec videoCodec = videoCodecs.get(0);
	     //   System.out.println("videoCodec = " + videoCodec);
	        EncodingParameters encodingParameters = new EncodingParameters(new File(file.getAbsoluteFile() + "\\videos\\TEMP." + videoCapture.getVideoFormat().getId()));
	        // Resize output video
	        encodingParameters.setSize(new Dimension(3200, 1768));
	        encodingParameters.setBitrate(10000000);
	        encodingParameters.setFramerate(30);
	        encodingParameters.setCodec(videoCodec);
	   //     System.out.println("encodingParameters = " + encodingParameters);
	        this.videoCapture.setEncodingParameters(encodingParameters);
	        this.videoCapture.start();
	    }
	

//	@Parameters({ "postavshik1", "postavshik2", "postavshik3", "email_password", "contact", "contact_password" })
	@BeforeSuite(alwaysRun = true)
	public void cleanUp() throws Exception {
		
		app = new ApplicationManager();
		
		// Чистим директории 
		File file = new File("");
		app.logs().clean(file.getAbsoluteFile() + "\\screenshots\\");
		app.logs().clean(file.getAbsoluteFile() + "\\videos\\");
		app.logs().clean(file.getAbsoluteFile() + "\\build\\");
		

	

	}

	@Parameters({ "url", "platform" })
	@BeforeClass(alwaysRun = true)
	public void setUp(String url, String platform) throws Exception {
		// Старт Selenide
		app = new ApplicationManager();
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
		// Запуск браузера 
		ApplicationManager.getInstance(url, platform);
	}
	
	@Parameters({ "browser", "url" })
	@BeforeMethod(alwaysRun = true)
	public void startVideo(ITestResult result, String browser, String url) throws Exception {
		// Директория с video очетом
		// Старт видео
		startVideo();
		Reporter.log("</b><details><summary>Click to see last screen...</summary> <br></b>");
		Reporter.log("Открыть "+url+" <br>");
	}


	
	@Parameters({ "browser" })
	@AfterMethod(alwaysRun = true)

	public void result(ITestResult result, String browser) throws Exception {
		// Отчеты в консоль 
		TextReport.onSucceededTest = true;
		TextReport.onFailedTest = true;
		
		// Стоп видео
		String className = this.getClass().getSimpleName();
		this.videoCapture.stop();
		
		//Переименовать видео файл
		File file = new File("");
	        File origin = new File(file.getAbsoluteFile() + "\\videos\\TEMP.WMV");
	        File newName = new File(file.getAbsoluteFile() + "\\videos\\" + result.getMethod().getMethodName() + ".WMV");	        
	        origin.renameTo(newName);	
		
		if (result.isSuccess()) {
			Reporter.setCurrentTestResult(result);
			Reporter.log("</details></b>");
			Reporter.log("<a href=..\\videos\\" + result.getMethod().getMethodName()
					+ ".WMV download=\"filename\">Download video</a>");
			
			Reporter.log("<video width=\"320\" height=\"240\" controls>\n" + 
					"  <source src=\"..\\videos\\"+result.getMethod().getMethodName()+".WMV\" type=\"video/wmv\">\n" + 
					"</video>");
			
			
			app.logs().passedTest("Class - " + className + " TEST - " + result.getMethod().getMethodName(), browser);
			System.out.println("Class - " + className + "  TEST - " + result.getMethod().getMethodName()
					+ " Passed! browser - " + browser + " \n ");
		}

		if (!result.isSuccess()) {
			Reporter.setCurrentTestResult(result);
			Reporter.log("</details></b>");
			Reporter.log("<a href=..\\videos\\" + result.getMethod().getMethodName()
					+ ".WMV download=\"filename\">Download video</a>");
			app.logs().failTest("Class - " + className + "  TEST - " + result.getMethod().getMethodName(), browser);
			System.out.println("Class - " + className + "  TEST - " + result.getMethod().getMethodName()
					+ " Failure!  browser - " + browser + " \n ");
			// Логи, можно добавлять шаги
			app.logs().startLogs();
		}

	}

	@AfterClass(alwaysRun = false)
	public void tearDown() throws Exception {
		app.tearDown();
	}
	



}
