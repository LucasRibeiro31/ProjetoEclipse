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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import suporte.Generator;
import suporte.Screenshot;
import suporte.Web;

public class dashboard_baixar_dados_xls {

static WebDriver driver; 
	
	@Rule
	public TestName test = new TestName();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = Web.createChrome();
	
	}
	
	@Test
	public void login1() throws InterruptedException {
		
	    		
		LoginPage login = new LoginPage(driver);
		
		login.TypeUsername();
		login.TypePassword();
		login.clickOnLoginButton();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.cssSelector(".icon-button")).click();
	    driver.findElement(By.cssSelector(".modal-body .form-check:nth-child(2) > .form-check-label")).click();
	    driver.findElement(By.id("button-download-files")).click();
	    
	    Thread.sleep(5000);
	    
	    	        
	     WebElement mensageminicial = driver.findElement(By.xpath("/html/body/app-root/div[2]/app-dashboard/div[1]/h4" ));
	    String mensagem = mensageminicial.getText();
	    assertEquals("Posição Consolidada", mensagem);
	    
	    Thread.sleep(2000);
	    	    
	    String screenshotArquivo = "C:\\Users\\p-lucribeiro\\TestReport\\" + Generator.dataHoraparaArquivo() + test.getMethodName() + "png" ;
	    Screenshot.tirar(driver, screenshotArquivo );
	    
	    
	    			
	}


    @AfterClass
	public static void tearDownAfterClass() throws Exception {
	driver.quit();
	
	
}
	
	
	
}
