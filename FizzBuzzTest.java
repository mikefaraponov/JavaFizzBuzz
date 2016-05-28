import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void of() throws Exception {
        FizzBuzz obj = FizzBuzz.of(1, 100);
        assertEquals(obj.getBegin(), 1);
        assertEquals(obj.getEnd(), 100);
    }

    @Test
    public void toFizzBuzz() throws Exception {
        assertEquals("1", FizzBuzz.toFizzBuzz(1));
        assertEquals("Fizz", FizzBuzz.toFizzBuzz(3));
        assertEquals("Buzz", FizzBuzz.toFizzBuzz(5));
        assertEquals("FizzBuzz", FizzBuzz.toFizzBuzz(15));
        assertNotEquals("100", FizzBuzz.toFizzBuzz(100));
        assertEquals("Buzz", FizzBuzz.toFizzBuzz(100));
    }
}