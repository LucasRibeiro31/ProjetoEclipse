package suporte;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web {
	public static WebDriver createChrome() {
		
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\p-lucribeiro\\Drivers\\chromedriver.exe");
	
			
			
			// Desmarcar essas opções abaixo para poder usar Headless
			
			//	ChromeOptions options = new ChromeOptions();
			//	options.addArguments("--headless");
			
			//	WebDriver driver = new ChromeDriver(options);
			
			//-----------------------------------------------------------//
			
			
			// comando para poder usar o Webdriver manager
			
			//	WebDriverManager.chromedriver().setup();
			// 	WebDriverManager.chromedriver().proxy("http://webproxy.intraservice.corp/proxy.page" ).setup();
		
		
 	
	  ChromeDriver driver = new ChromeDriver(); // essa linha precisara ser comentada para usar Headless
	  
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	
	
	driver.get("https://energia-qaa.internalenv.corp/Login/index.fcc?TYPE=33554433&REALMOID=06-0005719e-805a-1ecd-995d-69db0a020000&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-EK0WfBhPptl3Q1XeY0mIZgvHozHSf%2bq1E01p3O0cerru1Ap6G9KqpIF7MXEzNk2V&TARGET=-SM-https%3a%2f%2fenergia--qaa%2einternalenv%2ecorp%2fmle%2f#/");
	driver.manage().window().setSize(new Dimension(1936, 1056));
	
	
	
	
	
	return driver;

	
	
}
	

}
