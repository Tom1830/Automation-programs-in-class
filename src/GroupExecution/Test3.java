package GroupExecution;

import org.testng.annotations.Test;

public class Test3
{
	@Test(groups="smoke")
	public void demo1()
	{
		System.out.println("Test3 - demo1");
	}

	@Test(groups="system")
	public void demo2()
	{
		System.out.println("Test3 - demo2");
	}

	@Test(groups={"smoke","sanity","system","Regression"})
	public void demo3()
	{
		System.out.println("Test3 - demo3");
	}

}
