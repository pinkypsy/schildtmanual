package chapter15lambdas.constr_ref1;

public class ConstructorRefDemo {

    public static void main(String[] args) {
        MyFunc <Integer> myClassConstrRefInt = MyClass::new;

        MyClass myClassInt = myClassConstrRefInt.func(100);

        System.out.println(myClassInt.getVal());

        MyFunc <String> myClassConstrRefString = MyClass::new;

        MyClass myClassString = myClassConstrRefString.func("dog");

        System.out.println(myClassString.getVal());
    }
}
