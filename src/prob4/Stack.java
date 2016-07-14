package prob4;

public interface Stack { // 수정하지않음
	public void push(String item);
	public String pop() throws MyStackEmptyException;
	public boolean isEmpty();
	public int size();
}