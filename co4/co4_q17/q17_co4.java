package study;
import java.util.*;
public class hashmap {
			public static void main(String args[]) {
				HashMap<Integer,String> hm=new HashMap<>();
				hm.put(1,"dwany");
				hm.put(2,"ansiya");
				hm.put(3, "anusree");
				hm.put(4, "akhila");
				System.out.println("the values are "+hm);
				hm.put(4, "arun");
				System.out.println("after updating"+hm);
				
				hm.remove(1);
				System.out.println("after removing"+hm);
				
				System.out.println("size : "+hm.size());
				System.out.println("after accessing 2nd value "+hm.get(2));
				
				for(String i:hm.values())
				{
					System.out.println(i);
				}
				System.out.println("**************");
				for(HashMap.Entry<Integer,String> me:hm.entrySet())
				{
					hm.entrySet();
				System.out.println(me.getValue());
				System.out.println(me.getKey());
				}
				}
	    }
	
