package CrossBrowserParallelExecution;

import org.testng.annotations.Test;

public class Test1 extends BaseClass 

{

	@Test
	public void googletest()
	{
		
		driver.get("https://www.google.com/");
	}
}
