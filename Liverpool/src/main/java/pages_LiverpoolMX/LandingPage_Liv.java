package pages_LiverpoolMX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods_LiverpoolMX.WrapClass_Liverpool;

public class LandingPage_Liv {
	
	public LandingPage_Liv (WebDriver driver) {
		PageFactory.initElements(driver, this);
		System.out.println("LandingPage_Liv - Landing Page ha inicializado el chrome driver..");
	}
	
//		WebElements LandingPage_Liv
		@FindBy(id = "mainSearchbar") private WebElement searchBar;
		@FindBy(id = "__next") private WebElement btnMagnifier;	 //no se está ocupando tampoco	
//		@FindBy(css = "[data-prodid='1103181514']") private WebElement specificArticle1;
//		@FindBy(css = "[data-prodid='1137794817']") private WebElement specificArticle2;
		@FindBy(css = "[data-prodid='1137794761']") private WebElement specificArticle3;
		@FindBy(css = "[class='icon-close']") private WebElement clearPrevSearch; // para ver si puedo darle click a la x y borrar el texto
		@FindBy(css = "[class='o-nullproduct-title-query']") private WebElement noProductFound;
		
		@FindBy(css = "[class='m-navDesktop__menuList']") private WebElement categoriesMenu;
		@FindBy(css = "[data-submenu-id='CAT5150041']") private WebElement electronicaPage;
		
		
	public void searchProductMethod(String article) throws InterruptedException {
		WrapClass_Liverpool.clearAllText(searchBar);
		WrapClass_Liverpool.sendKeys(searchBar, article);
		WrapClass_Liverpool.sendReturn(searchBar);
		System.out.println("Landing Page: searchProductMethod..");
		Thread.sleep(2000);
		}
	
	public void clearSearchbar() throws InterruptedException {
		WrapClass_Liverpool.clearAllText(searchBar);
		System.out.println("Landing Page: clearSearchbar..");
	}
	
	public void refreshPage(WebDriver driver) {
		WrapClass_Liverpool.refreshPage(driver);
		System.out.println("Landing Page: refreshPage..");
	}

	public boolean verifyArticleIsDisplayed() {
	    try {
	        boolean internalVar = WrapClass_Liverpool.verifyElementDisplayed(specificArticle3);
	        System.out.println("Landing Page: verifyArticleIsDisplayed..");
	        return internalVar;
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        System.out.println("Landing Page: Elemento no encontrado en la pantalla.");
	        return false;  // Otra acción o valor por defecto si el elemento no está presente
	    }
	}
	
	public boolean validateNonProductMessageMethod() {
		boolean errorDisplayed = WrapClass_Liverpool.getText(noProductFound).contains("Lo sentimos, no encontramos nada para \"Mimetizador\"");
		return errorDisplayed;
	}
	
	public void navigateToElectronica() throws InterruptedException {
		WrapClass_Liverpool.click(categoriesMenu);
		WrapClass_Liverpool.click(electronicaPage);
		System.out.println("Landing Page: navigateToElectronica..");
		Thread.sleep(2000);
		}	

}
