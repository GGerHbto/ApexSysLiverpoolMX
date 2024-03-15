package setupDriver_LiverpoolMX;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupDriver_Liv {
	
	public static WebDriver setupDriverMethod() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("SetupDriver - Se inicia una sesión del chrome, si no carga espera 10 segundos..");
		return driver;		
	}

}
