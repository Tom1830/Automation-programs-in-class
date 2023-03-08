package Popups;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleNotification {

	public static void main(String[] args) throws InterruptedException {
		
		HashMap<String,Integer> contentsettings=new HashMap<>();
		contentsettings.put("geolocation",1);
		
		HashMap<String,Object> profile=new HashMap<>();
		profile.put("managed_default_content_settings",contentsettings);
		
		HashMap<String,Object> preference=new HashMap<>();
		preference.put("profile", profile);
		
		ChromeOptions Options = new ChromeOptions();
		Options.setExperimentalOption("prefs",preference);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		Thread.sleep(2000);
		
		
		
		
		
		
		
	}

}
