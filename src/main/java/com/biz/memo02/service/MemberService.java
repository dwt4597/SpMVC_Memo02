package com.biz.memo02.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Service;

import com.biz.memo02.vo.CodeVO;

@Service	
public class MemberService {

	
	public List<CodeVO> getCities(){
		List<CodeVO> cities = new ArrayList<CodeVO>();
		
		cities.add(new CodeVO("GWANGJU","광주광역시"));
		cities.add(new CodeVO("SEOUL","서울특별시"));
		cities.add(new CodeVO("BUSAN","부산광역시"));
		cities.add(new CodeVO("JEJU","제주특별자치도"));
		cities.add(new CodeVO("INCHUN","인천광역시"));
		cities.add(new CodeVO("DAEJUN","대전광역시"));
		
		return cities;
		
	}
	/*
	 * Map<Key,Value> 
	 * 키와 값의 쌍으로 구성된 자료구조
	 * 값을 추가할때는 : map.put(key,value)
	 * 값을 읽을때는 : map.key 형태로 값을 읽는다.
	 */
	public Map<String,String> getCitiesMap() {
		/*
		 * HashMap은 put 한 순서대로 나열
		 * TreeMap은 key를 기준으로 오름차순 정렬
		 * 
		 * Map은 key의 중복을 허용하지 않는다.
		 */
		Map<String,String> cities = new HashMap<String,String>();
		cities = new TreeMap<String,String>();
		
		cities.put("서울특별시","SEOUL");
		cities.put("광주광역시","GWANGJU");
		cities.put("인천광역시","INCHUN");
		cities.put("대전광역시","DAEJUN");
		cities.put("부산광역시","BUSAN");
		cities.put("제주특별자치도","JEJU");
		
		return cities;
	}
	
	public List<String> getCitiesList() {
		
		List<String> cities = new ArrayList<String>();
		cities.add("광주역시");
		cities.add("서울특별시");
		cities.add("울산광역시");
		cities.add("부산광역시");
		cities.add("인천광역시");
		cities.add("제주특별자치도");
		return cities;
		
	}
	
	public List<CodeVO> getHobbies(){
		List<CodeVO> hobbies = new ArrayList();
		hobbies.add(new CodeVO("BOOK","독서"));
		hobbies.add(new CodeVO("MOUNT","등산"));
		hobbies.add(new CodeVO("MUSIC","음악감상"));
		hobbies.add(new CodeVO("MOVIE","영화보기"));
		hobbies.add(new CodeVO("GAME","게임하기"));
		
		return hobbies;
	}
	
	public Map<String,String> getHobbiesMap() {
		Map<String,String> hobbies = new HashMap<String,String>();
		hobbies.put("BOOK","독서");
		hobbies.put("MOUNT","등산");
		hobbies.put("MUSIC","음악감상");
		hobbies.put("GAME","게임");
		hobbies.put("MOVIE","영화감상");
		return hobbies;
	}
	
	public List<String> getHobbiesList() {
		List<String> hobbies = new ArrayList<String>();
		hobbies.add("독서");
		hobbies.add("등산");
		hobbies.add("음악감상");
		hobbies.add("영화감상");
		hobbies.add("게임");
		return hobbies;
	}
}