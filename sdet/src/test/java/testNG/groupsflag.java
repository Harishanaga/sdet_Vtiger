package testNG;

import org.testng.annotations.Test;

public class groupsflag {

	@Test(groups="smoke")
	public void smoke()
	{
		System.out.println("smoke1");
	}
	
	@Test(groups="regression")
	public void regression() {
		System.out.println("regression1");
	}
	
	@Test(groups="integration")
	public void integration()
	{
		System.out.println("Integration1");
	}
}
