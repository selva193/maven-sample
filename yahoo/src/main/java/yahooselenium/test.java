package yahooselenium;

import javax.naming.ldap.ExtendedRequest;

import org.checkerframework.checker.index.qual.EnsuresLTLengthOf.List;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;



public class test {




	public static void main(String[] args) 
	{
	
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selva\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
				//driver.get("https://www.google.com");
				driver.get("https://mypassword-q.lilly.com");
				skm.loginuser(driver).sendKeys("FGP4264");
				skm.sumbit(driver).click();

}
}
	