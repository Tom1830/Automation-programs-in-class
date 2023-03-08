package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTitleAndUrlIcc {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icc-cricket.com/");
        String title= driver.getTitle();
        String url=driver.getCurrentUrl();
        
        System.out.println(title+ "\n" +url);
	}

}
