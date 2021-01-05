package chapter14generics.wildcards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Coords<T extends TwoD> {
    public T[] coords;

    public Coords(T[] coords) {
        this.coords = coords;
    }

    ArrayList<? extends T> getT() {
        List<? extends T> s = new ArrayList<>();
        return new ArrayList<>();
    }

    void showXYZ(Coords<? extends T> c) {

    }
}
