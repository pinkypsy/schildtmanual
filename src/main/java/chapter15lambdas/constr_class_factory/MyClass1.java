package chapter15lambdas.constr_class_factory;

public class MyClass1 <T> {
    private T val;

    public MyClass1(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }
}
