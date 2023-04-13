package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class RunningRace {

	public static void main(String[] args) {
//		// 선수 배열과 추월선수 배열 입력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("참가 선수 인원");
//		String[] players = new String[sc.nextInt()];
//		for (int i = 0; i < players.length; i++) {
//			System.out.print("참가선수 입력: ");
//			players[i] = sc.next();
//		}
//
//		System.out.print("추월 횟수");
//		String[] callings = new String[sc.nextInt()];
//		for (int i = 0; i < callings.length; i++) {
//			System.out.print("추월한 선수 입력: ");
//			callings[i] = sc.next();
//		}
		String [] players = {"mumu", "soe", "poe", "kai", "mine"};
		String [] callings = {"kai", "kai", "mine", "mine"};

		System.out.println(Arrays.toString(solution(players, callings)));
	}

	// 문제풀이 1
	public static String[] solution(String[] players, String[] callings) {
		for (int cIdx = 0; cIdx < callings.length; cIdx++) {
			for (int pIdx = 0; pIdx < players.length; pIdx++) {
				if (callings[cIdx].equals(players[pIdx])) {
					String temp = players[pIdx - 1];
					players[pIdx - 1] = players[pIdx];
					players[pIdx] = temp;
					System.out.println("추월! : " + Arrays.toString(players));
					
				}
			}
		}
		return players;
	}

	public static String[] solution2(String[] players, String[] callings) {
		int pidx = 0;
		int cindx = 0;
		for (int pIdx = 0; pIdx < players.length; pIdx++) {
			if (callings[idx].equals(players[pIdx])) {
				String temp = players[pIdx - 1];
				players[pIdx - 1] = players[pIdx];
				players[pIdx] = temp;
				System.out.println("추월! : " + Arrays.toString(players));
			}else {
				idx++;
			}
		}
		return players;

	}

}
