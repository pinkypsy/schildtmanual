package chapter15lambdas.method_reference2;

public class HighTemp extends HighTempParent {

    private int temp;

    public HighTemp(int temp) {
        super(temp);
        this.temp = temp;
    }

    boolean isTempSame(HighTemp highTemp2){
        return /*this.*/temp == highTemp2.temp;
    }


    boolean isLessThanTemp(HighTemp highTemp2){
        return temp < highTemp2.temp;
    }

    /*@Override
    boolean isTempSame() {
        return false;
    }

    @Override
    boolean isLessThanTemp() {
        return false;
    }*/
}
