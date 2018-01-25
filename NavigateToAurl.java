package study3;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class NavigateToAurl {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");

		driver.findElement(By.linkText("·Î±×ÀÎ")).click();
		driver.findElement(By.tagName("input")).sendKeys("ID");	
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(1500);
		driver.findElement(By.name("password")).sendKeys("PASSWORD");
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(2000);
		driver.get("https://mail.google.com/mail/?tab=wm");
		Thread.sleep(2000);
		driver.findElement(By.className("z0")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("vO")).sendKeys("Receiver_Email");
		driver.findElement(By.className("aoT")).sendKeys("TEST");
		Thread.sleep(1000);
		driver.findElement(By.className("Ap")).click();
		
		Actions a = new Actions(driver);
		a.sendKeys("Test")
		 .perform();
		
		driver.findElement(By.id(":5t")).click();
		
	}
}
