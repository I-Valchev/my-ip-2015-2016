package class_001;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {
	public static void main(String [] args){
		Map<String, Integer> nameToCountMap = new HashMap<String, Integer>();
	
//		add to map
		nameToCountMap.put("Ivan", 1);
		
//		get from map by key - will print 1
		System.out.println(nameToCountMap.get("Ivan"));
		
//		when there is no match - null is returned
		if(nameToCountMap.get("Unknown") == null){
			System.out.println("Not found");
		}
	}
}
