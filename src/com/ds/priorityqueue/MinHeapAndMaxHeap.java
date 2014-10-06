/**
 * 
 */
package com.ds.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;


/**
 * @author Dany
 *
 */
public class MinHeapAndMaxHeap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MinHeapAndMaxHeap().testMinMaxHeap();
	}
	
	public void testMinMaxHeap()
	{
		PriorityQueue<Integer> minHeap=implementMinHeapPriorityQueue();
		PriorityQueue<Integer> maxHeap=implementMaxHeapPriorityQueue();
		
		minHeap.add(4);
		minHeap.add(5);
		minHeap.add(1);
		
		maxHeap.add(6);
		maxHeap.add(8);
		maxHeap.add(1);
		
		System.out.println(minHeap.peek());
		System.out.println(maxHeap.peek());		
	}

	public PriorityQueue<Integer> implementMinHeapPriorityQueue()
	{
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(11, new Comparator<Integer>()
				{
			public int compare(Integer o1, Integer o2)
			{
				return (o1 - o2); 
			}
				}
				);
		return queue;
	}
	
	public PriorityQueue<Integer> implementMaxHeapPriorityQueue()
	{
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(11, new Comparator<Integer>()
				{
			public int compare(Integer o1, Integer o2)
			{
				return (o2 - o1); 
			}
				}
				);
		return queue;
	}

}
