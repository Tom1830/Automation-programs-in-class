package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateToGoogle
{
public static void main(String[] args) 
{
     WebDriver driver=new EdgeDriver();
     driver.get("https://www.google.com/");
}
}
