package yahooselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class skm {

	
	public static WebElement loginuser(WebDriver driver)
	{
		return driver.findElement(By.name("USER_IDENT"));
		  	}
public static WebElement sumbit(WebDriver driver) 
{
	return driver.findElement(By.name("SUBMIT-TOKENS.x"));
}


	}

