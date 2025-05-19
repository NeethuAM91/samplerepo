package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<String> A=new ArrayList<String>();
       A.add("Car");
       A.add("Bus");
       A.add("Bike");
       System.out.println(A);
       Iterator obj=A.iterator();
       while(obj.hasNext())
       {
    	   System.out.println(obj.next());
       }
       obj.remove();
       System.out.println(A);
	}

}
