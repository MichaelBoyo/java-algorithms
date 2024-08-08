package functionals;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Functionals {
    public static void main(String[] args) {
        // a bifunction is a functional interface that takes two arguments and returns an integer
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(2, 3));


        // a function is a functional interface that takes an argument and returns a result
        Function<Integer, Integer> square = a -> a * a;
        square.apply(38);
        // a consumer is a functional interface that takes an argument and returns nothing
        Consumer<Integer> consumer = a -> System.out.println(a);
        consumer.accept(10);

    }


}
