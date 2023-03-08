package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.google.com/");
      Thread.sleep(3000);
     driver.navigate().to("https://www.facebook.com/");
	}

}
