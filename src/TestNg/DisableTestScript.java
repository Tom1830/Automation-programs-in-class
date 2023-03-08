package TestNg;

import org.testng.annotations.Test;

public class DisableTestScript 
{
	@Test(enabled=false)
	public void test1()
	{
		System.out.println("demo1");
	}
	@Test(invocationCount=3)
	public void test2()
	{
		System.out.println("demo2");
	}
	@Test(enabled=true)
	public void test3()
	{
		System.out.println("demo3");
	}
}
