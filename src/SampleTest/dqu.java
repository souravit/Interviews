package SampleTest;

import java.util.Deque;
import java.util.LinkedList;

public class dqu {
    public static void main(String[] args) {
        int[] a = {1,3,1,2,5};
        Deque<Integer> d = new LinkedList<>();
        d.add(a[0]);
        d.add(a[1]);
        d.add(a[2]);
        d.add(a[3]);
        d.add(a[4]);

        System.out.println(d.peek());
        System.out.println(d.peekLast());
        System.out.println(d.pollLast());
        d.addLast(9);
        System.out.println(d);



    }
}
