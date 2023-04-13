package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class BestCeller {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> book = new HashMap<String, Integer>();
		System.out.print("팔린 책의 개수");
		int cnt = sc.nextInt();
		String[] bookName = new String[cnt];
		
		//책 이름 배열 요소 넣기
		for(int i=0; i<cnt; i++) {
			System.out.print("책 이름: ");
			bookName[i] = sc.next();
		}
		System.out.println("책: " + Arrays.toString(bookName));
		
		//책 이름 : 책 개수 book Map 요소 넣기
		for(String name : bookName) {
			Integer freq = book.get(name);
			book.put(name, (freq == null)? 1: freq + 1);
		}
		
		//가장 많은 책의 개수(key)로 정렬 후 베스트셀러 출력
		List<Entry<String, Integer>> bestCeller = new ArrayList<>(book.entrySet());
		bestCeller.sort(Entry.comparingByValue());
		System.out.println("베스트 셀러 책 이름 : " + (bestCeller.get(bestCeller.size()-1)).getKey());
		System.out.println("베스트 셀러 책 팔린 수 : " + (bestCeller.get(bestCeller.size()-1)).getValue());
		

	}

}
