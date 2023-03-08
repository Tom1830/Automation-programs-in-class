package TestNg;

import org.testng.annotations.Test;

public class InvocationCount
{
	@Test(invocationCount=2)
	public void test1()
	{
		System.out.println("demo1");
	}
	@Test(invocationCount=3)
	public void test2()
	{
		System.out.println("demo1");
	}
	@Test(invocationCount=1)
	public void test3()
	{
		System.out.println("demo1");
	}
	@Test(invocationCount=0)
	public void test4()
	{
		System.out.println("demo1");
	}
	@Test(invocationCount=-3)
	public void test5()
	{
		System.out.println("demo1");
	}
}

