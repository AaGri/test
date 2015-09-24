package task01_google_oscilloscope;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleOscilloscopeSearch {
	
	private WebDriver driver;
	private String baseURL;
	private String sendKeysWord;
	private String searchOnPage;
	private String screenshotPath;
	private String allPageText;
	
	@Before
	public void startTest(){																	//method that is executed before the test
		driver = new FirefoxDriver();															//start Firefox driver
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);						//implicitly wait
		driver.manage().window().setPosition(new Point(306, 10));								//set window position
	}
	
	
}
