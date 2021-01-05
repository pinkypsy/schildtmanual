package chapter15lambdas.method_reference1;

public class MyStringOps {
    static String stringReverse(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
