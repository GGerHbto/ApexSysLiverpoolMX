package pages_LiverpoolMX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods_LiverpoolMX.GlobalVariables_Liverpool;
import commonMethods_LiverpoolMX.WrapClass_Liverpool;

public class LoginPage_Liv {
	
	public LoginPage_Liv (WebDriver driver) {
		PageFactory.initElements(driver, this);
		System.out.println("LoginPage_Liv - Login Page ha inicializado el chrome driver..");
	}
	
	@FindBy(id = "username") private WebElement usernameText;
	@FindBy(id = "password") private WebElement passwordText;
	@FindBy(css = "[type='submit']") private WebElement submitBtn;
	@FindBy(css = "[class='cc87dddae c27b98cec']") private WebElement resetPass;
	@FindBy(id = "email") private WebElement emailText;
	
	
	public void loginAccount() throws InterruptedException {
		WrapClass_Liverpool.sendKeys(usernameText, GlobalVariables_Liverpool.USER);
		Thread.sleep(2000);
		WrapClass_Liverpool.sendKeys(passwordText, GlobalVariables_Liverpool.PASSWORD);
		Thread.sleep(1000);
		WrapClass_Liverpool.click(submitBtn);
		Thread.sleep(1000);
		System.out.println("Login Page: loginAccount..");
		}
	
	public void resetPassword() throws InterruptedException {
		WrapClass_Liverpool.click(resetPass);
		Thread.sleep(1000);
		WrapClass_Liverpool.sendKeys(emailText, GlobalVariables_Liverpool.USER);
		Thread.sleep(1000);
		WrapClass_Liverpool.click(submitBtn);
		Thread.sleep(1000);
		System.out.println("Login Page: resetPassword..");
		}



}
