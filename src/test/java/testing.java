import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testing {

	public static String browser ="Edge";
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		if(browser.equals("Chrome")) {
			driver=new ChromeDriver();
			}
		if(browser.equals("Edge")) {
			driver=new EdgeDriver();
			}
		
		//WebDriverManager.chromedriver().setup();
		
		driver.get( " https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		WebElement a= driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		a.click();

		WebElement listofele=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div"));
		System.out.println(listofele);
		Thread.sleep(10000);
		driver.navigate().to("https://duckduckgo.com/");
		System.out.println(driver.findElement(By.id("searchbox_homepage")).getTagName());
		driver.navigate().to("https://www.sugarcrm.com/request-demo/");
		
		driver.findElement(By.className("btn btn-primary btn-lg mr-4")).click();
		WebElement drop=driver.findElement(By.id("how-select"));
		Select selected=new Select(drop);
		selected.selectByIndex(3);
		
		//driver.close();

	}

}
