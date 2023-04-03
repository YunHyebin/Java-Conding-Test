package codingTest;

import java.util.HashSet;
import java.util.Scanner;

public class SafeZone {

	public static void main(String[] args) {
		// 지뢰배열 만들기
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (num < 1 || num > 100) {
			System.out.println("N x N 칸 만들기 N값 입력: ");
			num = sc.nextInt();
		}
		int[][] board = new int[num][num];

		// 생성된 배열에 지뢰값 1, 안전지역 0 넣기
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.println("[" + i + "]" + "[" + j + "]");
				System.out.print("지뢰O: 1, 지뢰X :0\n입력>>");
				int inputBomb = sc.nextInt();

				// 0, 1이 아닌 다른 숫자를 입력했을 시 재입력
				while (inputBomb > 1) {
					System.out.println("[" + i + "]" + "[" + j + "]");
					System.out.print("지뢰O: 1, 지뢰X :0\n다시 입력>>");
					inputBomb = sc.nextInt();
				}
				// 제대로운 숫자 입력했을 때 board 배열에 넣음.
				board[i][j] = inputBomb;
			}
		}

		// 지뢰 배열 출력
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("\n안전지역 개수: " + getSafeNum(board));
	}

	// 안전지역 개수 반환 메소드
	public static int getSafeNum(int[][] board) {
		int result = 0;
		int[][] bombArr;
		int all = board.length * board.length; // 배열 총 칸 개수

		// 지뢰 배열 위치 찾기
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 1) { // 지뢰 배열의 수

				}
			}
		}

		// 지뢰가 있는 위치 주변에 -1을 넣어 위험지역 표시

		// 안전지역 찾기
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 0) {
					result++;
				}
			}
		}
		
		
		return result;
	}
}
