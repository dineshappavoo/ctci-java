/**
 * 
 */
package _PRIORITY_QUEUE_HEAP;
import java.util.Comparator;
import java.util.PriorityQueue;
/**
 * @author Dany
 *
 */
public class GraphMinHeap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<GraphNode> queue=new GraphMinHeap().implementMinHeapPriorityQueue();
		
		 queue.add(new GraphNode(5, 10, 20));
		 queue.add(new GraphNode(10, 15, 57));
		 // .add() and .offer() are the same.
		 queue.offer(new GraphNode(5, 14, 70));
		 GraphNode o=new GraphNode(5, 14, 70);
		 if(!queue.contains(o))
			 queue.offer(o);
		 queue.offer(new GraphNode(13, 10, 50));
		 System.out.println("Countries in database: " + queue.size());
		 
		 while (!queue.isEmpty())
		 { 
			 GraphNode node=queue.poll();
			 System.out.println("u : "+node.u+" v : "+node.v+" w : "+node.w);
			 
		 } 
		 
		 System.out.println("Countries in database: " + queue.size());
		 
		
	}
	
	public PriorityQueue<GraphNode> implementMinHeapPriorityQueue()
	{
		 PriorityQueue<GraphNode> queue = new PriorityQueue<GraphNode>(11, new Comparator<GraphNode>()
		 {
			 public int compare(GraphNode o1, GraphNode o2)
			 {
				 int w1=o1.w;
				 int w2=o2.w;
				 return (w1 - w2); 
				 }
			 }
		 );
		 return queue;
		 
	
	
	}

}
