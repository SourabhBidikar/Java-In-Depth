package com.importantConcepts;

import java.util.*;
import java.util.Map.Entry;

public class ComparatorLHMEx2 {

	public static void main(String[] args) {
		
		Map<Integer,String> map= new LinkedHashMap<Integer,String>();
		
		map.put(5,"Apurva");
		map.put(1,"Sourabh");
		map.put(3,"Rutuja");
		
		System.out.println(map);
		
		List<Map.Entry<Integer, String>> list_map= new ArrayList<Map.Entry<Integer, String>>(map.entrySet());
		
		Collections.sort(list_map, new SortByKey());
		
		
		map.clear();
		
		for(Map.Entry<Integer, String> entry :list_map) {
			
			map.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println(map);

	}

}




class SortByKey implements Comparator<Map.Entry<Integer,String>>{
	
	@Override
	public int compare(Map.Entry<Integer,String> entry1,Map.Entry<Integer,String> entry2) {
		return entry1.getKey()-entry2.getKey();
	}
}

//or write this directly this anonymous class in Collections.sort()

/*
 * 
 * Collections.sort(list_map,new Comparator<Map.Entry<Integer, String>>(){
			public int compare(Entry<Integer, String> entry1, Entry<Integer, String> entry2) 
                {
					return entry1.getKey()-entry2.getKey();
                } 
		});
		
*/
