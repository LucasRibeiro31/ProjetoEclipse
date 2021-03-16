package MVP;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
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
import suporte.WebAdm;

public class inclusao_de_dados_cadastro_agente_ccee_comercializacao_e_geracao {
	
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
			
		    
		
		    driver.findElement(By.xpath("/html/body/app-root/div/app-agentes-ccee/div/div/div/form/div/div[1]/div/input")).sendKeys(""+getDecimalRandomNumber());
		    driver.findElement(By.xpath("/html/body/app-root/div/app-agentes-ccee/div/div/div/form/div/div[2]/div/input")).sendKeys(""+GetRandomString());
		    driver.findElement(By.xpath("/html/body/app-root/div/app-agentes-ccee/div/div/div/form/div/div[3]/div/input")).sendKeys("" +getValidaCNPJ()); // Campo CNPJ
		    driver.findElement(By.cssSelector(".checkbox-spacing:nth-child(1)")).click();
		    driver.findElement(By.xpath("/html/body/app-root/div/app-agentes-ccee/div/div/div/form/div/div[4]/div/div/input[3]")).click();
		    driver.findElement(By.cssSelector(".btn")).click();
		    driver.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/button[2]")).click();
		    driver.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/button")).click();
		    
		    
		   
		    Thread.sleep(2000);
	        
		   		    
		    
		   String screenshotArquivo = "C:\\Users\\p-lucribeiro\\TestReport\\" + Generator.dataHoraparaArquivo() + test.getMethodName() + "png" ;
		   Screenshot.tirar(driver, screenshotArquivo );
		   
		}
		   
	  

	  
	  // Metodo para gerar String aleatoria
	  
	  public String GetRandomString() {
		  Random ran = new Random();
		  int top = 3;
		  char data = ' ';
		  String dat = "";

		  for (int i=0; i<=top; i++) {
		    data = (char)(ran.nextInt(25)+97);
		    dat = data + dat;
		  }
		return dat;
		  
	  }
		
	


	// metodo para gerar numeros aleatorios  
		

			public long getDecimalRandomNumber() {
				Random rand = new Random();
				   return rand.nextInt();
		    
		    
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
			
			
			
			
	
	

	 

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
		driver.quit();

		
	  
			

		    
	
		
		}

}
