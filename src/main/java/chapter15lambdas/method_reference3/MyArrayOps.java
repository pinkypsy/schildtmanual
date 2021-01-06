package chapter15lambdas.method_reference3;

public class MyArrayOps {
    static <T> int countMatching(T[] vals, T v){
        int count = 0;

        for (int i = 0; i < vals.length; i++) {
//            if (vals[i] == (v)) {
            if (vals[i].equals(v)) {
                count++;
            }
        }
        return count;
    }
}
