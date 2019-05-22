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
	public void test() {
		FizzBuzz b = new FizzBuzz();
		String result = b.buzzzz(3);
		assertEquals("fizz",result);
	}

}
