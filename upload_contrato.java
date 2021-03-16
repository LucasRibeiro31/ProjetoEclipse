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

public class upload_contrato {

static WebDriver driver; 
	
	@Rule
	public TestName test = new TestName();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		driver = Web.createChrome();
	
	
		
	}

	@Test
	public void test() throws InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		login.TypeUsername();
		login.TypePassword();
		login.clickOnLoginButton();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath ("/html/body/app-root/div[1]/header/div/nav/ul/li[3]/a/span[2]" )).click();
	    driver.findElement(By.cssSelector(".nav-item:nth-child(3) .b3__sidenav__menu-item")).click();
	    driver.findElement(By.cssSelector(".b3__form-file > label")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("uploadInput")).sendKeys("C:\\planilha upload\\PlanilhaEnergiaB3 - Upload_2021.xlsx");
	    driver.findElement(By.cssSelector(".col-sm-3 > .btn")).click();
	    
	    Thread.sleep(4000);
	   		    	    
	    String screenshotArquivo = "C:\\Users\\p-lucribeiro\\TestReport\\" + Generator.dataHoraparaArquivo() + test.getMethodName() + "png" ;
	    Screenshot.tirar(driver, screenshotArquivo );
	    
	      	
	}

		
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
//	driver.quit();

	
	
	}

}
	
	
	
	
	
	
	

