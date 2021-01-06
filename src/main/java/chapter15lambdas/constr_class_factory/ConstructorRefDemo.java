package chapter15lambdas.constr_class_factory;

public class ConstructorRefDemo {
    public static void main(String[] args) {

        MyFunc <MyClass1, Integer> class1IntegerMyFunc = MyClass1::new;

        MyClass1 myClass1 = class1IntegerMyFunc.func(100);

        System.out.printf("Class: %s, value: %s %n", myClass1.getClass(),
                myClass1.getVal());

        MyFunc <MyClass2, String> myClass2StringMyFunc = MyClass2::new;

        MyClass2 myClass2 = myClass2StringMyFunc.func("dog");

        System.out.printf("Class: %s, value: %s %n", myClass2.getClass(),
                myClass2.getVal());

    }
}
