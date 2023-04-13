package codingTest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NoSameNum<Ingeter> {

	public static void main(String[] args) {
	int arr[] = {1,1,3,3,0,1,1};
	System.out.println(Arrays.toString(solution(arr)));

	}
	
	public static int[] solution(int []arr) {
		Stack<Integer> stack = new Stack<Integer>();
		
		int current = 10;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != current) {
				stack.push((arr[i]));
				current = arr[i];
			}
		}
		
		int[] answer = new int[stack.size()];
		for(int i=answer.length-1; i >= 0; i--) {
			answer[i] = stack.pop();
		}
	 return answer;   
	}

}
