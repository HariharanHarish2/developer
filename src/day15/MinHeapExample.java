package day15;
import java.util.*;
public class MinHeapExample {
public static void main(String[] args) {
	PriorityQueue<Integer>minHeap = new PriorityQueue<>();
	minHeap.add(20);
	minHeap.add(15);
	minHeap.add(30);
	minHeap.add(10);
	System.out.println("Min Heap:"+ minHeap);
	System.out.println("Peek(min):"+ minHeap.peek());
	System.out.println("Poll(remove min):"+ minHeap.poll());
	System.out.println("After poll:"+ minHeap);
	

	
}
}
//max:
//public class MinHeapExample {
//public static void main(String[] args) {
//	PriorityQueue<Integer>maxHeap = new PriorityQueue<>(Collections.reverseOrder());
//	maxHeap.add(20);
//	maxHeap.add(15);
//	maxHeap.add(30);
//	maxHeap.add(10);
//	System.out.println("Max Heap:"+ maxHeap);
//	System.out.println("Peek(max):"+ maxHeap.peek());
//	System.out.println("Poll(remove max):"+ maxHeap.poll());
//	System.out.println("After poll:"+ maxHeap);
//	
