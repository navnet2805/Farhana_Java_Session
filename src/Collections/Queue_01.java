package Collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queue_01 {
    public static void main(String[] args) {
        Queue obj = new ArrayDeque();
        obj.add("java");
        //obj.add(null);
        obj.add(4);
        obj.add('d');

        System.out.println(obj);
    }
}
