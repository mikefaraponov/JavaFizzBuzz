import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class FizzBuzz {
    private final int begin;
    private final int end;

    public int getBegin() {
        return begin;
    }

    public int getEnd() {
        return end;
    }

    private FizzBuzz(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    public static FizzBuzz of(int begin, int end){
        return new FizzBuzz(begin, end);
    }

    public static String toFizzBuzz(int n){
        return n % 15 == 0? "FizzBuzz":
               n % 3 == 0? "Fizz":
               n % 5 == 0? "Buzz":
               Integer.toString(n);
    }

    public Stream<String> getFizzBuzzStream(){
        return IntStream.rangeClosed(begin, end)
                .mapToObj(FizzBuzz::toFizzBuzz);
    }

    public static void main(String[] args) {
        FizzBuzz.of(1, 100)
                .getFizzBuzzStream()
                .forEach(System.out::println);
    }

}
