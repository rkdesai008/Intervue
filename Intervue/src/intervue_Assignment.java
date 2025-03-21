import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class intervue_Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				//used thread.sleep() method to show step by step execution
				
				//Open the Browser
				WebDriver driver= new ChromeDriver();
				//Maximize the window
				driver.manage().window().maximize();
				//Open url
				driver.get("https://www.intervue.io/");
				//Click on login button
				driver.findElement(By.xpath("//div/div/a[2]/span")).click();
				//for switching the control to new tab 
				Set<String> win = driver.getWindowHandles();
				 for(String wins:win) {
					 driver.switchTo().window(wins);
				 }
				 //System.out.println(win);
				 
				 //click on Login for Companies
				driver.findElement(By.xpath("(//div/div/div/div/div/a/div)[13]")).click();
				// Email
				driver.findElement(By.id("login_email")).sendKeys("neha@intervue.io");
				//Password
				driver.findElement(By.id("login_password")).sendKeys("Neha@intervue@123");
				Thread.sleep(2000);
				//Click on login button
				driver.findElement(By.xpath("//div/form/div[4]/div/div/span/button")).click();
				Thread.sleep(5000);
				//click on Search tab
				driver.findElement(By.xpath("(//div/div[2]/div/span/div)[1]")).click();
				//Search any data
				driver.findElement(By.xpath("//div/div/div/input")).sendKeys("Hello");
				Thread.sleep(2000);
				//click on related search data
				driver.findElement(By.xpath("//span[starts-with(text(),'Hello')]")).click();
				Thread.sleep(2000);
				//click on the dropdown for Logout
				driver.findElement(By.xpath("//div/div[2]/div[2]/div/div/i")).click();
				Thread.sleep(3000);

				//logout
				driver.findElement(By.linkText("Logout")).click();
				//closing the browser
				driver.quit();

			}

		


	}


