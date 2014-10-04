/**
 * 
 */
package com.ctci.datastructures;
import java.util.Comparator;
import java.util.PriorityQueue;
/**
 * @author Dany
 *
 */
public class PriorityQueueImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new PriorityQueueImplementation().implementPriorityQueue();
		
	}
	
	public void implementPriorityQueue()
	{
		 PriorityQueue<String> queue = new PriorityQueue<String>(11, new Comparator<String>()
		 {
			 public int compare(String o1, String o2)
			 {
				 int population1 = Integer.parseInt(o1.split(":")[1].trim());
				 int population2 = Integer.parseInt(o2.split(":")[1].trim());
				 return population2 - population1; 
				 }
			 }
		 );
		 queue.add("United States: 307006550");
		 queue.add("Brazil: 193733800");
		 // .add() and .offer() are the same. queue.offer("Russia: 141850000");
		 queue.offer("India: 1155347700");
		 queue.offer("China: 1331460000");
		 System.out.println("Countries in database: " + queue.size());
		 
		 while (!queue.isEmpty())
		 { 
			 System.out.println(queue.poll());
			 
		 } 
		 
		 System.out.println("Countries in database: " + queue.size());
		 
	
	
	}

}
