package collection;

import java.util.ArrayList;
import java.util.List;

public class ForeachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s=new ArrayList<String>();
		s.add("red");
		s.add("blue");
		s.add("green");
		System.out.println(s);
		for(String b:s)//for(type variable: listname)
		{
			System.out.println(b);
		}

	}

}
