package codingTest;

public class AverageOfArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(solution(arr));

	}
	public static double solution(int[] numbers) {
        double sum = 0;
        for(int i=0; i<numbers.length; i++){
            sum += (double)numbers[i];
        }
        double answer = sum / numbers.length;
//        System.out.println(answer);
        return answer;
    }

}
