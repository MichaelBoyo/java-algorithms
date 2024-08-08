package functionals;

import java.util.function.*;

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

        // a supplier is a functional interface that takes no arguments and returns a result
        Supplier<Integer> supplier = () -> 10;
        System.out.println(supplier.get());


        // a predicate is a functional interface that takes an argument and returns a boolean
        Predicate<Integer> isEven = i -> i % 2 == 0;

        System.out.println(isEven.test(10));


        // a unary operator is a functional interface that takes an argument and returns a result of the same type
        UnaryOperator<Integer> increment = i -> i + 1;
        System.out.println(increment.apply(10));



        // a binary operator is a functional interface that takes two arguments and returns a result of the same type
        // also, a binary operator is a specialization of a BiFunction
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(2, 3));


    }


}
