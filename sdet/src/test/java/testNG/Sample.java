package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample  extends Annotations
{
	@Test
	public void Sample1()
	{
		String actual="hello";
		String Expected="Hello";
		Assert.assertEquals(actual, Expected);
		System.out.println("Sample1");
	}
	
	@Test
	public void Sample2()
	{
		System.out.println("Sample2");
	}
}
