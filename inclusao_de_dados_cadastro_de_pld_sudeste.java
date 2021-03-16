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
import suporte.WebAdm;

public class inclusao_de_dados_cadastro_de_pld_sudeste {
	
	
static WebDriver driver; 
	
	@Rule
	public TestName test = new TestName();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		driver = WebAdm.createChrome();
	
	}
	
		 
		    
	  @Test
		public void login() throws InterruptedException {
		    
		    LoginPage login = new LoginPage(driver);
			
			login.TypeUsernameAdm();;
			login.TypePasswordAdm();
			login.clickOnLoginButton();
		  
		  
			driver.findElement(By.id("navbarDropdownMenuLink")).click();
			driver.findElement(By.linkText("Cadastro de PLD")).click();
			
			 Thread.sleep(1000);  
			
			
			 WebElement mensageminicial = driver.findElement(By.xpath("/html/body/app-root/div/app-pld/div/div/div[1]/h2" ));
			 String mensagem = mensageminicial.getText();
			 assertEquals("Cadastro de PLD", mensagem);
			    
			
			
			 driver.findElement(By.xpath("/html/body/app-root/div/app-pld/div/div/div[1]/form/div/div[1]/div/div/input")).click(); // mes 04
			 driver.findElement(By.xpath("/html/body/bs-datepicker-container/div/div/div/div/bs-month-calendar-view/bs-calendar-layout/div[2]/table/tbody/tr[2]/td[2]")).click(); // mes 05
			
			    {
			      WebElement dropdown = driver.findElement(By.cssSelector(".form-group > .form-control"));
			      dropdown.findElement(By.xpath("/html/body/app-root/div/app-pld/div/div/div[1]/form/div/div[2]/div/select/option[4]")).click();
			    }
			    
				   Thread.sleep(2000);    
			    
			driver.findElement(By.xpath("/html/body/app-root/div/app-pld/div/div/div[2]/form/div[1]/table/tbody/tr[22]/td[2]/input")).sendKeys("R$ 125");
			driver.findElement(By.xpath("/html/body/app-root/div/app-pld/div/div/div[2]/form/div[1]/table/tbody/tr[23]/td[2]/input")).sendKeys("R$ 145");
			
			 Thread.sleep(1000);  
			
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
