package by.yandex.sidvlada;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class HighestMark {
    public static void main(String[] args) {

        int note = 20;
        List<Integer> arrayList = new ArrayList<Integer>(note);

        for (int i = 0; i < note; i++) {
            int x = (int) (Math.random() * 10 + 1);
            arrayList.add(x);
        }
        System.out.println(arrayList);


        int max = (int) arrayList.get(0);
        for (int i = 0; i < (int)arrayList.get(19); i++) {
            if (arrayList.get(i) > max)
                //arrayList.set(i, max);
                max = arrayList.get(i);
        }
            System.out.println(max);

        for (ListIterator<Integer> high = arrayList.listIterator(); high.hasNext(); ) {
            if (high.next() < max)
                high.remove();

        }
        System.out.println("Highest msrks: " + arrayList);
    }
}

