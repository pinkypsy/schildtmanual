package chapter15lambdas.method_reference1;

public class Main {

    static String stringOp(StringFunc stringFunc, String s){
        return stringFunc.func(s);
    }

    public static void main(String[] args) {
               System.out.println(MyStringOps.stringReverse("salo"));
        String strIn = "classes";
        String strOut = stringOp(str -> MyStringOps.stringReverse(str), strIn);
        System.out.println(strOut);

        Integer i = new Integer(5);
        System.out.println(i.hashCode());
        i += 0;
        System.out.println(i.hashCode());

        System.out.println();

        String s = "soap";
        System.out.println(s.hashCode());

        s += "";
        System.out.println(s.hashCode());
    }
}
