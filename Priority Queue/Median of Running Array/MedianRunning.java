/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author architgarg
 */
import java.util.*;
public class MedianRunning {
    public static void main(String args[]) {
        int a[] = {1, 9, 8, 19, 15, 5};
        double arr[] = findMedian(a);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static double[] findMedian(int a[]) {
        PriorityQueue<Integer> lowers = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1 * o1.compareTo(o2);
            }
            
        });
        PriorityQueue<Integer> highers = new PriorityQueue<>();
        double median[] = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            int number = a[i];
            addNumber(number, lowers, highers);
            rebalance(lowers, highers);
            median[i] = getMedian(lowers, highers);
        }
      
        return median;
    }
    
    public static void addNumber(int number, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        if (lowers.size() == 0 || number < lowers.peek()) {
            lowers.add(number);
        }
        else 
            highers.add(number);
    }
    
    public static void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;
        PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers;
        if ((biggerHeap.size() - smallerHeap.size()) >= 2) {
            smallerHeap.add(biggerHeap.poll());
        }
    }
    
    public static double getMedian(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;
        PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers;
        if (biggerHeap.size() == smallerHeap.size()) {
            return ((double)(biggerHeap.peek() + smallerHeap.peek()) / 2 );
        }
        return biggerHeap.peek();
    }
}
