package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PropertiesOfQueue {
	public static void main(String[] args) {
		//It does not follow the indexing
		//it does not follow the insertion
		//it can  accept duplicates
		//it can not accept null value
		//It can store only HomoGeneous Values
	
		//We can retereve the elements by using Iterator Cursor 
		Queue a1=new PriorityQueue();
		a1.add(100);
		a1.add(20);
		a1.add(300);
		a1.add(300);
		System.out.println(a1);
		Queue a2=new PriorityQueue();
		a2.add(1);
		a2.add(19);
		a1.addAll(a2);
		System.out.println(a1);
		a1.remove();
		System.out.println(a1);
		a1.remove(20);
		System.out.println(a1);
		a1.removeAll(a2);
		a1.retainAll(a2);
		System.out.println(a1);
		System.out.println(a1.contains(10));
		Queue a3=new PriorityQueue();
		a3.add(100);
		a3.add(20);
		a3.add(300);
		a3.add(300);
	//	a1.clear();
	//	System.out.println(a1.isEmpty());
		
		System.out.println(a3.toString());
		Object c1[]=a3.toArray();
		for(int i=0;i<c1.length;i++)
		{
			System.out.println(c1[i]);
		}
		Iterator itr =a3.iterator();
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());
		   
	   }
	   System.out.println(a3);
	   System.out.println(a3.poll());
	   System.out.println(a3.peek());
	   System.out.println(a3);
	   System.out.println(a3.poll());
		System.out.println(a3);
		
		
		
		
		
		
	
		
	}

}
