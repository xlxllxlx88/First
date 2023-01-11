package collection.arrayList;

import java.util.ArrayList;

class MyStack {
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if(len == 0 ) { 
			System.out.println("스택 빔");
			return null;
		}
		
		return(arrayStack.remove(len-1));
	}
}

public class StackTest {

	public static void main(String[] args) {

		StackTest stack = new StackTest();
//		stack.push("A");
//		stack.push("B");
//		stack.push("C");
//		
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
	}

	
}
