package sampleTest1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest1 {
	
	WebDriver wd;
	
	public void loginTest() throws IOException{
		
		WebDriverManager.chromedriver().setup();
		wd.manage().window().maximize();
	//	wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("http://www.google.com");
		
		 File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
 
		 FileHandler.copy(src, new File("D:\\Vcentry\\Workspace\\JenkinsGitTest\\screenshots"));
	}

}
