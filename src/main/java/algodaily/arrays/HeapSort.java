package algodaily.arrays;

import javax.swing.*;
import java.util.*;

public class HeapSort {


    private final static int HEAP_SIZE = 10; //size of heap

    static class maxHeapComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer x, Integer y) {
            return y - x; //reverse order
        }
    }


    public static void main(String[] args) {


        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(HeapSort.HEAP_SIZE);
        PriorityQueue<Integer> pQueueMax = new PriorityQueue<Integer>(HeapSort.HEAP_SIZE, new maxHeapComparator());

        // Adding items to the pQueue using add()
//        pQueue.add(10);
//        pQueue.add(30);
//        pQueue.add(20);
//        pQueue.add(400);
//        pQueue.add(1);
//        pQueue.add(-8);

        for (int i = 1; i <= HeapSort.HEAP_SIZE; ++i) {
            int data = new Random().nextInt(100) + 1; //number between 0 to 100
            pQueue.add(data);
            pQueueMax.add(data);
        }

        System.out.println("The queue elements:");
        System.out.print("\nMin Heap : ");
        Iterator<Integer> itr = pQueue.iterator();
        while (itr.hasNext())
            System.out.print(itr.next() + " ");


        System.out.print("\nMAX Heap : ");
        itr = pQueueMax.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
