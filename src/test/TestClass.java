package test;

import java.io.IOException;
import java.util.ArrayList;

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
		try {
			 Runtime.getRuntime().exec("sh /opt/test.sh");
			 
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Hi");
		arr.add("Hello");
		arr.add("How are you");
		arr.add("I am fine");
		arr.add("What about you");
		System.out.print("\n" + arr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
