package TestNG_Group;

import org.testng.annotations.Test;

public class Sample1 {

	@Test
	public void demo1() {
		System.out.println("Hi demo1");
	}
	@Test(groups="smoke")
	public void demo2() {
		System.out.println("Hi demo2");
	}
	
	@Test
	public void demo3() {
		System.out.println("Hi demo3");
	}
	
}
