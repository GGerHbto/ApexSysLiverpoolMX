package tcs_LiverpoolMX;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages_LiverpoolMX.LandingPage_Liv;
import commonMethods_LiverpoolMX.GlobalVariables_Liverpool;
import commonMethods_LiverpoolMX.WrapClass_Liverpool;
import setupDriver_LiverpoolMX.SetupDriver_Liv;

public class TC000_Search_for_articles {
	
	// Declarar e inicializar el WebDriver
	WebDriver driver = SetupDriver_Liv.setupDriverMethod();	
	
	// Page Objects
	LandingPage_Liv landingPageLiv = new LandingPage_Liv(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables_Liverpool.HOME_PAGE);
	}	
	
    @Test
    public void TC000() throws InterruptedException {
    	landingPageLiv.searchProductMethod(GlobalVariables_Liverpool.ARTICLE_BY_BRAND);
    	System.out.println("Test - se buscó por BRAND.."); 
    	boolean articleToVerify = landingPageLiv.verifyArticleIsDisplayed();
  	    Assert.assertTrue(articleToVerify);
  	    if (articleToVerify) {
  	    	System.out.println("Test - articulo correcto..");
  	    }
  	    
  	    landingPageLiv.searchProductMethod(GlobalVariables_Liverpool.ARTICLE_BY_MODEL);
  	  	System.out.println("Test - se buscó por MODEL.."); 
  	  	articleToVerify = landingPageLiv.verifyArticleIsDisplayed();
	    Assert.assertTrue(articleToVerify);
	    if (articleToVerify) {
	    	System.out.println("Test - articulo correcto..");
	    }
	    
	    landingPageLiv.searchProductMethod(GlobalVariables_Liverpool.ARTICLE_BY_PCHAR);
  	  	System.out.println("Test - se buscó por PCHAR.."); 
  	  	articleToVerify = landingPageLiv.verifyArticleIsDisplayed();
	    Assert.assertTrue(articleToVerify);
	    if (articleToVerify) {
	    	System.out.println("Test - articulo correcto..");
	    }
	    
	    landingPageLiv.searchProductMethod(GlobalVariables_Liverpool.ARTICLE_BY_3CHAR);
  	  	System.out.println("Test - se buscó por 3CHAR.."); 
  	  	articleToVerify = landingPageLiv.verifyArticleIsDisplayed();
	    Assert.assertTrue(articleToVerify);
	    if (articleToVerify) {
	    	System.out.println("Test - articulo correcto..");
	    }
	    
	    landingPageLiv.searchProductMethod(GlobalVariables_Liverpool.ARTICLE_BY_RANDOM);
  	  	System.out.println("Test - se buscó por RANDOM.."); 
  	  	boolean noProductMessage = landingPageLiv.validateNonProductMessageMethod();
	    Assert.assertTrue(noProductMessage);
	    if (noProductMessage) {
	    	System.out.println("Test - mensaje correcto..");
	    }	
    }
    
    @AfterTest   
    public void closeDriver() {
    	
    	// Otros pasos de cierre si es necesario
        
        try {
            // Pausa de 1 segundos (1000 milisegundos)
            Thread.sleep(1000);
            System.out.println("Test - espara 1sec final test..");
            WrapClass_Liverpool.takeScreenshot(driver, "TC000_Search_for_articles");
        } catch (InterruptedException e) {
            // Manejar cualquier excepción que pueda ocurrir al pausar el hilo
            e.printStackTrace();
        }

        // Cierra el navegador
  	  	driver.quit();
    }
}


