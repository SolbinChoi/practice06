package prob4;

public class MyStack implements Stack {
	String[] buffer = null;
	int position = -1;
	
	public MyStack(int capacity){
		buffer = new String[capacity];
	}
	public void resizeBuffer(){
		String[] temp = new String[buffer.length * 2]; // 두 배로 늘림.
		
		for(int i=0; i<=position; i++){ // 새 버퍼에 복사
			temp[i] = buffer[i];
		}
	}
	@Override
	public void push(String item) { // 헬로가 들어오면 item을 배열에 저장하기
		if(position + 1 == buffer.length){ // 현재 위치가 버퍼크기에 있으면
			resizeBuffer(); // 사이즈 업
		}
		buffer[++position] = item; // 원래대로 저장
		
	}

	

	@Override
	public String pop() throws MyStackEmptyException {
		return buffer[position--];
	}

	@Override
	public boolean isEmpty() {
	
		return false;
	}

	@Override
	public int size() {
		return 0;
	}

}
