package tcs_LiverpoolMX;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages_LiverpoolMX.PantallasPage_Liv;
import commonMethods_LiverpoolMX.GlobalVariables_Liverpool;
import commonMethods_LiverpoolMX.WrapClass_Liverpool;
import setupDriver_LiverpoolMX.SetupDriver_Liv;

public class TC010_Buying_a_Smart_TV {
	
	// Declarar e inicializar el WebDriver
	WebDriver driver = SetupDriver_Liv.setupDriverMethod();	
	
	// Page Objects
	PantallasPage_Liv pantallasPageLiv = new PantallasPage_Liv(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables_Liverpool.PANTALLAS_PAGE);
	}	
	
	@Test
    public void TC010() throws InterruptedException {
//		pantallasPageLiv.searchProductMethod(GlobalVariables_Liverpool.ARTICLE_BY_BRAND); 
//    	boolean articleToVerify = pantallasPageLiv.verifyArticleIsDisplayed();
//  	    Assert.assertTrue(articleToVerify);
//  	    if (articleToVerify) {
//  	    	System.out.println("Test - articulo correcto..");
//  	    }
		
		pantallasPageLiv.filterHinse65p();
		boolean articleToVerify = pantallasPageLiv.verifyArticleIsDisplayed();
	    Assert.assertTrue(articleToVerify);
	    if (articleToVerify) {
	    	System.out.println("Test - articulo correcto..");
	    }
	    
	    pantallasPageLiv.selectHinse65p();
	    pantallasPageLiv.loginAccount();
	    
    }
	
    @AfterTest   
    public void closeDriver() {
    	
    	// Otros pasos de cierre si es necesario
        
        try {
            // Pausa de 1 segundos (1000 milisegundos)
            Thread.sleep(1000);
            System.out.println("Test - espara 1sec final test..");
            WrapClass_Liverpool.takeScreenshot(driver, "TC010_Buying_a_Smart_TV");
        } catch (InterruptedException e) {
            // Manejar cualquier excepción que pueda ocurrir al pausar el hilo
            e.printStackTrace();
        }

        // Cierra el navegador
  	  	driver.quit();
    }	
}
