import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class FizzBuzz {
    private final int begin;
    private final int end;

    /**
     * begin setter
     * @return value of begin instance variable
     */
    public int getBegin() {
        return begin;
    }

    /**
     * end setter
     * @return value of end instance variable
     */
    public int getEnd() {
        return end;
    }

    /**
     * FizzBuzz constructor
     * @param begin start value of int range
     * @param end last value of int range
     */
    private FizzBuzz(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    /**
     * Factory which creates FizzBuzz objects
     * @param begin start value of int range
     * @param end last value of int range
     * @return FizzBuzz Object
     */
    public static FizzBuzz of(int begin, int end) {
        if(begin > end) {
            throw new IllegalArgumentException("End number should be greater then begin number");
        }
        return new FizzBuzz(begin, end);
    }

    /**
     * FizzBuzz converter
     * @param n input number
     * @return string with
     * Fizz if number is divided by 3, Buzz if number is divided by 5, FizzBuzz if number is divided by 15
     * or current number
     */
    public static String toFizzBuzz(int n) {
        String test = "";
        test += (n % 3) == 0 ? "Fizz" : "";
        test += (n % 5) == 0 ? "Buzz" : "";
        return !test.isEmpty() ? test : Integer.toString(n);
    }

    /**
     * @return stream with strings which was converted from IntStream by toFizzBuzz method
     */
    public Stream<String> getFizzBuzzStream() {
        return IntStream
                .rangeClosed(begin, end)
                .mapToObj(FizzBuzz::toFizzBuzz);
    }

    public static void main(String[] args) {
        FizzBuzz.of(1, 100)
                .getFizzBuzzStream()
                .forEach(System.out::println);
    }

}
