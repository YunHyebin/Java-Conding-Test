package codingTest;

import java.util.Arrays;
import java.util.LinkedList;

public class GymSuit {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		System.out.println(solution(n, lost, reserve));

	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int count = 0;
		Arrays.sort(lost);
		Arrays.sort(reserve);

		count = n - lost.length;
		for(int i=0; i<lost.length; i++) {
			for(int j=0; j<reserve.length; j++) {
				if(lost[i] == reserve[i]+1 || lost[i] == reserve[i]-1) {
					count++;
					lost[i] = -1;
					reserve[i] = -1;
				}
			}
		}
		return count;
	}
}
