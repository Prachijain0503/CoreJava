package net.codejava.lists;
import java.util.*;

public class SynchronizeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list =
		           Collections.synchronizedList(new ArrayList<String>());
		 
		        list.add("practice");
		        list.add("code");
		        list.add("quiz");
		 
		        synchronized(list)
		        {
		            // must be in synchronized block
		            Iterator it = list.iterator();
		 
		            while (it.hasNext())
		                System.out.println(it.next());
		        }

	}

}
