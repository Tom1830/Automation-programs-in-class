package Assertions;

import org.testng.annotations.Test;

public class WhyNotIfElse 
{
	@Test
public void demo1()
{
	int a = 70;
	int b= 20;
	
	int result=a+b;
	if(result==50)
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
}
