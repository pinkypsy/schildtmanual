package chapter29streams.reduction1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
//                Arrays.asList(7, 2, 1, 12, 1, 3));//multiplicationOfEven test
                Arrays.asList(7, 18, 10, 24, 17, 5));

        multiplicationExample(list);
        multiplicationOfEven(list);
    }

    static void multiplicationExample(List<Integer> list) {
        Optional<Integer> productOpt = list.stream().reduce((a, b) -> a * b);
        if (productOpt.isPresent()) {
            System.out.println("As optional: " + productOpt.get());
            int result = list.stream().reduce(1, (a, b) -> a * b);
            System.out.println("As int: " + result);
        }
    }

    static void multiplicationOfEven(List<Integer> list) {
        int result = list.stream().reduce(1, (a, b) -> {
            if (b % 2 == 0){
                return a * b;
            }else {
                return a;
            }
        });

        System.out.println("Multiplication Of Even: " + result);
    }
}
