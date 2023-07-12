package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
  public static void main(String[] args) {
	
	  Scanner ui =  new Scanner(System.in);
	  
	  WebDriver driver = new ChromeDriver(); // this is polymorphisme concept ; superclass and 

  driver.get("https://www.google.com/");
  driver.manage().window().maximize();
 driver.findElement(By.name("q")).sendKeys("java");
 driver.close();
  }
} 