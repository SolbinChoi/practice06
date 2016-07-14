package prob7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put( "blue", 85 );
		map.put( "red", 96 );
		map.put( "black", 92 );
		
		String name = null;   // 최고 점수를 받은 아이디 저장
		int maxScore = 0;     // 최고 점수
		int totalScore = 0;   // 점수 합계
		int temp = 0;
		/* 코드를 작성하세요 */
		//전체 순회 
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			for(int i=0; i<3; i++){
				String key = it.next();
				int value = map.get(key);
				if(maxScore<value){ // 0<85, 85 < 92, 92
					 maxScore = value;
					
					name=key;
				}
				totalScore=totalScore + value;
			}
			int average = totalScore / 3;
			System.out.println("평균점수 : "+average);
			System.out.println("최고점수: " + maxScore);
			System.out.println("최고점수받은애:"+name);
		}
	}

}
