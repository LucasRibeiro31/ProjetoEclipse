package MVP;

import static org.junit.Assert.assertEquals;

import java.util.Random;
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
import org.openqa.selenium.interactions.Actions;

import Pages.LoginPage;
import suporte.Generator;
import suporte.Screenshot;
import suporte.Web;
import suporte.WebAdm; 



public class admin_agentes_cadastrar_ {
	
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
			
			
			
			
			driver.findElement(By.linkText("Agentes")).click();
		    driver.findElement(By.linkText("Cadastrar")).click();
		    
		    		    	    
            Thread.sleep(1000);
		    		    
		    WebElement mensageminicial = driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/h2" ));
			String mensagem = mensageminicial.getText();
		    assertEquals("Informações Gerais do Agente", mensagem);
		    
		    		    
		    driver.findElement(By.xpath("//*[@formcontrolname='codigoB3']")).sendKeys(""+getDecimalRandomNumber());
		    
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/div[1]/div[2]/div/input")).sendKeys("Energia Teste");
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/div[1]/div[3]/div/input")).sendKeys("" +getValidaCNPJ()); // Campo CNPJ
		    
		    driver.findElement(By.cssSelector(".col-md-12 > .row:nth-child(2) > .col-md-4:nth-child(4) .form-control")).click();
		    {
		      WebElement dropdown = driver.findElement(By.cssSelector(".ng-dirty:nth-child(2)"));
		      dropdown.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/div[1]/div[4]/div/select/option[2]")).click();
		    }
		    driver.findElement(By.cssSelector(".ng-dirty:nth-child(2)")).click();
		    driver.findElement(By.cssSelector(".row:nth-child(3) > .col-md-12 > .row:nth-child(4)")).click();
		    driver.findElement(By.cssSelector(".row:nth-child(4) > .col-md-4:nth-child(7) .form-control")).click();
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/div[2]/div[1]/div/input")).sendKeys("Rua dos bares 450");
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/div[2]/div[2]/div/input")).sendKeys("05434-090");
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/div[2]/div[3]/div/input")).sendKeys("500");
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/div[2]/div[5]/div/input")).sendKeys("Vila Madalena");	  
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/div[2]/div[6]/div/input")).sendKeys("São Paulo"); 
		    
		    		    
		    {
		    	
		    WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/div[2]/div[7]/div/select"));
		      dropdown.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/div[2]/div[7]/div/select/option[26]")).click();
		    }
		    driver.findElement(By.cssSelector(".col-md-4:nth-child(7) .ng-dirty")).click();
		    driver.findElement(By.cssSelector(".row:nth-child(3) > .col-md-12 > .row:nth-child(4)")).click();
		    
		    // desmarcar esse campo abaixo caso o endereço de cobrança nao seja igual ao da sede
		    //   driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/div[3]/div[1]/div/div/input")).click();
		    
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/table/tbody/tr[1]/td[1]/input")).sendKeys("Energia teste");
		    
		    {
		    
		    WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/table/tbody/tr[1]/td[3]/select"));
		      dropdown.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/table/tbody/tr[1]/td[3]/select/option[33]")).click();
		    
		    }			 

		    		    
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/table/tbody/tr[1]/td[5]/input")).sendKeys("100");		    
		    
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/div[5]/div/div[1]/div[1]/div/input")).sendKeys("8");
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/div[5]/div/div[1]/div[2]/div/input")).sendKeys("8");
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/div[5]/div/div[1]/div[3]/div/input")).sendKeys("8");
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/div[5]/div/div[1]/div[4]/div/input")).sendKeys("8");
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/div[5]/div/div[1]/div[5]/div/input")).sendKeys("8");
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/div[5]/div/div[1]/div[6]/div/input")).sendKeys("2000");
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/div[5]/div/div[2]/div[1]/div/input")).sendKeys("8");
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/div[5]/div/div[2]/div[2]/div/input")).sendKeys("8");
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/div[5]/div/div[2]/div[4]/div/input")).sendKeys("8");
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/div[5]/div/div[2]/div[6]/div/input")).sendKeys("8");
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[1]/div/div[5]/div/div[2]/div[8]/div/input")).sendKeys("8");
		    
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[1]/div[2]/button[2]")).click();
		    
		 
		    // Tela de Informações do Agente
		    
		    driver.findElement(By.cssSelector(".col-md-12 > .row > .col-md-6:nth-child(1) .ng-untouched")).sendKeys("C30");
		    driver.findElement(By.cssSelector(".col-md-12 > .row > .col-md-6:nth-child(2) .ng-untouched")).click();
		    driver.findElement(By.cssSelector(".col-md-12 > .row > .col-md-6:nth-child(2) .ng-untouched")).sendKeys(""+getDecimalRandomNumber());
		    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .checkbox-spacing:nth-child(1)")).click();
		    driver.findElement(By.cssSelector(".checkbox-spacing:nth-child(3)")).click();
		    {
		      WebElement element = driver.findElement(By.cssSelector(".checkbox-spacing:nth-child(3)"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		    {
		      WebElement element = driver.findElement(By.tagName("body"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    driver.findElement(By.cssSelector(".col-md-6:nth-child(1) .ng-untouched")).click();
		    driver.findElement(By.cssSelector(".col-md-6:nth-child(1) .ng-untouched")).sendKeys("ab1");
		    driver.findElement(By.cssSelector(".col-md-6:nth-child(2) .ng-untouched")).click();
		    driver.findElement(By.cssSelector(".col-md-6:nth-child(2) .ng-untouched")).sendKeys(""+getDecimalRandomNumber());
		   
		    
		    {
		      WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/select"));
		      dropdown.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/select/option[2]")).click();
		    }
		    
		    		    
		    {
		      WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[2]/div[1]/div[2]/div/div/div[1]/div[4]/div/select"));
		      dropdown.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[2]/div[1]/div[2]/div/div/div[1]/div[4]/div/select/option[3]")).click();
		      
		    }
		    
		    
		    
		    {
		      WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[2]/div[1]/div[2]/div/div/div[1]/div[5]/div/select"));
		      dropdown.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[2]/div[1]/div[2]/div/div/div[1]/div[5]/div/select/option[4]")).click();
		    }
		    
		    Thread.sleep(1000);
		    
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[2]/div[1]/div[2]/div/div/div[1]/div[6]/table/thead/tr[1]/th[6]/fa-icon")).click();
		    
		    Thread.sleep(1000);
		   
		    {
		      WebElement dropdown = driver.findElement(By.cssSelector("td > .ng-dirty"));
		      dropdown.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[2]/div[1]/div[2]/div/div/div[1]/div[6]/table/tbody/tr/td[1]/select/option[1]")).click();
		    }
		    
		    driver.findElement(By.name("#")).sendKeys(""+getDecimalRandomNumber());
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[2]/div[1]/div[2]/div/div/div[1]/div[6]/table/tbody/tr/td[3]/input")).sendKeys("pr");
		    
		    {
		      WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[2]/div[1]/div[2]/div/div/div[1]/div[6]/table/tbody/tr/td[4]/select"));
		      dropdown.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[2]/div[1]/div[2]/div/div/div[1]/div[6]/table/tbody/tr/td[4]/select/option[2]")).click();
		    }
		    
		    
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[2]/div[1]/div[2]/div/div/div[1]/div[6]/table/tbody/tr/td[5]/input")).sendKeys("18000");
		    
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[2]/div[2]/button[3]")).click();
		    		
	    
		    
		 // tela de Informações do Diretor Responsável   
		    
		    
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[3]/div[1]/div/div/div[1]/div/input")).sendKeys("Rosie Klocko");
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[3]/div[1]/div/div/div[2]/div/input")).sendKeys("94885425352");
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[3]/div[1]/div/div/div[3]/div/input")).sendKeys("999999999");
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[3]/div[1]/div/div/div[4]/div/input")).sendKeys("sheldon62@yahoo.com");
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[3]/div[1]/div/div/div[5]/div/input")).sendKeys("3018933465");
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/div/div/form/div[3]/div[2]/button[3]")).click();
		    
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/button")).click();
		    
		    
		  
		    
		   String screenshotArquivo = "C:\\Users\\p-lucribeiro\\TestReport\\" + Generator.dataHoraparaArquivo() + test.getMethodName() + "png" ;
		   Screenshot.tirar(driver, screenshotArquivo );
	
	
}
	 
	
	

	
	
// Metodo para gerar CNPJ aleatorio

	private String getValidaCNPJ() {
				
	 

			 int digito1 = 0, digito2 = 0, resto = 0;
			 String  nDigResult;
			 String numerosContatenados;
			 String numeroGerado;

			 Random numeroAleatorio = new Random();


			  //numeros gerados
			 int n1 = numeroAleatorio.nextInt(10);
			 int n2 = numeroAleatorio.nextInt(10);
			 int n3 = numeroAleatorio.nextInt(10);
			 int n4 = numeroAleatorio.nextInt(10);
			 int n5 = numeroAleatorio.nextInt(10);
			 int n6 = numeroAleatorio.nextInt(10);
			 int n7 = numeroAleatorio.nextInt(10);
			 int n8 = numeroAleatorio.nextInt(10);
			 int n9 = numeroAleatorio.nextInt(10);
			 int n10 = numeroAleatorio.nextInt(10); 
			 int n11 = numeroAleatorio.nextInt(10); 
			 int n12 = numeroAleatorio.nextInt(10); 


			 int soma = n12*2 + n11*3 + n10*4 + n9*5 + n8*6 + n7*7 + n6*8 + n5*9 + n4*2 + n3*3 + n2*4 + n1*5;

			 int valor = (soma / 11)*11;

			 digito1 = soma-valor;

			  //Primeiro resto da divisão por 11.
			 resto = (digito1 % 11);

			 if(digito1 < 2){
			  digito1 = 0;
			 }
			 else {
			   digito1 = 11-resto;
			 }

			 int soma2 =  digito1*2 + n12*3 + n11*4 + n10*5 + n9*6 + n8*7 + n7*8 + n6*9 + n5*2 + n4*3 + n3*4 + n2*5 + n1*6 ;

			 int valor2 = (soma2 / 11)*11;

			 digito2 = soma2-valor2;

			  //Primeiro resto da divisão por 11.
			 resto = (digito2 % 11);

			 if(digito2 < 2){
			  digito2 = 0;
			 }
			 else {
			   digito2 = 11-resto;
			 }

			 //Conctenando os numeros
			 numerosContatenados = String.valueOf(n1) + String.valueOf(n2) +"."+ String.valueOf(n3) + String.valueOf(n4) +
			                       String.valueOf(n5) +"."+ String.valueOf(n6) + String.valueOf(n7) +String.valueOf(n8)+"/"+
			                       String.valueOf(n9) + String.valueOf(n10) + String.valueOf(n11) +
			                       String.valueOf(n12)+"-";

			 //Concatenando o primeiro resto com o segundo.
			  nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

			  numeroGerado = numerosContatenados+nDigResult;

			

			  return numeroGerado;
			}
			




	  
	// metodo para gerar numeros aleatorios  
		

		public long getDecimalRandomNumber() {
			Random rand = new Random();
			   return rand.nextInt();
	    
	    
		}
		
	       


		@AfterClass
		public static void tearDownAfterClass() throws Exception {
	 	driver.quit();

		
	  
			

		    
	
		
		}
	
	
	

}
