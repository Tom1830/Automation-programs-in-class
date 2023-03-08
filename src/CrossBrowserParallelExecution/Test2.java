package CrossBrowserParallelExecution;

import org.testng.annotations.Test;

public class Test2 extends BaseClass
{

	@Test
	public void swiggytest()
	{
		
		driver.get("https://www.swiggy.com/");
	}

}
