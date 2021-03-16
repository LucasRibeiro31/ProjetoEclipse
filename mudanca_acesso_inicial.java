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
import suporte.WebAdm;

public class mudanca_acesso_inicial {
	
static WebDriver driver; 
	
	@Rule
	public TestName test = new TestName();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		driver = Web.createChrome();
		
	
	}
	
	
	 @Test
		public void login2() throws InterruptedException {
		    
			driver.manage().window().setSize(new Dimension(1936, 1056));
			driver.findElement(By.id("USER")).sendKeys("u-edpc");
		    driver.findElement(By.id("PASSWORD")).sendKeys("q&Skt%JZ!M");
		    driver.findElement(By.id("btnSubmit")).click();
		    
		    Thread.sleep(1000);
		    
		    driver.findElement(By.id("uploadInput")).sendKeys("C:\\planilha upload\\PlanilhaEnergiaB3 - Upload_2021(new).xlsx");
		    driver.findElement(By.xpath("/html/body/app-root/div[1]/app-migracao/div/div[2]/div[2]/button")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("/html/body/app-root/div[1]/app-migracao/div/div[3]/div[2]/div[2]/button")).click();
		    Thread.sleep(2000);
		      		    
		    		    
		    driver.findElement(By.xpath("/html/body/app-root/div[1]/app-migracao/div/div[4]/button")).click();
		    
		    Thread.sleep(4000);
		    
		    driver.findElement(By.xpath("/html/body/modal-container/div/div/div[3]/button[2]")).click();
		  
		    		    
		   
		    Thread.sleep(1000);
		    
		    driver.quit();
	 }
		    
		    
	  @Test
		public void login3() throws InterruptedException {
		  
		    driver = WebAdm.createChrome();
		  
		   
			driver.manage().window().setSize(new Dimension(1936, 1056));
			driver.findElement(By.id("USER")).sendKeys("p-lucribeiro");
			driver.findElement(By.id("PASSWORD")).sendKeys("Primaver@37");
			driver.findElement(By.id("btnSubmit")).click();	  
			driver.findElement(By.linkText("Agentes")).click();
			driver.findElement(By.linkText("Perfis")).click();
			
			 WebElement mensageminicial = driver.findElement(By.xpath("/html/body/app-root/div/app-perfis/div/div/div/form/div/h2" ));
			 String mensagem = mensageminicial.getText();
			 assertEquals("Perfis de Acesso", mensagem);
			
			
			driver.findElement(By.cssSelector(".form-control")).click();
			    {
			      WebElement dropdown = driver.findElement(By.cssSelector(".form-control"));
			      dropdown.findElement(By.xpath("/html/body/app-root/div/app-perfis/div/div/div/form/div/div/div[1]/div/div[1]/div/select/option[2]")).click();
			    }
			driver.findElement(By.cssSelector(".form-control")).click();
			driver.findElement(By.cssSelector(".form-check:nth-child(1) > .form-check-input")).click();
			driver.findElement(By.cssSelector(".form-check:nth-child(2) > .form-check-input")).click();
			driver.findElement(By.cssSelector(".form-check:nth-child(1) > .form-check-input")).click();
			driver.findElement(By.cssSelector(".btn")).click();
			driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
			driver.findElement(By.cssSelector(".modal-footer > .btn")).click();
			 
	  

		    Thread.sleep(2000);
	        
		   		    
		    
		   String screenshotArquivo = "C:\\Users\\p-lucribeiro\\TestReport\\" + Generator.dataHoraparaArquivo() + test.getMethodName() + "png" ;
		   Screenshot.tirar(driver, screenshotArquivo );
	
	
}
	 

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
		driver.quit();

		
	  
			

		    
	
		
		}

	}

