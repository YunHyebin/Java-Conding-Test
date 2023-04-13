package codingTest;

import java.util.Scanner;

public class String1120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a;
		String b;
		while(true) {
			System.out.print("x문자열 입력: ");
			a = sc.next();
			System.out.print("y문자열 입력: ");
			b = sc.next();
			if(a.length() <= b.length()) {
				break;
			}
		}
		int result = 0;
		if(a.length() == b.length()) {
			for(int i=0; i<a.length(); i++) {
				if(a.charAt(i) == b.charAt(i)) {
					result++;
				}
			}
		}else {
			//x문자열의 길이를 y문자열의 길이와 맞추기 : 랜덤값으로 앞이나 뒤에 채움
		}
		

	}

}
