package chapter15lambdas.method_reference3;

import java.util.Optional;
import java.util.stream.Stream;

public class GenericMethodRefDemo {
    private static <T> int myOp(MyFunc<T> f, T[] vals, T val) {
        return f.func(vals, val);
    }

    public static void main(String[] args) {
        Integer[] integers = { 1, 2, 3, 1, 1, 4, 5, 6, 4, 2, 1 };
        String[] strings = { "One", "Two", "Three", "Two" };
        int count;

        count = myOp(MyArrayOps::<Integer>countMatching, integers, 1);
        System.out.println("there are " + count + " 1's");

        count = myOp(MyArrayOps::<String>countMatching, strings,
                new String("Two"));
        System.out.println("there are " + count + " Two's");

/*        Stream<String> wordsStream = Stream.of("папа", "мама", "мыла", "раму");
        Optional<String> sentence =
                wordsStream.reduce((x,y)->x.toUpperCase() + " " + y);
//        wordsStream.reduce((y,x)->x.toUpperCase() + " " + y);
        String s = sentence.orElse("bub");
        System.out.println(s);*/
    }
}

