package tcs_LiverpoolMX;

import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages_LiverpoolMX.LoginPage_Liv;
import commonMethods_LiverpoolMX.GlobalVariables_Liverpool;
import commonMethods_LiverpoolMX.WrapClass_Liverpool;
import setupDriver_LiverpoolMX.SetupDriver_Liv;

public class TC020_Reset_consumer_accnt_pass {
	
	// Declarar e inicializar el WebDriver
	WebDriver driver = SetupDriver_Liv.setupDriverMethod();	
	
	// Page Objects
	LoginPage_Liv loginPageLiv = new LoginPage_Liv(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables_Liverpool.LOGIN_PAGE);
	}	
	
	@Test
    public void TC020() throws InterruptedException {
		
	    loginPageLiv.resetPassword();
	    
    }
	
    @AfterTest   
    public void closeDriver() {
    	
    	// Otros pasos de cierre si es necesario
        
        try {
            // Pausa de 1 segundos (1000 milisegundos)
            Thread.sleep(1000);
            System.out.println("Test - espara 1sec final test..");
            WrapClass_Liverpool.takeScreenshot(driver, "TC020_Reset_consumer_accnt_pass");
        } catch (InterruptedException e) {
            // Manejar cualquier excepción que pueda ocurrir al pausar el hilo
            e.printStackTrace();
        }

        // Cierra el navegador
  	  	driver.quit();
    }	
}
