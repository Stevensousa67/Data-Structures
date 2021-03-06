import java.util.*;

class MaxHeap {
    public static void main(String args[])  {
        // Create empty priority queue
        //with Collections.reverseOrder to represent max heap
        PriorityQueue<Integer> pQueue_heap =
                new PriorityQueue<Integer>(Collections.reverseOrder());

        // Add items to the pQueue using add()
        pQueue_heap.add(7);
        pQueue_heap.add(2);
        pQueue_heap.add(1);
        pQueue_heap.add(9);
        pQueue_heap.add(12);
        pQueue_heap.add(3);
        pQueue_heap.add(14);

        // Printing all elements of max heap
        System.out.println("The max heap represented as PriorityQueue:");
        Iterator iter = pQueue_heap.iterator();
        while (iter.hasNext())
            System.out.print(iter.next() + " ");

        // Print the highest priority element (root of max heap)
        System.out.println("\n\nHead value (root node of max heap):" +
                pQueue_heap.peek());

        // remove head (root node of max heap) with poll method
        pQueue_heap.poll();
        //print the max heap again
        System.out.println("\n\nMax heap after removing root: ");
        Iterator<Integer> iter2 = pQueue_heap.iterator();
        while (iter2.hasNext())
            System.out.print(iter2.next() + " ");

        // remove head (root node of max heap) with poll method
        pQueue_heap.poll();
        //print the max heap again
        System.out.println("\n\nMax heap after removing root: ");
        Iterator<Integer> iter3 = pQueue_heap.iterator();
        while (iter3.hasNext())
            System.out.print(iter3.next() + " ");
    }
}