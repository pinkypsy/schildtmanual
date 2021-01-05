package chapter15lambdas.method_reference2;

public class InstanceMethWithInstanceRefDemo {
    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i], v))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        HighTemp[] weekDayHighs = {
                new HighTemp(89), new HighTemp(82),
                new HighTemp(83), new HighTemp(84),
                new HighTemp(91), new HighTemp(91) };

        int count;

        count = counter(weekDayHighs, HighTemp::isTempSame, new HighTemp(89));

        System.out.println("the same temp " + count);

        count = counter(weekDayHighs, HighTemp::isLessThanTemp,
                new HighTemp(83));

        System.out.println("is less than temps: " + count);
    }
}
