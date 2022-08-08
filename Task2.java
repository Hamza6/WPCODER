//To run this script you did to install eclipse, selenium webdrives and webdriver geckodriver.exe
package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;

public class TestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
	        "C:\\Users\\hamza.subhani\\Desktop\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		Thread.sleep(1000);

		driver.get("http://automationpractice.com/index.php");

		// LoginTest

		driver.findElement(By.className("login")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("email_create")).sendKeys("hamzasubhani03@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("id_gender")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.id("customer_firstname")).sendKeys("Deja");
		Thread.sleep(1000);
		driver.findElement(By.id("customer_lastname")).sendKeys("Etheridge");
		Thread.sleep(1000);
		driver.findElement(By.id("passwd")).sendKeys("Test_123");
		Thread.sleep(1000);
		driver.findElement(By.id("days")).sendKeys("5");
		Thread.sleep(1000);
		driver.findElement(By.id("months")).sendKeys("11");
		Thread.sleep(1000);
		driver.findElement(By.id("years")).sendKeys("1953");
		Thread.sleep(1000);
		//driver.findElement(By.id("firstname")).sendKeys("");
		//Thread.sleep(1000);
		//driver.findElement(By.id("lastname")).sendKeys("");
		//Thread.sleep(1000);
		driver.findElement(By.id("address1")).sendKeys("1311 Nelson Street Big Trout Lake, ON P0V 1G0");
		Thread.sleep(1000);
		driver.findElement(By.id("city")).sendKeys("ON");
		Thread.sleep(1000);
		driver.findElement(By.id("id_state")).sendKeys("Kentuty");
		Thread.sleep(1000);
		driver.findElement(By.id("postcode")).sendKeys("13110");
		Thread.sleep(1000);
		driver.findElement(By.id("id_country")).sendKeys("United States");
		Thread.sleep(1000);
		driver.findElement(By.id("phone_mobile")).sendKeys("807-537-6174");
		Thread.sleep(1000);
		driver.findElement(By.id("alias")).sendKeys("1311 Nelson Street Big");
		Thread.sleep(1000);
		driver.findElement(By.id("submitAccount")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("cgv")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		if (driver.getCurrentUrl().equalsIgnoreCase("https://stagingweb.myhelpp.com/login")) {
//			System.out.println("Test Pass");
//			Thread.sleep(10000);
//			driver.quit();
//		} else {
//			System.out.println("Test Failed");
//			driver.quit();
//		}

	}

}
