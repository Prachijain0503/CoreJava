package net.codejava.maps;
import java.util.*;

public class MapInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"Amit");  
		  map.put(101,"Vijay");  
		  map.put(102,"Rahul");  
		  for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  } 
		  
		  Map map1=new HashMap();  
		      
		    map1.put(1,"Amit");  
		    map1.put(5,"Rahul");  
		    map1.put(2,"Jai");  
		    map1.put(6,"Amit");  
		    //Traversing Map  
//		    Set set=map1.entrySet();//Converting to Set so that we can traverse  
//		    Iterator itr=set.iterator();  
//		    while(itr.hasNext()){  
//		        //Converting to Map.Entry so that we can get key and value separately  
//		        Map.Entry entry=(Map.Entry)itr.next();  
//		        System.out.println(entry.getKey()+" "+entry.getValue());  
//		    }  
		    
	}

}
