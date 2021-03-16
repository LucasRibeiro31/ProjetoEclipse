package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
	WebDriver driver;
	
	
	By username = By.id("USER");
	By password = By.id("PASSWORD");
	By loginButton = By.xpath("//*[@id=\"btnSubmit\"]");
	
	

	
	public LoginPage (WebDriver driver)
{
        this.driver = driver;

}


public void TypeUsername()
{


	driver.findElement(username).sendKeys("u-fox");
}




public void TypePassword()
{


	driver.findElement(password).sendKeys("jfkywvAi3#");
}


public void clickOnLoginButton()
{

	driver.findElement(loginButton).click();

}


//metodo para usar na pagina Adm



public void TypeUsernameAdm()
{


	driver.findElement(username).sendKeys("p-lucribeiro");
}


public void TypePasswordAdm()
{


	driver.findElement(password).sendKeys("Primaver@37");
}


public void clickOnLoginButtonAdm()
{

	driver.findElement(loginButton).click();

}

}



