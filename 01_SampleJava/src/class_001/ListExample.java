package class_001;

import java.util.LinkedList;
import java.util.List;

public class ListExample {
	public static void main(String[] args){
		final List<String> invited = new LinkedList<String>();
		
		invited.add("Ivan");
		invited.add("Peter");
		
		for(String name: invited){
			System.out.println(name + " is invited");
		}
		
		System.out.println(invited.size());
		
//		removes a person from the LinkedList
		invited.remove("Ivan");
		
	}
}
