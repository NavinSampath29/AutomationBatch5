package Day12;

import java.util.HashSet;

public class VishnuDoubts {

	public static void main(String[] args) {
		HashSet<String> ne = new HashSet<String>();
		ne.add("java");
		ne.add("c++");
		ne.add("python");
		ne.add("ruby");
		
		System.out.println(ne.size());
		
		for(String n : ne)
		{
			System.out.println(n);
		}
		
		ne.remove("c++");
		
		System.out.println(ne.size());
		for(String n : ne)
		{
			System.out.println(n);
		}
		
	}

}
