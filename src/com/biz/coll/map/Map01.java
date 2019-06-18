package com.biz.coll.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 *  Map 자료구조을 pair structure라고도 한다.
 *  키와 값의 구조로 이루어지 형태
 *  
 */
public class Map01 {

	public static void main(String[] args) {
		
		List<String> strList;
		
		/*
		 * Map은 2개의 클래스가 쌍으로 포함되며
		 * 앞으 클래스는 키로 사용되고
		 * 뒤의 클래스는 값으로 사용된다.
		 */
		Map<Integer, String> strMap = new HashMap<Integer, String>();
		
		// 값을 저장할 때는  put(키, 값) 메소드를 사용하고
		strMap.put(1, "홍길동");
		strMap.put(2, "성춘향");
		strMap.put(3, "이몽룡");
		strMap.put(4, "장녹수");
		strMap.put(5, "임꺽정");
		
		// 값을 읽을 때는 get(키) 메소드를 사용한다
		System.out.println(strMap.get(3));
		Set<Integer> intKeys = strMap.keySet();
		
		for(int key : intKeys) {
			System.out.println();
		}
		
		
		
	}

}
