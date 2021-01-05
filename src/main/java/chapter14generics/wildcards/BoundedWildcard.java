package chapter14generics.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoundedWildcard {

    static void showXY(Coords<?> c) {
        System.out.println("X Y Coordinates: " + c.toString());
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("X Y Z Coordinates: " + c.toString());
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(
                    c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
        }
        System.out.println();
    }

    static void showXYZT(Coords<? extends FourD> c) {

/*        List<? extends Object> listWild = new ArrayList<>();
        listWild.add("1");
        listWild.add(1);


        List listRaw = new ArrayList();
        listRaw.add("1");
        listRaw.add(1);*/

        System.out.println("X Y Z T Coordinates: " + c.toString());
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(
                    c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z
                            + " " + c.coords[i].t);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD[] twoDs = { new TwoD(1, 2), new TwoD(3, 4), new TwoD(5, 6) };
        Coords<TwoD> twdLocs = new Coords<>(twoDs);
        System.out.println("Contents of twdLocs");
        showXY(twdLocs);
//                showXYZ(twdLocs);
//                showXYZT(twdLocs);

        ThreeD[] threeDs = { new ThreeD(1, 2, 3), new ThreeD(4, 5, 6),
                new ThreeD(7, 8, 9) };
        Coords<ThreeD> thrdLocs = new Coords<>(threeDs);
        System.out.println("Contents of thrdLocs");
        showXY(thrdLocs);
        showXYZ(thrdLocs);
        //        showXYZT(thrdLocs);

        FourD[] fourDs = { new FourD(1, 2, 3, 4), new FourD(5, 6, 7, 8)};

        Coords<FourD> fdLocs = new Coords<>(fourDs);
        System.out.println("Contents of fdLocs");
        showXY(fdLocs);
        showXYZ(fdLocs);
        showXYZT(fdLocs);

        funct1(new ArrayList<>(Arrays.asList(1,2,3,4)), 6);
//        funct1(new ArrayList<>(Arrays.asList(1,2,3,4)), "6");
    }

    public static <E> void funct1(final List<E> list1, final E something) {
        list1.add(something);
        System.out.println(list1);
    }
}
