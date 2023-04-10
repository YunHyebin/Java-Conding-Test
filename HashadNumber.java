package codingTest;

import java.util.Scanner;

public class HashadNumber {

	public static void main(String[] args) {
		/*
		 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
		 *  예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로나누어 떨어지므로 18은 하샤드 수입니다. 
		 *  자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		System.out.println("결과: " + judgeHashad(num));

	}
	
	public static boolean judgeHashad(int num) {
		boolean answer = true;
		int divNum = 0;		//나눌 수
		String strNum = Integer.toString(num);	//정수형을 String 형으로 만든다.
		for(int i=0; i<strNum.length(); i++) {
			divNum += Character.getNumericValue(strNum.charAt(i));
		}
		if(num % divNum != 0) {
			answer = false;
		}
		return answer;
	}

}
