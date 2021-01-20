package factorialize;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorializeTest {

	@Test
	public void factorialOf5shouldReturn120() {
		int actual = new Factoralize().factorialize(5);
		int expected = 120;
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void factorialOf10shouldReturn3628800() {
		int actual = new Factoralize().factorialize(10);
		int expected = 3628800;
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void factorialOf1shouldReturn1() {
		int actual = new Factoralize().factorialize(1);
		int expected = 1;
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void factorialOf3shouldReturn6() {
		int actual = new Factoralize().factorialize(3);
		int expected = 6;
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void factorialOf7shouldReturn5040() {
		int actual = new Factoralize().factorialize(7);
		int expected = 5040;
		
		assertEquals(expected, actual);
		
	}
}
