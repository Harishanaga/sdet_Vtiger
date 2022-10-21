package testNG;

import org.testng.annotations.Test;

public class groupsflag2 {
	@Test(groups="smoke")
	public void smoke()
	{
		System.out.println("smoke2");
	}
	
	@Test(groups="regression")
	public void regression() {
		System.out.println("regression2");
	}
	
	@Test(groups="integration")
	public void integration()
	{
		System.out.println("Integration2");
	}
}
