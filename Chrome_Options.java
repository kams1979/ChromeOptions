package ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Options {
	public static void main(String[] args) {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("New Tab","New window");
		WebDriver driver =new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}

}
