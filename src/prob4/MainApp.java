package prob4;

public class MainApp {
	public static void main(String[] args) {
		try {
			Stack stack = new MyStack(3);
			stack.push("Hello");
			stack.push("World");
			stack.push("!!!");
			stack.push("java"); // push할때 꽉찼으면 늘려주고 다시 저장하기 
			stack.push(".");

			while (!stack.isEmpty()) {
				System.out.println(stack.pop());
			}

			stack = new MyStack(3);
			stack.push("Hello");

			System.out.println(stack.pop());
			System.out.println(stack.pop());
			
			
		} catch( MyStackEmptyException ex ) {
			System.out.println( "error:" + ex );
		}
	}
}
