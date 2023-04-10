package codingTest;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Arrays;
import java.util.Scanner;

public class Babbling {

	public static void main(String[] args) {
		String[] babbling = { "aya", "ye", "woo", "ma" };

		Scanner sc = new Scanner(System.in);
		System.out.print("말할 것 같은 발음의 개수: ");
		int testTalkNum = sc.nextInt();

		String[] testTalk = new String[testTalkNum];

		for (int i = 0; i < testTalk.length; i++) {
			System.out.print("발음 입력 (영어로): ");
			testTalk[i] = sc.next();
		}
		int cnt = 0;
		for(String a : testTalk) { 
			for(String b : babbling) {
				if(a.equals(b)) {
					cnt++;
				}else if(a.indexOf(b))){
					
				}
			}
		}
		System.out.println(cnt);

	}

}
