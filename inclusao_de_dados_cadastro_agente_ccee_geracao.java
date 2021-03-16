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

public class inclusao_de_dados_cadastro_agente_ccee_geracao {
	
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
		    driver.findElement(By.linkText("Cadastro Agente CCEE")).click();
		    
 		    
		    Thread.sleep(1000);
		    
		    
		    WebElement mensageminicial = driver.findElement(By.xpath("/html/body/app-root/div/app-agentes-ccee/div/div/div/h2" ));
			String mensagem = mensageminicial.getText();
		    assertEquals("Cadastro Agente CCEE", mensagem);
		    
		    
		    		  
		    driver.findElement(By.xpath("/html/body/app-root/div/app-agentes-ccee/div/div/div/form/div/div[1]/div/input")).sendKeys("ABC");
		    driver.findElement(By.xpath("/html/body/app-root/div/app-agentes-ccee/div/div/div/form/div/div[2]/div/input")).sendKeys("Lucas Enterprise3");
		    driver.findElement(By.xpath("/html/body/app-root/div/app-agentes-ccee/div/div/div/form/div/div[3]/div/input")).sendKeys("46941121000139");
		    driver.findElement(By.xpath("/html/body/app-root/div/app-agentes-ccee/div/div/div/form/div/div[4]/div/div/input[3]")).click();
		    driver.findElement(By.cssSelector(".btn")).click();
		    driver.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/button[2]")).click();
		    driver.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/button")).click();
		   
			
			 

		    Thread.sleep(2000);
	        
		   		    
		    
		   String screenshotArquivo = "C:\\Users\\p-lucribeiro\\TestReport\\" + Generator.dataHoraparaArquivo() + test.getMethodName() + "png" ;
		   Screenshot.tirar(driver, screenshotArquivo );
	
	
}
	 

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
	 	driver.quit();

		
	  
			

		    
	
		
		}
	


}
