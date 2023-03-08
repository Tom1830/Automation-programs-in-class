package GroupExecution;

import org.testng.annotations.Test;

public class Test1 
{
@Test(groups="sanity")
public void demo1()
{
	System.out.println("Test1 - demo1");
}

@Test(groups="smoke")
public void demo2()
{
	System.out.println("Test1 - demo2");
}

@Test(groups={"smoke","sanity"})
public void demo3()
{
	System.out.println("Test1 - demo3");
}

}
