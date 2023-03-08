package GroupExecution;

import org.testng.annotations.Test;

public class Test2 
{
	@Test(groups="system")
	public void demo1()
	{
		System.out.println("Test2 - demo1");
	}

	@Test(groups="Regression")
	public void demo2()
	{
		System.out.println("Test2 - demo2");
	}

	@Test(groups={"system","Regression"})
	public void demo3()
	{
		System.out.println("Test2 - demo3");
	}

}
