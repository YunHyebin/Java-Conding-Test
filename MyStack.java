package codingTest;

import java.util.Stack;

public class MyStack extends Stack{
	//생성자
	public MyStack() {
		Stack<Integer> stack = new Stack();
		}
	
	@Override
	public Integer push(Integer item) {
		System.out.println(stack.push(item));
		return item;
	}
}
