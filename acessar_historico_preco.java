package MVP;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import suporte.Generator;
import suporte.Screenshot;
import suporte.Web;

public class acessar_historico_preco {

	static WebDriver driver; 
	
	@Rule
	public TestName test = new TestName();
	
	static JavascriptExecutor js;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
				
		driver = Web.createChrome();
	    js = (JavascriptExecutor) driver;
	
	}
	
	@Test
	public void login1() throws InterruptedException {
		
	    
		LoginPage login = new LoginPage(driver);
		
		login.TypeUsername();
		login.TypePassword();
		login.clickOnLoginButton();
	    
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("/html/body/app-root/div[2]/app-dashboard/div[1]/div[3]/div[1]/app-curva-forward/div/div[4]/button")).click();
	    js.executeScript("window.scrollTo(0,0)");
	    
	    Thread.sleep(3000);
	   	      	           
	    
	    String screenshotArquivo = "C:\\Users\\p-lucribeiro\\TestReport\\" + Generator.dataHoraparaArquivo() + test.getMethodName() + "png" ;
	    Screenshot.tirar(driver, screenshotArquivo );
	    
	    	    			
	}


    @AfterClass
	public static void tearDownAfterClass() throws Exception {
	driver.quit();
	
	
}
    
}
		
	
	
	
	
	
	
	
	
	
