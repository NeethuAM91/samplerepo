package collection;

import java.util.ArrayList;
import java.util.List;

public class Genericlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<String> l =new ArrayList<String>();
     l.add("Mango");
     l.add("Strawberry");
     l.add("Pineapple");
     l.add("Mango");
     System.out.println(l);
     System.out.println(l.get(2));
     l.set(1, "banana");
     System.out.println(l);
     System.out.println(l.indexOf("Mango"));
     System.out.println(l.lastIndexOf("Mango"));
     System.out.println(l.contains("Mango"));
     System.out.println(l.isEmpty());
     System.out.println(l.size());
     l.remove("banana");
     System.out.println(l);
	}

}
