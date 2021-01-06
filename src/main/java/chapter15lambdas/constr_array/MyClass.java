package chapter15lambdas.constr_array;

import java.util.Arrays;

public class MyClass {
    public static void main(String[] args) {

        //creates constructor for String array
        MyArrayCreator <String[]> stringArrayConstr = String[]::new;

        //creates string array of size 10
        String[] strings = stringArrayConstr.func(10);

        System.out.println(Arrays.toString(strings));

        //creates constructor for int array
        MyArrayCreator <int[]> intArrayConstr = int[]::new;

        //creates string array of size 10
        int[] ints = intArrayConstr.func(10);

        System.out.println(Arrays.toString(ints));
    }
}
