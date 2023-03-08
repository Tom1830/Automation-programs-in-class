package Annotaions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass 
{
    @BeforeSuite
    public void SuiteConfiguration() 
    {
	System.out.println("@BeforeSuite");
    }
    
    @BeforeTest
    public void TestConfiguration() 
    {
	System.out.println("@BeforeTest");
    }
    
    @BeforeClass
    public void ClassConfiguration() 
    {
	System.out.println("@BeforeClass");
    }
    
    @BeforeMethod
    public void MethodConfiguration() 
    {
	System.out.println("@BeforeMethod");
    }
    
    @AfterMethod
    public void methodTeardown() 
    {
	System.out.println("@AfterMethod");
    }
    
    @AfterClass
    public void ClassTeardown() 
    {
	System.out.println("@AfterClass");
    }
    
    @AfterTest
    public void TestTeardown() 
    {
	System.out.println("@AfterTest");
    }
    
    @AfterSuite
    public void SuiteTeardown() 
    {
	System.out.println("@AfterSuite");
    }
    
    
}
