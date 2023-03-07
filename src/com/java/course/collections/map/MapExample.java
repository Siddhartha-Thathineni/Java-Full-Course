package com.java.course.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("A", 3, "B", 5, "Z", 10);

		System.out.println(map);

		System.out.println(map);

		System.out.println(map.get("A"));
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey("A"));
		System.out.println(map.containsValue(5));

		System.out.println(map.values());

		Map<String, Integer> hashMap = new HashMap<>(map);
		System.out.println(hashMap); // {A=3, B=5, Z=10}
		hashMap.put("F", 5);
		System.out.println(hashMap); // {A=3, B=5, Z=10, F=5}

		hashMap.put("Z", 11);
		System.out.println(hashMap); // {A=3, B=5, Z=11, F=5}
	}
}
