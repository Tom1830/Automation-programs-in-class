package WebDriver;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class launchbrowseruserdefined 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=null;
		EdgeDriver driver1=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("select browser");
		String browser = sc.next();
		 
		if(browser.equals("chrome"))
				driver=new ChromeDriver();
		else if(browser.equals("edge"))
		driver1=new EdgeDriver();
		else
			System.out.println("invalid input");
			
		
	}
}

