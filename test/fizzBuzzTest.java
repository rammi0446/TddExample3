import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class fizzBuzzTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDivisbleBy3() {
		FizzBuzz b = new FizzBuzz();
		String result = b.buzzzz(27);
		assertEquals("fizz",result);
	}
	
	@Test
	public void testDivisbleBy5() {
		FizzBuzz b = new FizzBuzz();
		String result = b.buzzzz(25);
		assertEquals("buzz",result);
	}
	

}
