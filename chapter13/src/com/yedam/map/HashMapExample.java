package com.yedam.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class HashMapExample {
	public static void main(String[] args) {
		//KEY : String , Value : Integer(정수)
		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장
		map.put("고길동",	85);
		map.put("김또치",	90);
		map.put("고희동",	80);
		map.put("김또치",	33); 
		
		//Enrty수
		System.out.println("총 Entry 수 : " + map.size());
		
		//Key값을 활용한 객체 찾기
		System.out.println(map.get("김또치"));
		System.out.println("--------------------------");
		
		//반복자(iterator)
		Set<String> keySet = map.keySet();
		
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("key : " + key + "value : " + value);
		}
		System.out.println("--------------------------");
		//Entry 삭제
		map.remove("고길동");
		System.out.println("총 Entry 수 : " + map.size());
		
		System.out.println("--------------------------");
		//EntrySet<K,V> 다 호출 ,,, map.Enrty 출력
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("key : " + key + "value : " + value);
		}
		
		System.out.println("--------------------------");
		
		//향상된 for문
		for(Map.Entry<String, Integer> mEntry : entrySet) {
			String key = mEntry.getKey();
			Integer value = mEntry.getValue();
			System.out.println("key : " + key + "value : " + value);
		}
		
		System.out.println("--------------------------");
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
