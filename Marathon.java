package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Marathon {

	public static void main(String[] args) {
		/*
		 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다. 마라톤에 참여한
		 * 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의
		 * 이름을 return 하도록 solution 함수를 작성해주세요.
		 */
		Scanner sc = new Scanner(System.in);

		// 참가자 명단 배열 만들기
		String[] participant;
		int participantNum = 0;
		while (true) {
			System.out.print("\n마라톤에 참가한 선수 인원: ");
			participantNum = sc.nextInt();
			if (participantNum >= 1 && participantNum <= 100000) {
				break;
			}
		}
		participant = new String[participantNum];

		// 참가자 이름(요소) 입력
		for (int i = 0; i < participant.length; i++) {
			System.out.print("참가자 이름 입력: ");
			participant[i] = sc.next();
			while (participant[i].toString().length() < 1 && participant[i].toString().length() > 20) {
				participant[i] = sc.nextLine();
			}
		}

		// 완주 명단 배열 만들기
		String[] completion = new String[participantNum - 1];
		for (int i = 0; i < completion.length; i++) {
			System.out.println("--------<참가자 명단>-------");
			System.out.println(Arrays.toString(participant));
			System.out.println("완주한 참가자 번호 입력: ");
			completion[i] = participant[sc.nextInt() - 1];
		}
		System.out.println("완주하지 못한 선수 이름: " + solution(participant, completion));
	}

	// 메소드
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		// removeAll 메소드로 차집합(참가배열-완주배열) 구하는 방법
		// 문제 : removeAll()는 동일한 문자열인지 비교하기 때문에 결과가 아예 안나오는 문제 발생할 수 있음
//		List<String> pList = new ArrayList<>(Arrays.asList(participant));
//		List<String> cList = new ArrayList<>(Arrays.asList(completion));
//		pList.removeAll(cList);
//		System.out.println(pList.toString());
//		answer = pList.toString();

		for (int pIdx=0; pIdx<participant.length; pIdx++) {
			for(int cIdx=0; cIdx<completion.length; cIdx++) {
				// 각 배열 요소의 값 비교
				if(participant[pIdx].equals(completion[cIdx]) == true) {
					check++;
				}
			}
			// 각 배열의 요소가 같지 않을 때
			if(check <= 0) {
				if(answer.contains(participant[pIdx]) == false) {
					answer += String.valueOf(participant[pIdx] + " ");
				}
				
			}
			check = 0;
		}

		return answer;
	}
}
