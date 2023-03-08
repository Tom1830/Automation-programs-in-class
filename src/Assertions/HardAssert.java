package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert 
{
@Test
public void demo()
{
	int a=70;
	int b=20;
	
	int result=a+b;
	
	Assert.assertEquals(result,70);
	System.out.println(a);
	System.out.println(b);
	System.out.println(result);
}
}
