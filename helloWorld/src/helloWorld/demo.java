package helloWorld;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class demo {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		values.add(5);
//		values.add("suhail");
//		values.add(4.5f);
		values.add(4);
		values.add(10);
//		values.add(1,8);
		
		Collections.sort(values);
		
		values.forEach(System.out::println);
		
//		Iterator i = values.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}
		
//		for(int i : values) {
//			System.out.println(i);
//		}
		
	}

}
