import org.junit.Test;
import org.testng.annotations.BeforeTest;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void of() throws Exception {
        FizzBuzz obj = FizzBuzz.of(1, 100);
        assertEquals(obj.getBegin(), 1);
        assertEquals(obj.getEnd(), 100);
    }

    @Test
    public void testOfMethodSequenceOfArgumentsException() {
        try {
            FizzBuzz obj = FizzBuzz.of(100, 1);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "End number should be greater then begin number");
        }
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

    @Test
    public void getFizzBuzzStream() throws Exception {
        String expected = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz";
        String result = FizzBuzz.of(1, 15)
                .getFizzBuzzStream()
                .collect(Collectors.joining(" "));

        assertEquals(result, expected);
    }
}