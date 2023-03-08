package WindowManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinimizeWindow {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
        driver.manage().window().minimize();
	}

}
