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

import suporte.Generator;
import suporte.Screenshot;
import suporte.Web;

public class Teste_Logins {

static WebDriver driver; 
	
	@Rule
	public TestName test = new TestName();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		driver = Web.createChrome();
	}
	
	@Test
	public void login1() throws InterruptedException {
		
		driver.manage().window().setSize(new Dimension(1936, 1056));
		driver.findElement(By.id("USER")).sendKeys("U-FOX");
	    driver.findElement(By.id("PASSWORD")).sendKeys("jfkywvAi3#");
	    driver.findElement(By.id("btnSubmit")).click();
	    driver.findElement(By.cssSelector(".b3__btn-with-icon--left")).click();
	    driver.findElement(By.linkText("Sair")).click();
	    driver.findElement(By.id("btnEntrar")).click();
	    
		    	  
	    
	    Thread.sleep(1000);
	   	    
	    	}
	    
    @Test
	public void login2() throws InterruptedException {
	    driver.get("https://energia-qaa.internalenv.corp/Login/index.fcc?TYPE=33554433&REALMOID=06-0005719e-805a-1ecd-995d-69db0a020000&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-EK0WfBhPptl3Q1XeY0mIZgvHozHSf%2bq1E01p3O0cerru1Ap6G9KqpIF7MXEzNk2V&TARGET=-SM-https%3a%2f%2fenergia--qaa%2einternalenv%2ecorp%2fmle%2f#/");
		driver.manage().window().setSize(new Dimension(1936, 1056));
		driver.findElement(By.id("USER")).sendKeys("u-edpc");
	    driver.findElement(By.id("PASSWORD")).sendKeys("q&Skt%JZ!M");
	    driver.findElement(By.id("btnSubmit")).click();
	    driver.findElement(By.cssSelector(".b3__btn-with-icon--left")).click();
	    driver.findElement(By.linkText("Sair")).click();
	    driver.findElement(By.id("btnEntrar")).click();
	    
	    Thread.sleep(1000);
	    
	               
      
	      	  
	    	 	    
    }
	    
    @Test
	public void login3() throws InterruptedException {
	    driver.get("https://energia-qaa.internalenv.corp/Login/index.fcc?TYPE=33554433&REALMOID=06-0005719e-805a-1ecd-995d-69db0a020000&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-EK0WfBhPptl3Q1XeY0mIZgvHozHSf%2bq1E01p3O0cerru1Ap6G9KqpIF7MXEzNk2V&TARGET=-SM-https%3a%2f%2fenergia--qaa%2einternalenv%2ecorp%2fmle%2f#/");
		driver.manage().window().setSize(new Dimension(1936, 1056));
		driver.findElement(By.id("USER")).sendKeys("u-pedacinho");
	    driver.findElement(By.id("PASSWORD")).sendKeys("xRZ!vDd2co");
	    driver.findElement(By.id("btnSubmit")).click();	
	    driver.findElement(By.cssSelector(".b3__btn-with-icon--left")).click();
	    driver.findElement(By.linkText("Sair")).click();
	    driver.findElement(By.id("btnEntrar")).click();
	    
	    
	
	    Thread.sleep(2000);
	}
	
    
	public void login4() throws InterruptedException {
	    driver.get("https://energia-qaa.internalenv.corp/Login/index.fcc?TYPE=33554433&REALMOID=06-0005719e-805a-1ecd-995d-69db0a020000&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-EK0WfBhPptl3Q1XeY0mIZgvHozHSf%2bq1E01p3O0cerru1Ap6G9KqpIF7MXEzNk2V&TARGET=-SM-https%3a%2f%2fenergia--qaa%2einternalenv%2ecorp%2fmle%2f#/");
		driver.manage().window().setSize(new Dimension(1936, 1056));
		driver.findElement(By.id("USER")).sendKeys("u-vmz");
	    driver.findElement(By.id("PASSWORD")).sendKeys("h$XG#yvszb");
	    driver.findElement(By.id("btnSubmit")).click();	 
	   
    
	    Thread.sleep(2000);
    
    }
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	driver.quit();

	
	
	}

}


	
	
	