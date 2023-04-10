package codingTest;

import java.util.Scanner;

public class Watermelon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int inputNum = sc.nextInt();
		speakWatermelon(inputNum);
		
		

	}
	public static void speakWatermelon(int num) {
		if(num % 2 == 0) {
			System.out.println("수박".repeat(num/2));
		}else {
			System.out.println("수박".repeat(num/2) + "수");
		}
	}

}
