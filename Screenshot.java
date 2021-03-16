package suporte;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public static void tirar(WebDriver driver, String arquivo) {
		File Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			org.openqa.selenium.io.FileHandler.copy(Screenshot, new File(arquivo));
		} catch (Exception e) { 
			System.out.println("houveram problemas ao copiar o arquivo para a pasta: " + e.getMessage());
		}
	}


}

	
	