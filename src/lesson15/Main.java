package lesson15;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // metod add();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);
        System.out.println(list);
        System.out.println();
        // metod add(index, element);
        list.add(2, 10);
        System.out.println(list);
        System.out.println();
        // metod remove();
        list.removeFirst();
        System.out.println(list);
        System.out.println();
        // metod set();
        list.set(1, 20);
        System.out.println(list);
        System.out.println();
        //metod get();
        System.out.println(list.get(1));
        //metod indexOf();
        System.out.println(list.indexOf(20));
        //sort();
        list.sort(null);
        System.out.println(list);
        //metod contains();
        System.out.println(list.contains(20));
        System.out.println();
        //clear();
        list.clear();
        System.out.println(list);
    }
}
