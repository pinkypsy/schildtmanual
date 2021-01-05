package chapter15lambdas.method_reference2;

public class HighTempParent {
    private int temp;

    public HighTempParent(int temp) {
        this.temp = temp;
    }

    /*boolean isTempSame(HighTempParent highTemp2){
        System.out.println("its parent (same)");
        return *//*this.*//*temp == highTemp2.temp;
    }

    boolean isLessThanTemp(HighTempParent highTemp2){
        System.out.println("its parent (same)");
        return temp < highTemp2.temp;
    }*/

    boolean isTempSame(){
        System.out.println("its parent (same)");
        return true;
    }

    boolean isLessThanTemp(){
        System.out.println("its parent (same)");
        return true;
    }
}
