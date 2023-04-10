package codingTest;

public class DivisionOfTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 3;
		int num2 = 2;
		System.out.println(solution(num1, num2));
		

	}
	
	public static int solution(int num1, int num2) {
		return (int)(((double)num1 / (double)num2) * 1000);
	}

}
