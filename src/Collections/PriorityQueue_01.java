package Collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_01 {
    public static void main(String[] args) {
        Queue obj = new PriorityQueue();
//        obj.add("java");
//        obj.add("program");
//        obj.add("c");
//        obj.add("python");

        obj.add(2);
        obj.add(99);
        obj.add(8);
        obj.add(1);

        System.out.println(obj);
    }
}
