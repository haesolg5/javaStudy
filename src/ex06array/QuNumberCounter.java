package ex06array;

public class QuNumberCounter {

	public static void main(String[] args) {
		
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		
		// 각 원소에 따라 counter증가
		for(int i = 0; i<answer.length;i++) {
			if(answer[i]==1) {		
				counter[0]++;
			}
			else if(answer[i]==2) {
				counter[1]++;
			}
			else if(answer[i]==3) {
				counter[2]++;
			}
			else {
				counter[3]++;
			}
		}
		
		for(int i = 0; i<counter.length;i++) {
			System.out.printf("counter[%d] => %d%n",i,counter[i]);
		}
	}

}
