package commonMethods_LiverpoolMX;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.WebDriver;

public class WrapClass_Liverpool {
	
	public static void click(WebElement webUI) {
		webUI.click();
	}
	
	public static void sendKeys(WebElement webUI, String textToSend) throws InterruptedException {
		webUI.sendKeys(textToSend);
		Thread.sleep(1000);
	}
	
	public static void sendReturn(WebElement webUI) throws InterruptedException {
		webUI.sendKeys(Keys.RETURN);
		Thread.sleep(1000);
	}
	
	public static String getText(WebElement webUI){
		return webUI.getText();
	}
	
	public static boolean verifyElementDisplayed(WebElement webUI) {
		return webUI.isDisplayed();
	}
	
	public static void clear(WebElement webUI) {
	    webUI.clear();
	}
	
	public static void clearAllText(WebElement webUI) throws InterruptedException {
		webUI.click();
		Thread.sleep(1000);
		webUI.sendKeys(Keys.chord(Keys.COMMAND, "a"));
		Thread.sleep(1000);
	    webUI.clear();
	    Thread.sleep(1000);
	}
	
	public static void refreshPage(WebDriver driver) {
	    driver.navigate().refresh();
	}
	
	public static void takeScreenshot(WebDriver webdriver, String testCaseName) {
		File scrFile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		
		String screenshotPath = "./test-output/ExecutionResultsLiverpool";
		
		try {
			FileHandler.createDir(new File (screenshotPath));
			FileHandler.copy(scrFile, new File(screenshotPath + File.separatorChar + testCaseName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}
