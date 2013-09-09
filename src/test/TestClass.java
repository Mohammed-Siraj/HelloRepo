package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestClass {

	@Before
	public void Beforetest() {
		System.out.print("\n" + "This is before test Test Test");
		
	}
	
	@After
	public void Aftertest() {
		System.out.print("\n" + "This is After test");
		
	}
	
	@Test
	public void test() {
		System.out.print("\n" + "This is Test test");
		
	}
}
