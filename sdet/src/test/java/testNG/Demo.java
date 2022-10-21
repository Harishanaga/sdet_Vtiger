package testNG;

import org.testng.annotations.Test;

public class Demo 
{
	
	@Test(priority=2)
	public void A()
	{
		System.out.println("A");
	}
	
	@Test(dependsOnMethods="A")
	public void a()
	{
		System.out.println("a");
	}
	
	@Test(dependsOnMethods="a")
	public void demo1()
	{
		System.out.println("demo1");
	}
	
	@Test(priority=1,dependsOnMethods="A")
	public void Demo2()
	{
		System.out.println("Demo2");
	}
}
