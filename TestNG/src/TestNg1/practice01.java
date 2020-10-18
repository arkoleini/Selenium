package TestNg1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class practice01 {
	
	@Test
	public void methodtest1()
	{
		System.out.println("Test result for test ng");
		int result= addition (2,3);
		Assert.assertEquals(true, result=5);
	}
	
	public int addition(int a, int b)
	{
		return a+b;
	}

}
