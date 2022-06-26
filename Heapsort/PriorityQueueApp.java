package Heapsort;

public class PriorityQueueApp {
	public static void main(String[] args){
		// Try each of the following implementations of PriorityQueue
//		PriorityQueueArray myQueue = new PriorityQueueArray(5);
//		PriorityQueueList myQueue = new PriorityQueueList();
		PriorityQueueHeap myQueue = new PriorityQueueHeap(5);
		myQueue.insert(2);
		myQueue.insert(23);
		System.out.println("Removed: " + myQueue.remove());
		myQueue.insert(12);
		myQueue.insert(7);
		myQueue.insert(13);
		myQueue.insert(29);
		myQueue.insert(50);
		System.out.println("Removed: " + myQueue.remove());
		System.out.println("Removed: " + myQueue.remove());
	}
}