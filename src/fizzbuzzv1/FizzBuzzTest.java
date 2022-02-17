package fizzbuzzv1;




import junit.framework.TestCase;

public class FizzBuzzTest extends TestCase {

	public void testFizzBuzzImplementation() {
	
		assertEquals("1",FizzBuzz.fizzBuzzImplementation(1) );
		assertEquals("fizz",FizzBuzz.fizzBuzzImplementation(3) );
		assertEquals("buzz",FizzBuzz.fizzBuzzImplementation(5) );
		assertEquals("fizzbuzz",FizzBuzz.fizzBuzzImplementation(15) );
	}

}
