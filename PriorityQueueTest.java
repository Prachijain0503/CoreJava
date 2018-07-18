package net.codejava.queue;
import java.util.*;

public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pQueue =
                new PriorityQueue<String>();


pQueue.add("C");
pQueue.add("C++");
pQueue.add("Java");
pQueue.add("Python");


System.out.println("Head value using peek function:"
                                 + pQueue.peek());

System.out.println("The queue elements:");
Iterator itr = pQueue.iterator();
while (itr.hasNext())
  System.out.println(itr.next());


pQueue.poll();
System.out.println("After removing an element" +
                 "with poll function:");
Iterator<String> itr2 = pQueue.iterator();
while (itr2.hasNext())
  System.out.println(itr2.next());


	}

}
