package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserts

{
	@Test
	public void demo()
	{
		int a=70;
		int b=20;
		
		int result=a+b;
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(result,70);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(result);
		
		soft.assertAll();
		
	}
}
