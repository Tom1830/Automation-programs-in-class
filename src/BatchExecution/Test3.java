package BatchExecution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3
{
	@Test
	public void demo1()
	{
		System.out.println("Test3 - demo1");
	}

	@Test
	public void demo2()
	{
		System.out.println("Test3 - demo2");
		//Assert.fail();
	}

	@Test
	public void demo3()
	{
		System.out.println("Test3 - demo3");
	}

}
