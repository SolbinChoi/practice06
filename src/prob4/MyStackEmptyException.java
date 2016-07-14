package prob4;

public class MyStackEmptyException extends Exception {
	public MyStackEmptyException(){
		super("My stack is empty");
	}
	public MyStackEmptyException(String message){
		super(message);
	}
}
