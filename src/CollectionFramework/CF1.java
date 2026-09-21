package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CF1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();

        list2.add(4);
        list2.add(5);
        list2.add(6);
        System.out.println(list2);
        list.addAll(list2);

        System.out.println(list);

        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext()){
            System.out.println("Element: "+itr.next());
        }

        List<Integer> list3 = new ArrayList<>();

        list3.add(4);
        list3.add(15);
        list3.add(60);
        list3.add(62);
        list3.add(36);
        System.out.println(list3);

        Collections.sort(list3);
        System.out.println(list3);

        Collections.sort(list3,Collections.reverseOrder());
        System.out.println(list3);

    }
}
