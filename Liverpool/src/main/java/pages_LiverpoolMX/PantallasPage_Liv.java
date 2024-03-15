package pages_LiverpoolMX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods_LiverpoolMX.GlobalVariables_Liverpool;
import commonMethods_LiverpoolMX.WrapClass_Liverpool;

public class PantallasPage_Liv {
	
	public PantallasPage_Liv (WebDriver driver) {
		PageFactory.initElements(driver, this);
		System.out.println("PantallasPage_Liv - Pantallas Page ha inicializado el chrome driver..");
	}
	
	@FindBy(id = "mainSearchbar") private WebElement searchBar;
	@FindBy(css = "[data-prodid='1140440384']") private WebElement specificArticle;
	
	@FindBy(css = "[href='/tienda/tv-y-video/catst14456541']") private WebElement electronicaPage;
	@FindBy(id = "brand-HISENSE") private WebElement bHINSE;
	@FindBy(id = "variants.normalizedSize-65 pulgadas") private WebElement size65p;
	@FindBy(id = "opc_pdp_buyNowButton") private WebElement comprarBtn;
	
	@FindBy(id = "username") private WebElement usernameText;
	@FindBy(id = "password") private WebElement passwordText;
	@FindBy(css = "[type='submit']") private WebElement iniciarSesionBtn;
	
	
	public void searchProductMethod(String article) throws InterruptedException {
		WrapClass_Liverpool.clearAllText(searchBar);
		WrapClass_Liverpool.sendKeys(searchBar, article);
		WrapClass_Liverpool.sendReturn(searchBar);
		System.out.println("Pantallas Page: searchProductMethod..");
		Thread.sleep(2000);
		}
	
	public boolean verifyArticleIsDisplayed() {
	    try {
	        boolean internalVar = WrapClass_Liverpool.verifyElementDisplayed(specificArticle);
	        System.out.println("Pantallas Page: verifyArticleIsDisplayed..");
	        return internalVar;
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        System.out.println("Pantallas Page: Elemento no encontrado en la pantalla.");
	        return false;
	    }
	}
	
	public void filterHinse65p() throws InterruptedException {
		WrapClass_Liverpool.click(bHINSE);
		Thread.sleep(2000);
		WrapClass_Liverpool.click(size65p);
		System.out.println("Pantallas Page: filterHinse65p..");
		Thread.sleep(1000);
		}
	
	public void selectHinse65p() throws InterruptedException {
		WrapClass_Liverpool.click(specificArticle);
		Thread.sleep(2000);
		WrapClass_Liverpool.click(comprarBtn);
		System.out.println("Pantallas Page: selectHinse65p..");
		Thread.sleep(1000);
		}
	
	public void loginAccount() throws InterruptedException {
		WrapClass_Liverpool.sendKeys(usernameText, GlobalVariables_Liverpool.USER);
		Thread.sleep(2000);
		WrapClass_Liverpool.sendKeys(passwordText, GlobalVariables_Liverpool.PASSWORD);
		System.out.println("Pantallas Page: loginAccount..");
		Thread.sleep(1000);
		WrapClass_Liverpool.click(iniciarSesionBtn);
		Thread.sleep(1000);
		}



}
