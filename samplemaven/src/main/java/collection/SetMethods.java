package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Set<String> S= new HashSet <String>();
      Set<String> S1= new HashSet <String>();
      S.add("Mango");
      S.add("Watermelon");
      S.add("Muskmelon");
      S1.add("Strawberry");
      S1.add("Apple");
      System.out.println(S);
      System.out.println(S1);
      S.addAll(S1);
      System.out.println(S);
      System.out.println(S.contains("Apple"));
      System.out.println(S1.containsAll(S));
      System.out.println(S.isEmpty());
      S.remove("Mango");
      System.out.println(S);
      S.removeAll(S1);
      System.out.println(S);
      S1.clear();
      System.out.println(S1);
	}

}
